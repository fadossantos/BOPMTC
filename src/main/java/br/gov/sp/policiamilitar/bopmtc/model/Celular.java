
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Marca",
    "Modelo",
    "Imei"
})
public class Celular {

    @JsonProperty("Marca")
    private String marca;
    @JsonProperty("Modelo")
    private String modelo;
    @JsonProperty("Imei")
    private String imei;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Celular() {
    }

    /**
     * 
     * @param imei
     * @param marca
     * @param modelo
     */
    public Celular(String marca, String modelo, String imei) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
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

    @JsonProperty("Imei")
    public String getImei() {
        return imei;
    }

    @JsonProperty("Imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
