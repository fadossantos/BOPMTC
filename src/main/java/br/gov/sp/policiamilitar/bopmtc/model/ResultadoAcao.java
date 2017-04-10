
package br.gov.sp.policiamilitar.bopmtc.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoAcao implements Serializable
{
	@JsonProperty("Sucesso")
    private Boolean sucesso;
	@JsonProperty("Mensagem")
    private String mensagem;
    private final static long serialVersionUID = 4888338817030715056L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResultadoAcao() {
    }

    /**
     * 
     * @param mensagem
     * @param sucesso
     */
    public ResultadoAcao(Boolean sucesso, String mensagem) {
        super();
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
