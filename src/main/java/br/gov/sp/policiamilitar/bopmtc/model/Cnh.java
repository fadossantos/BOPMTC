
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NumeroRegistro",
    "Categoria",
    "DataVencimento"
})
public class Cnh {

    @JsonProperty("NumeroRegistro")
    private String numeroRegistro;
    @JsonProperty("Categoria")
    private String categoria;
    @JsonProperty("DataVencimento")
    private String dataVencimento;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cnh() {
    }

    /**
     * 
     * @param categoria
     * @param numeroRegistro
     * @param dataVencimento
     */
    public Cnh(String numeroRegistro, String categoria, String dataVencimento) {
        super();
        this.numeroRegistro = numeroRegistro;
        this.categoria = categoria;
        this.dataVencimento = dataVencimento;
    }

    @JsonProperty("NumeroRegistro")
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    @JsonProperty("NumeroRegistro")
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @JsonProperty("Categoria")
    public String getCategoria() {
        return categoria;
    }

    @JsonProperty("Categoria")
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @JsonProperty("DataVencimento")
    public String getDataVencimento() {
        return dataVencimento;
    }

    @JsonProperty("DataVencimento")
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
