
package br.gov.sp.policiamilitar.bopmtc.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Token implements Serializable
{
	@JsonProperty("Value")
    private String value;
	@JsonProperty("DataExpiracao")
    private String dataExpiracao;
    private final static long serialVersionUID = -5065492013326072455L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Token() {
    }

    /**
     * 
     * @param dataExpiracao
     * @param value
     */
    public Token(String value, String dataExpiracao) {
        super();
        this.value = value;
        this.dataExpiracao = dataExpiracao;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
