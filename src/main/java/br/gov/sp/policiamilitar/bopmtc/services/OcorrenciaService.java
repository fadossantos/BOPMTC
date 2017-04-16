package br.gov.sp.policiamilitar.bopmtc.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;
import br.gov.sp.policiamilitar.bopmtc.model.PoliciaisMilitares;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.NCD;

@Service
public class OcorrenciaService {
	
	@Autowired
	NCDService ncdService;

	public ArrayList<OcorrenciaPadrao> listarOcorrencias(HttpSession session) {
 		String numeroUnidadeServico = ((PoliciaisMilitares)session.getAttribute("policiaisMilitares")).getUnidadeServico().getIdentificador();
		String cadPatrulha = String.valueOf(((PoliciaisMilitares)session.getAttribute("policiaisMilitares")).getUnidadeServico().getCadPatrulha());
		final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/ocorrencia/listar?numeroUnidadeServico=" + numeroUnidadeServico + "&cadPatrulha=" + cadPatrulha;
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
		listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
		restTemplate.setInterceptors(listInterceptor);
		OcorrenciaPadrao[] listResumoOcorrencia = restTemplate.getForObject( uri, OcorrenciaPadrao[].class);
		ArrayList<OcorrenciaPadrao> listaRetorno = new ArrayList<OcorrenciaPadrao>();
		for(OcorrenciaPadrao ocr : listResumoOcorrencia)
		{
			NCD ncd = this.ncdService.findOne(ocr.getOrigemOcorrencia().getNcdInicial());
			ocr.getOrigemOcorrencia().setNcdInicialObj(ncd);
			listaRetorno.add(ocr);
		}
		session.setAttribute("listaOcorrencias", listaRetorno);
		return listaRetorno;
	}
	
	public ArrayList<OcorrenciaPadrao> obterListaDeOcorrencias(HttpSession session){
		@SuppressWarnings("unchecked")
		ArrayList<OcorrenciaPadrao> listaOcorrencias = (ArrayList<OcorrenciaPadrao>)session.getAttribute("listaOcorrencias");
		if (listaOcorrencias == null)
		{
			listaOcorrencias = listarOcorrencias(session);
		}
		return listaOcorrencias;
	}
	
	public OcorrenciaPadrao obterOcorrenciaDaLista(HttpSession session, Long dataHoraOcorrenciaAbsoluta, Long numeroOcorrencia)
	{
		OcorrenciaPadrao retorno = null;
		ArrayList<OcorrenciaPadrao> listaOcorrencias = obterListaDeOcorrencias(session);		
		for(OcorrenciaPadrao ocr : listaOcorrencias){	
			if((ocr.getDataHoraOcorrenciaAbsoluta().compareTo(dataHoraOcorrenciaAbsoluta) == 0) && (ocr.getNumeroOcorrencia().compareTo(numeroOcorrencia) == 0)){
				retorno = ocr;
				break;
			}			
		}		
		return retorno;
	}
	
	public OcorrenciaPadrao obterOcorrencia(HttpSession session)
	{
		OcorrenciaPadrao retorno = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		return retorno;
	}
	
	
	

}
