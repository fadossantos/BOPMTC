
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Sucesso",
    "Mensagem"
})
public class Operacao {

    @JsonProperty("Sucesso")
    private Boolean sucesso;
    @JsonProperty("Mensagem")
    private String mensagem;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Operacao() {
    }

    /**
     * 
     * @param mensagem
     * @param sucesso
     */
    public Operacao(Boolean sucesso, String mensagem) {
        super();
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    @JsonProperty("Sucesso")
    public Boolean getSucesso() {
        return sucesso;
    }

    @JsonProperty("Sucesso")
    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }

    @JsonProperty("Mensagem")
    public String getMensagem() {
        return mensagem;
    }

    @JsonProperty("Mensagem")
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
