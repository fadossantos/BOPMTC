package br.gov.sp.policiamilitar.bopmtc.services;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.Envolvido;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;

@Service
public class EnvolvidoService {	
	
	public Envolvido obterEnvolvido(HttpSession session, Long codigoSequencial)
	{
		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		Envolvido retorno = null;
		for(Envolvido env: ocr.getEnvolvidos())
		{
			if(env.getCodigoSequencial().compareTo(codigoSequencial)==0)
			{
				retorno = env;
				break;
			}
		} 
		return retorno;
	}

	public void salvarDadosEnvolvido(HttpSession session, Envolvido envolvido) {
		// TODO Auto-generated method stub
		
	}

	public Envolvido pesquisarEnvolvido(String tipoPesquisa, String parametro1, String parametro2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
