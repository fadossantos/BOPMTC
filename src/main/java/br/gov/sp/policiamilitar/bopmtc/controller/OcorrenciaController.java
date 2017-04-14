package br.gov.sp.policiamilitar.bopmtc.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;
import br.gov.sp.policiamilitar.bopmtc.model.PoliciaisMilitares;
import br.gov.sp.policiamilitar.bopmtc.services.OcorrenciaService;
import br.gov.sp.policiamilitar.bopmtc.services.PolicialMilitarService;
import br.gov.sp.policiamilitar.bopmtc.services.PosseService;



@Controller
public class OcorrenciaController {

	@Autowired
	PolicialMilitarService policialMilitarService;
	
	@Autowired
	OcorrenciaService ocorrenciaService;	

	@Autowired
	PosseService posseService;	
	
	@GetMapping("/ocorrencia/obter/{dataHoraOcorrenciaAbsoluta}/{numeroOcorrencia}")
	public ModelAndView obterOcorrenciaDaLista(HttpSession session, @PathVariable Long dataHoraOcorrenciaAbsoluta, @PathVariable Long numeroOcorrencia){
		OcorrenciaPadrao ocr = this.ocorrenciaService.obterOcorrenciaDaLista(session,dataHoraOcorrenciaAbsoluta, numeroOcorrencia);
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ocorrencia/detalheOcorrencia");
		mav.addObject("dadosPM", policiaisMilitares);
		mav.addObject("ocorrencia", ocr);	
		return mav;
	}
	
	@GetMapping("/ocorrencia/listar")
	public ModelAndView listarOcorrencias(HttpSession session){
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		ArrayList<OcorrenciaPadrao> listaOcorrencias = this.ocorrenciaService.listarOcorrencias(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ocorrencia/listarOcorrencias");
		mav.addObject("dadosPM", policiaisMilitares);
		mav.addObject("listaOcorrencias", listaOcorrencias);	
		return mav;
	}
	
	@GetMapping("/ocorrencia/tomarPosse/{dataHoraOcorrenciaAbsoluta}/{numeroOcorrencia}")
	public ModelAndView tomarPosse(HttpSession session, @PathVariable Long dataHoraOcorrenciaAbsoluta, @PathVariable Long numeroOcorrencia){
		OcorrenciaPadrao ocr = this.posseService.tomarPosse(session,dataHoraOcorrenciaAbsoluta, numeroOcorrencia);
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/dadosOcorrencia");
		return mav;
	}
	
	
}
