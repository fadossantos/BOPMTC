package br.gov.sp.policiamilitar.bopmtc.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;

@Service
public class OcorrenciaService {

	public OcorrenciaPadrao[] listarOcorrencias(HttpSession session, String codigoPatrulha, String cadPatrulha, String cadOcorrencia) {
		final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/ocorrencia/listar?codigoPatrulha=" + codigoPatrulha + "&cadPatrulha=" + cadPatrulha + "&cadOcorrencia="+ cadOcorrencia;
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
		String tok = (String)session.getAttribute("Token");
		System.out.println(tok);
		listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
		restTemplate.setInterceptors(listInterceptor);
		OcorrenciaPadrao[] listResumoOcorrencia = restTemplate.getForObject( uri, OcorrenciaPadrao[].class);
	    for (OcorrenciaPadrao ocrPadrao : listResumoOcorrencia)
	    {
	    System.out.println(ocrPadrao);
	    }
		return listResumoOcorrencia;
	}

}
