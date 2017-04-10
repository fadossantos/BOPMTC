
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodigoSequencial",
    "Tipo",
    "Telefone",
    "NomeContato",
    "Logradouro"
})
public class Contato {

    @JsonProperty("CodigoSequencial")
    private Long codigoSequencial;
    @JsonProperty("Tipo")
    private String tipo;
    @JsonProperty("Telefone")
    private Long telefone;
    @JsonProperty("NomeContato")
    private String nomeContato;
    @JsonProperty("Logradouro")
    private Logradouro logradouro;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Contato() {
    }

    /**
     * 
     * @param codigoSequencial
     * @param telefone
     * @param tipo
     * @param logradouro
     * @param nomeContato
     */
    public Contato(Long codigoSequencial, String tipo, Long telefone, String nomeContato, Logradouro logradouro) {
        super();
        this.codigoSequencial = codigoSequencial;
        this.tipo = tipo;
        this.telefone = telefone;
        this.nomeContato = nomeContato;
        this.logradouro = logradouro;
    }

    @JsonProperty("CodigoSequencial")
    public Long getCodigoSequencial() {
        return codigoSequencial;
    }

    @JsonProperty("CodigoSequencial")
    public void setCodigoSequencial(Long codigoSequencial) {
        this.codigoSequencial = codigoSequencial;
    }

    @JsonProperty("Tipo")
    public String getTipo() {
        return tipo;
    }

    @JsonProperty("Tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("Telefone")
    public Long getTelefone() {
        return telefone;
    }

    @JsonProperty("Telefone")
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    @JsonProperty("NomeContato")
    public String getNomeContato() {
        return nomeContato;
    }

    @JsonProperty("NomeContato")
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @JsonProperty("Logradouro")
    public Logradouro getLogradouro() {
        return logradouro;
    }

    @JsonProperty("Logradouro")
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
