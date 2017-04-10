
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UnidadeMedida",
    "Quantidade",
    "Marca",
    "Modelo"
})
public class Objeto {

    @JsonProperty("UnidadeMedida")
    private String unidadeMedida;
    @JsonProperty("Quantidade")
    private Long quantidade;
    @JsonProperty("Marca")
    private String marca;
    @JsonProperty("Modelo")
    private String modelo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Objeto() {
    }

    /**
     * 
     * @param unidadeMedida
     * @param quantidade
     * @param marca
     * @param modelo
     */
    public Objeto(String unidadeMedida, Long quantidade, String marca, String modelo) {
        super();
        this.unidadeMedida = unidadeMedida;
        this.quantidade = quantidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    @JsonProperty("UnidadeMedida")
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    @JsonProperty("UnidadeMedida")
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @JsonProperty("Quantidade")
    public Long getQuantidade() {
        return quantidade;
    }

    @JsonProperty("Quantidade")
    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    @JsonProperty("Marca")
    public String getMarca() {
        return marca;
    }

    @JsonProperty("Marca")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @JsonProperty("Modelo")
    public String getModelo() {
        return modelo;
    }

    @JsonProperty("Modelo")
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
