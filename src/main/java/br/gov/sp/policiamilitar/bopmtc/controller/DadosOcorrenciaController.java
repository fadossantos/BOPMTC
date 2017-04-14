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
import br.gov.sp.policiamilitar.bopmtc.model.DetalheOcorrencia;
import br.gov.sp.policiamilitar.bopmtc.model.OcorrenciaPadrao;
import br.gov.sp.policiamilitar.bopmtc.model.PoliciaisMilitares;
import br.gov.sp.policiamilitar.bopmtc.services.ComplementoLocalService;
import br.gov.sp.policiamilitar.bopmtc.services.CondicoesTempoService;
import br.gov.sp.policiamilitar.bopmtc.services.DadosOcorrenciaService;
import br.gov.sp.policiamilitar.bopmtc.services.IluminacaoService;
import br.gov.sp.policiamilitar.bopmtc.services.LocalService;
import br.gov.sp.policiamilitar.bopmtc.services.NCDService;
import br.gov.sp.policiamilitar.bopmtc.services.OcorrenciaService;
import br.gov.sp.policiamilitar.bopmtc.services.PolicialMilitarService;
import br.gov.sp.policiamilitar.bopmtc.services.PosseService;



@Controller
public class DadosOcorrenciaController {

	@Autowired
	NCDService ncdService;
	
	@Autowired
	ComplementoLocalService complementoLocalService;
	
	@Autowired
	LocalService localService;
	
	@Autowired
	IluminacaoService iluminacaoService;
		

	@Autowired
	CondicoesTempoService condicoesTempoService;
	
	
	@Autowired
	PolicialMilitarService policialMilitarService;
	
	@Autowired
	OcorrenciaService ocorrenciaService;	
	
	@Autowired
	DadosOcorrenciaService dadosOcorrenciaService;	
	
	@Autowired
	PosseService posseService;	
	
	@GetMapping("/dadosOcorrencia")
	public ModelAndView obterDadosOcorrencia(HttpSession session){
		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		DetalheOcorrencia detalheOcorrencia = ocr.getDetalheOcorrencia();
		if(detalheOcorrencia == null)
		{
			detalheOcorrencia = new DetalheOcorrencia();
			detalheOcorrencia.setNcdFinal(ocr.getOrigemOcorrencia().getNcdInicial());
			detalheOcorrencia.setNcdFinalObj(ocr.getOrigemOcorrencia().getNcdInicialObj());
			detalheOcorrencia.setLogradouro(ocr.getOrigemOcorrencia().getLogradouro());
		}
		if(detalheOcorrencia.getNcdFinalObj() == null){
			System.out.print(ocr.getOrigemOcorrencia().getNcdInicial());
			detalheOcorrencia.setNcdFinal(ocr.getOrigemOcorrencia().getNcdInicial());
			detalheOcorrencia.setNcdFinalObj(ocr.getOrigemOcorrencia().getNcdInicialObj());			
		}
		if(detalheOcorrencia.getLogradouro() == null||detalheOcorrencia.getLogradouro().getEndereco() == ""){
			detalheOcorrencia.setLogradouro(ocr.getOrigemOcorrencia().getLogradouro());
		}
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		ModelAndView mav = new ModelAndView();
		detalheOcorrencia.setCodigoTempo(4L);
		mav.setViewName("ocorrencia/dadosOcorrencia/formDadosOcorrencia");
		mav.addObject("dadosPM", policiaisMilitares);
		mav.addObject("ocorrencia", ocr);
		mav.addObject("detalheOcorrencia", detalheOcorrencia);
		mav.addObject("listaNCD", this.ncdService.findByNatCod(detalheOcorrencia.getNcdFinalObj().getNatCod()));
		mav.addObject("listaNatCod", this.ncdService.findAllNatCod());
		mav.addObject("listaLocais", this.localService.findAll());
		mav.addObject("listaComplementoLocais", this.complementoLocalService.findAll());
		mav.addObject("listaCondicoesTempo", this.condicoesTempoService.findAll());
		mav.addObject("listaIluminacao", this.iluminacaoService.findAll());
		return mav;
	}
	
	@GetMapping("/dadosOcorrencia/listaNCDPorNatCod/{natCod}")
	public ModelAndView obterDadosOcorrencia(@PathVariable String natCod){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ocorrencia/dadosOcorrencia/listaNCD");
		mav.addObject("listaNCD", this.ncdService.findByNatCod(natCod));
		return mav;
	}
	
	
	@RequestMapping(value = "/dadosOcorrencia", params = { "save" }, method = RequestMethod.POST)
	public String tomarPosse(HttpSession session, @Valid DetalheOcorrencia detalheOcorrencia, final BindingResult bindingResult,
			final ModelMap model){
		PoliciaisMilitares policiaisMilitares = this.policialMilitarService.obterPolicialLogado(session, SecurityContextHolder.getContext().getAuthentication().getName());
		OcorrenciaPadrao ocr = (OcorrenciaPadrao)session.getAttribute("ocorrencia");
		if (bindingResult.hasErrors()) {
			model.addAttribute("dadosPM",policiaisMilitares);
			model.addAttribute("ocorrencia",ocr);
			System.out.println(bindingResult.toString());
			return "ocorrencia/dadosOcorrencia/formDadosOcorrencia";
		}
		ocr = this.dadosOcorrenciaService.salvarDadosOcorrencia(session, detalheOcorrencia);
		model.clear();
		model.addAttribute("dadosPM", policiaisMilitares);
		model.addAttribute("ocorrencia", ocr);		
		return "ocorrencia/envolvidos/listarEnvolvidos";
	}
	
	
}
