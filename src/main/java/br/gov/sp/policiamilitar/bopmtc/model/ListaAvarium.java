
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Codigo",
    "Resposta"
})
public class ListaAvarium {

    @JsonProperty("Codigo")
    private Long codigo;
    @JsonProperty("Resposta")
    private String resposta;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListaAvarium() {
    }

    /**
     * 
     * @param codigo
     * @param resposta
     */
    public ListaAvarium(Long codigo, String resposta) {
        super();
        this.codigo = codigo;
        this.resposta = resposta;
    }

    @JsonProperty("Codigo")
    public Long getCodigo() {
        return codigo;
    }

    @JsonProperty("Codigo")
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("Resposta")
    public String getResposta() {
        return resposta;
    }

    @JsonProperty("Resposta")
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
