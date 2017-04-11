package br.gov.sp.policiamilitar.bopmtc.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.PoliciaisMilitares;

@Service
public class PolicialMilitarService {

	public PoliciaisMilitares obterPolicialLogado(HttpSession session, String cpf) {
		boolean getTurno = true;
		boolean getFoto = true;
		boolean getUnidadeServico = true;
		final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/policialMilitar/obter?CPF=" + cpf + "&foto=" + getFoto+ "&unidadeServico=" + getUnidadeServico + "&turno=" + getTurno;
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
		//String tok = (String)session.getAttribute("Token");
		//System.out.println(tok);
		listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
		restTemplate.setInterceptors(listInterceptor);
		PoliciaisMilitares retorno = restTemplate.getForObject( uri, PoliciaisMilitares.class);
	   // System.out.println(retorno.toString());
		return retorno;
	}

}
