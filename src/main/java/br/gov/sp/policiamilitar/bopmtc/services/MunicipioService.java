package br.gov.sp.policiamilitar.bopmtc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.Municipio;

@Service
public class MunicipioService {

	  public Iterable<Municipio> findAll(HttpSession session) {
		    final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/dominio/municipio/listar";
			RestTemplate restTemplate = new RestTemplate();
			List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
			listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
			restTemplate.setInterceptors(listInterceptor);
			Municipio[] arrayRetorno = restTemplate.getForObject( uri, Municipio[].class);
			return Arrays.asList(arrayRetorno);
	    }   	
}
