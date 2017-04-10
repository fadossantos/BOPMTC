package br.gov.sp.policiamilitar.bopmtc.security;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import br.gov.sp.policiamilitar.bopmtc.model.Autenticacao;
import br.gov.sp.policiamilitar.bopmtc.model.Permissao;
import br.gov.sp.policiamilitar.bopmtc.services.AutenticacaoService;


@Component
public class WSAuthenticationManager implements AuthenticationProvider{

	@Autowired
	AutenticacaoService autenticacaoService;
		
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		String username = auth.getName();
        String password = auth.getCredentials().toString();
        String imei = "358550060023621";
        
        ServletRequestAttributes attr = (ServletRequestAttributes) 
        	    RequestContextHolder.currentRequestAttributes();
        	HttpSession session = attr.getRequest().getSession(true);
       
        Autenticacao autenticacao = autenticacaoService.autenticar(username, password, imei);
        
        if (!autenticacao.getResultadoAcao().getSucesso()) {
            throw new BadCredentialsException(autenticacao.getResultadoAcao().getMensagem());
        }
                   
		//List<Permissao> listaPermissoes = autenticacao.getPermissoes();
        //List<GrantedAuthority> grantedAuths = new ArrayList<>();
        //for(Permissao perm : listaPermissoes)
        //{
        //	grantedAuths.add(new SimpleGrantedAuthority(perm.getDescPermissao()));
        //}
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        session.setAttribute("Token", autenticacao.getToken().getValue());
        return new UsernamePasswordAuthenticationToken(autenticacao.getCPF(), "", grantedAuths);
				
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
