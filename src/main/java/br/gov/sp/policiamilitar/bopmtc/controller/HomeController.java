package br.gov.sp.policiamilitar.bopmtc.controller;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.policiamilitar.bopmtc.model.RequestUser;
import br.gov.sp.policiamilitar.bopmtc.services.OcorrenciaService;
import br.gov.sp.policiamilitar.bopmtc.mail.SmtpMailSender;



@Controller
public class HomeController {

	@Autowired
	SmtpMailSender smtpMailSender;
	
	@Autowired
	OcorrenciaService ocorrenciaService;
	
	@GetMapping("")
	public ModelAndView home(HttpSession session){
		String codPtr = "07010";
		String cadPatrulha = "1";
		String cadOcorrencia = "1";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("listaOcorrencias", this.ocorrenciaService.listarOcorrencias(session, codPtr, cadPatrulha, cadOcorrencia));		
		return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView login() {		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		mav.addObject("formLogin", new RequestUser());
		mav.addObject("message", "");
		return mav;
	}
	
	@GetMapping("/exibeMenuSuperior")
	public ModelAndView exibeMenuSuperior() {		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("fragments/_menuSuperior");
		return mav;
	}
	
	@GetMapping("/exibeMenuLateral")
	public ModelAndView exibeMenuLateral() {		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("fragments/_menuLateral");
		return mav;
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
	
	@RequestMapping(value="/enviaemail", method = RequestMethod.GET)
	public String enviaemail (HttpServletRequest request, HttpServletResponse response) {
	    try {
			smtpMailSender.send("denizeom@gmail.com", "teste de envio email", "Te amoooooooooooooooooooooooooooooooo");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return "redirect:/";
	}
	
}
