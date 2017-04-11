
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodigoPatrimonio",
    "Prefixo",
    "Placa"
})
public class Viatura {

    @JsonProperty("CodigoPatrimonio")
    private int codigoPatrimonio;
    @JsonProperty("Prefixo")
    private String prefixo;
    @JsonProperty("Placa")
    private String placa;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Viatura() {
    }

    /**
     * 
     * @param prefixo
     * @param placa
     * @param codigoPatrimonio
     */
    public Viatura(int codigoPatrimonio, String prefixo, String placa) {
        super();
        this.codigoPatrimonio = codigoPatrimonio;
        this.prefixo = prefixo;
        this.placa = placa;
    }

    @JsonProperty("CodigoPatrimonio")
    public int getCodigoPatrimonio() {
        return codigoPatrimonio;
    }

    @JsonProperty("CodigoPatrimonio")
    public void setCodigoPatrimonio(int codigoPatrimonio) {
        this.codigoPatrimonio = codigoPatrimonio;
    }

    @JsonProperty("Prefixo")
    public String getPrefixo() {
        return prefixo;
    }

    @JsonProperty("Prefixo")
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    @JsonProperty("Placa")
    public String getPlaca() {
        return placa;
    }

    @JsonProperty("Placa")
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
