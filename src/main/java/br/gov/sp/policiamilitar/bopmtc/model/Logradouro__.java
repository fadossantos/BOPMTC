
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Endereco",
    "Numero",
    "Municipio",
    "UF",
    "Bairro",
    "Cep",
    "Complemento",
    "PontoReferencia"
})
public class Logradouro__ {

    @JsonProperty("Endereco")
    private String endereco;
    @JsonProperty("Numero")
    private Long numero;
    @JsonProperty("Municipio")
    private Municipio___ municipio;
    @JsonProperty("UF")
    private UF___ uF;
    @JsonProperty("Bairro")
    private Bairro__ bairro;
    @JsonProperty("Cep")
    private Long cep;
    @JsonProperty("Complemento")
    private String complemento;
    @JsonProperty("PontoReferencia")
    private String pontoReferencia;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Logradouro__() {
    }

    /**
     * 
     * @param bairro
     * @param complemento
     * @param cep
     * @param municipio
     * @param uF
     * @param endereco
     * @param pontoReferencia
     * @param numero
     */
    public Logradouro__(String endereco, Long numero, Municipio___ municipio, UF___ uF, Bairro__ bairro, Long cep, String complemento, String pontoReferencia) {
        super();
        this.endereco = endereco;
        this.numero = numero;
        this.municipio = municipio;
        this.uF = uF;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.pontoReferencia = pontoReferencia;
    }

    @JsonProperty("Endereco")
    public String getEndereco() {
        return endereco;
    }

    @JsonProperty("Endereco")
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @JsonProperty("Numero")
    public Long getNumero() {
        return numero;
    }

    @JsonProperty("Numero")
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @JsonProperty("Municipio")
    public Municipio___ getMunicipio() {
        return municipio;
    }

    @JsonProperty("Municipio")
    public void setMunicipio(Municipio___ municipio) {
        this.municipio = municipio;
    }

    @JsonProperty("UF")
    public UF___ getUF() {
        return uF;
    }

    @JsonProperty("UF")
    public void setUF(UF___ uF) {
        this.uF = uF;
    }

    @JsonProperty("Bairro")
    public Bairro__ getBairro() {
        return bairro;
    }

    @JsonProperty("Bairro")
    public void setBairro(Bairro__ bairro) {
        this.bairro = bairro;
    }

    @JsonProperty("Cep")
    public Long getCep() {
        return cep;
    }

    @JsonProperty("Cep")
    public void setCep(Long cep) {
        this.cep = cep;
    }

    @JsonProperty("Complemento")
    public String getComplemento() {
        return complemento;
    }

    @JsonProperty("Complemento")
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @JsonProperty("PontoReferencia")
    public String getPontoReferencia() {
        return pontoReferencia;
    }

    @JsonProperty("PontoReferencia")
    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
