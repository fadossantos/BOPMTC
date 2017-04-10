package br.gov.sp.policiamilitar.bopmtc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.gov.sp.policiamilitar.bopmtc.conversion.CurrencyFormatter;
import br.gov.sp.policiamilitar.bopmtc.conversion.DateFormatter;

@Configuration
public class BOPMTCWebConfig extends WebMvcConfigurerAdapter{

	public BOPMTCWebConfig() {
		super();
	}

	@Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        return mapper;
    }
	
	@Bean
	public DateFormatter dateFormatter() {
		return new DateFormatter();
	}
	
	@Bean 
	public CurrencyFormatter currencyFormatter(){
		return new CurrencyFormatter();
	}

	 @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	  }

}
