package br.gov.sp.policiamilitar.bopmtc.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.model.Autenticacao;
import br.gov.sp.policiamilitar.bopmtc.model.Imei;
import br.gov.sp.policiamilitar.bopmtc.model.ResultadoAcao;
import br.gov.sp.policiamilitar.bopmtc.model.Token;

@Service
public class AutenticacaoService {

	public Autenticacao autenticar(String username, String password, String imei) {
		final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/usuario/autenticacao/obter";
		 
	    Autenticacao autenticacao = new Autenticacao(username, password, new Imei(imei,true, ""), new Token(), new ResultadoAcao());
	 
	    RestTemplate restTemplate = new RestTemplate();
	    Autenticacao autenticacaoResult = restTemplate.postForObject( uri, autenticacao, Autenticacao.class);
	 
	   // System.out.println(autenticacaoResult);
		
		return autenticacaoResult;
	}

}
