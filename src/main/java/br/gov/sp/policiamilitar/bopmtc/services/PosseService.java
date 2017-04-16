package br.gov.sp.policiamilitar.bopmtc.services;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;
import br.gov.sp.policiamilitar.bopmtc.model.PoliciaisMilitares;

@Service
public class PosseService {

	@Autowired
	private OcorrenciaService ocorrenciaService;
	
	@Autowired
	private NCDService ncdService;

	public OcorrenciaPadrao tomarPosse(HttpSession session, Long dataHoraOcorrenciaAbsoluta, Long numeroOcorrencia){
		OcorrenciaPadrao ocr = this.ocorrenciaService.obterOcorrenciaDaLista(session, dataHoraOcorrenciaAbsoluta, numeroOcorrencia);
		PoliciaisMilitares pm = (PoliciaisMilitares) session.getAttribute("policiaisMilitares");
		String imei = "358550060023621";
		
		StringBuilder uri = new StringBuilder(
				"http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/ocorrencia/posse/obter?");
		uri.append("dataOcorrencia=" + ocr.getDataHoraOcorrencia().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")));
		uri.append("&numeroOcorrencia=" + ocr.getNumeroOcorrencia());
		uri.append("&cadOcorrencia=" + ocr.getCadOcorrencia());
		uri.append("&cadPatrulha=" + pm.getUnidadeServico().getCadPatrulha());
		uri.append("&numeroUnidadeServico=" + pm.getUnidadeServico().getIdentificador());
		uri.append("&rePatrulheiro=" + pm.getRE());
		uri.append("&cpfPatrulheiro=" + SecurityContextHolder.getContext().getAuthentication().getName());
		uri.append("&imei=" + imei);
		uri.append("&codigoServico=" + "2");
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
		listInterceptor.add(new HeaderRequestInterceptor("Token", (String) session.getAttribute("Token")));
		restTemplate.setInterceptors(listInterceptor);
		OcorrenciaPadrao retorno = restTemplate.getForObject(uri.toString(), OcorrenciaPadrao.class);
		retorno.getDetalheOcorrencia().setNcdFinalObj(this.ncdService.findOne(retorno.getDetalheOcorrencia().getNcdFinal()));
		retorno.getOrigemOcorrencia().setNcdInicialObj(this.ncdService.findOne(retorno.getOrigemOcorrencia().getNcdInicial()));
		session.setAttribute("ocorrencia", retorno);
		return retorno;
	}
}
