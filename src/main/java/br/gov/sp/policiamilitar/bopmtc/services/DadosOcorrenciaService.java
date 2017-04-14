package br.gov.sp.policiamilitar.bopmtc.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.DetalheOcorrencia;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;

@Service
public class DadosOcorrenciaService {
	
	@Autowired
	PosseService posseService;

	public OcorrenciaPadrao salvarDadosOcorrencia(HttpSession session, DetalheOcorrencia detalheOcorrencia) {
 		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
 		ocr.setDetalheOcorrencia(detalheOcorrencia);
		final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/ocorrencia/gravar";
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
		listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
		restTemplate.setInterceptors(listInterceptor);
		OcorrenciaPadrao retornoOcorrencia = restTemplate.postForObject(uri, ocr, OcorrenciaPadrao.class);
		OcorrenciaPadrao retornoOcorrenciaPosse = this.posseService.tomarPosse(session, ocr.getDataHoraOcorrenciaAbsoluta(), ocr.getNumeroOcorrencia());
		session.setAttribute("ocorrencia", retornoOcorrenciaPosse);
		return retornoOcorrenciaPosse;
	}	
}
