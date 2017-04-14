package br.gov.sp.policiamilitar.bopmtc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.CondicaoVeiculo;

@Service
public class CondicaoVeiculoService {

	  public Iterable<CondicaoVeiculo> findAll(HttpSession session) {
		    final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/dominio/condicaoVeiculo/listar";
			RestTemplate restTemplate = new RestTemplate();
			List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
			listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
			restTemplate.setInterceptors(listInterceptor);
			CondicaoVeiculo[] arrayRetorno = restTemplate.getForObject( uri, CondicaoVeiculo[].class);
			return Arrays.asList(arrayRetorno);
	    }   	
}
