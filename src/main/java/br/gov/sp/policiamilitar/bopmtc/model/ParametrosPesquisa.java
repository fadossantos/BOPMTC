
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TipoPesquisa",
    "Parametro1",
    "Parametro2",
    "Parametro3"
})
public class ParametrosPesquisa {

    @JsonProperty("TipoPesquisa")
    private int tipoPesquisa;
    @JsonProperty("Parametro1")
    private String parametro1;
    @JsonProperty("Parametro2")
    private String parametro2;
    @JsonProperty("Parametro3")
    private String parametro3;
    
    
    /**
     * No args constructor for use in serialization
     * 
     */
    public ParametrosPesquisa() {
    }

   
    public ParametrosPesquisa(int i) {
		this.setTipoPesquisa(i);
		this.setParametro1("");
		this.setParametro2("");
		this.setParametro3("");		
	}


	@JsonProperty("TipoPesquisa")
    public int getTipoPesquisa() {
        return tipoPesquisa;
    }

    @JsonProperty("TipoPesquisa")
    public void setTipoPesquisa(int tipoPesquisa) {
        this.tipoPesquisa = tipoPesquisa;
    }

    @JsonProperty("Parametro1")
    public String getParametro1() {
		return parametro1;
	}

    @JsonProperty("Parametro1")
	public void setParametro1(String parametro1) {
		this.parametro1 = parametro1;
	}

    @JsonProperty("Parametro2")
	public String getParametro2() {
		return parametro2;
	}

    @JsonProperty("Parametro2")
	public void setParametro2(String parametro2) {
		this.parametro2 = parametro2;
	}

    @JsonProperty("Parametro3")
	public String getParametro3() {
		return parametro3;
	}

    @JsonProperty("Parametro3")
	public void setParametro3(String parametro3) {
		this.parametro3 = parametro3;
	}


	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
