package br.gov.sp.policiamilitar.bopmtc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.UF;

@Service
public class UFService {

	  public Iterable<UF> findAll(HttpSession session) {
		    final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/dominio/uf/listar";
			RestTemplate restTemplate = new RestTemplate();
			List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
			listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
			restTemplate.setInterceptors(listInterceptor);
			UF[] arrayRetorno = restTemplate.getForObject( uri, UF[].class);
			return Arrays.asList(arrayRetorno);
	    }   	
}
