package br.gov.sp.policiamilitar.bopmtc.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.policiamilitar.bopmtc.model.Envolvido;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;
import br.gov.sp.policiamilitar.bopmtc.model.PoliciaisMilitares;
import br.gov.sp.policiamilitar.bopmtc.services.EnvolvidoService;
import br.gov.sp.policiamilitar.bopmtc.services.OcorrenciaService;
import br.gov.sp.policiamilitar.bopmtc.services.PolicialMilitarService;



@Controller
public class EnvolvidosController {

	
	@Autowired
	PolicialMilitarService policialMilitarService;
	
	@Autowired
	OcorrenciaService ocorrenciaService;	
	
	@Autowired
	EnvolvidoService envolvidoService;
	
	@GetMapping("/envolvidos/listarEnvolvidos")
	public ModelAndView listarEnvolvidos(HttpSession session){
		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ocorrencia/envolvidos/listarEnvolvidos");
		mav.addObject("dadosPM", policiaisMilitares);
		mav.addObject("ocorrencia", ocr);
		return mav;
	}
	
	@GetMapping("/envolvidos/obter/{codigoSequencial}")
	public ModelAndView obterEnvolvido(HttpSession session, @PathVariable Long codigoSequencial){
		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		Envolvido env = this.envolvidoService.obterEnvolvido(session, codigoSequencial);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ocorrencia/envolvidos/formDadosEnvolvido");
		mav.addObject("dadosPM", policiaisMilitares);
		mav.addObject("ocorrencia", ocr);
		mav.addObject("envolvido", env);
		return mav;
	}
	
	@GetMapping("/envolvidos/pesquisar")
	public ModelAndView exibirPesquisaEnvolvido(HttpSession session){
		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ocorrencia/envolvidos/pesquisarEnvolvido");
		mav.addObject("dadosPM", policiaisMilitares);
		mav.addObject("ocorrencia", ocr);
		return mav;
	}
	
	
	@RequestMapping(value = "/envolvidos/salvar", method = RequestMethod.POST)
	public String tomarPosse(HttpSession session, @Valid Envolvido envolvido, final BindingResult bindingResult,
			final ModelMap model){
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		if (bindingResult.hasErrors()) {
			model.addAttribute("dadosPM",policiaisMilitares);
			model.addAttribute("ocorrencia",ocr);
			System.out.println(bindingResult.toString());
			return "ocorrencia/envolvidos/formDadosEnvolvido";
		}
		this.envolvidoService.salvarDadosEnvolvido(session, envolvido);
		model.clear();
		return "redirect:/envolvidos/listarEnvolvidos";
	}
	
	
}
