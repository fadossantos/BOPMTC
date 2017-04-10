
package br.gov.sp.policiamilitar.bopmtc.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Imei implements Serializable
{
	@JsonProperty("Numero")
    private String numero;
	@JsonProperty("Ativo")
    private Boolean ativo;
	@JsonProperty("DataAtivacao")
    private String dataAtivacao;
    private final static long serialVersionUID = 8813241895383511748L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Imei() {
    }

    /**
     * 
     * @param ativo
     * @param dataAtivacao
     * @param numero
     */
    public Imei(String numero, Boolean ativo, String dataAtivacao) {
        super();
        this.numero = numero;
        this.ativo = ativo;
        this.dataAtivacao = dataAtivacao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getDataAtivacao() {
        return dataAtivacao;
    }

    public void setDataAtivacao(String dataAtivacao) {
        this.dataAtivacao = dataAtivacao;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
