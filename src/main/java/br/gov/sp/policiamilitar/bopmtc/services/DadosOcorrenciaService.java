package br.gov.sp.policiamilitar.bopmtc.services;

import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.sp.policiamilitar.bopmtc.interceptors.HeaderRequestInterceptor;
import br.gov.sp.policiamilitar.bopmtc.model.DetalheOcorrencia;
import br.gov.sp.policiamilitar.bopmtc.model.Municipio;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;
import br.gov.sp.policiamilitar.bopmtc.model.UF;

@Service
public class DadosOcorrenciaService {
	
	@Autowired
	PosseService posseService;
	
	@Autowired
	OcorrenciaService ocorrenciaService;

	public OcorrenciaPadrao salvarDadosOcorrencia(HttpSession session, DetalheOcorrencia detalheOcorrencia) {
 		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
 		
		final String uri = "http://homologa.policiamilitar.sp.gov.br/BOPMTC.ModuloExterno/api/externo/ocorrencia/gravar";
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> listInterceptor = new ArrayList<ClientHttpRequestInterceptor>();
		listInterceptor.add(new HeaderRequestInterceptor("Token", (String)session.getAttribute("Token")));
		restTemplate.setInterceptors(listInterceptor);
		
		//CAMPOS FORCADOS -- CONFIRMAR NECESSIDADE
		OcorrenciaPadrao ocr2 = this.ocorrenciaService.obterOcorrenciaDaLista(session, ocr.getDataHoraOcorrenciaAbsoluta(), ocr.getNumeroOcorrencia());
		detalheOcorrencia.getLogradouro().getBairro().setCodigo(0L);
		detalheOcorrencia.getLogradouro().setMunicipio(new Municipio());
		detalheOcorrencia.getLogradouro().getMunicipio().setDescricao("São Paulo");
		detalheOcorrencia.getLogradouro().getMunicipio().setCodigo(3550308L);
		detalheOcorrencia.getLogradouro().setUF(new UF("SP","São Paulo"));
		detalheOcorrencia.getLogradouro().setCep(0L);
		detalheOcorrencia.getLogradouro().setPontoReferencia("");
		detalheOcorrencia.setDataHoraChegadaLocal(detalheOcorrencia.getDataHoraFato());
		detalheOcorrencia.setDataHoraSaidaFinal(detalheOcorrencia.getDataHoraFato());
		detalheOcorrencia.setCodigoLocalDetalhe(0L);
		detalheOcorrencia.setCodigoSemaforo(0L);
		detalheOcorrencia.setCodigoCondicaoPista(0L);
		detalheOcorrencia.setCodigoTipoTrecho(0L);
		detalheOcorrencia.setLatitudeFinal(0L);
		detalheOcorrencia.setLongitudeFinal(0L);
		ocr.setOrigemOcorrencia(ocr2.getOrigemOcorrencia());
		ocr.getProprietarioOcorrencia().setNomePatrulheiro("FERNANDO ANDRADE DOS SANTOS");
		
		//SETA O DETALHE A SER ENVIADO
		ocr.setDetalheOcorrencia(detalheOcorrencia);
		
		//LIMPA ENVOLVIDOS E VEICULOS
		ocr.getEnvolvidos().clear();
		ocr.getVeiculos().clear();
		
		
		restTemplate.postForObject(uri, ocr, OcorrenciaPadrao.class);
		OcorrenciaPadrao retornoOcorrenciaPosse = this.posseService.tomarPosse(session, ocr.getDataHoraOcorrencia().toEpochSecond(ZoneOffset.ofTotalSeconds(0)), ocr.getNumeroOcorrencia());
		return retornoOcorrenciaPosse;
	}	
}
