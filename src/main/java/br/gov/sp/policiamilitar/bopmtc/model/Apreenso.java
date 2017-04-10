
package br.gov.sp.policiamilitar.bopmtc.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodigoSequencial",
    "CodigoSequencialEnvolvido",
    "CodigoServico",
    "CodigoSituacaoOcorrencia",
    "CodigoTipoApreensao",
    "DestinoApreensao",
    "CodigoObjeto",
    "Arma",
    "Celular",
    "Entorpecentes",
    "Objeto"
})
public class Apreenso {

    @JsonProperty("CodigoSequencial")
    private Long codigoSequencial;
    @JsonProperty("CodigoSequencialEnvolvido")
    private Long codigoSequencialEnvolvido;
    @JsonProperty("CodigoServico")
    private Long codigoServico;
    @JsonProperty("CodigoSituacaoOcorrencia")
    private Long codigoSituacaoOcorrencia;
    @JsonProperty("CodigoTipoApreensao")
    private String codigoTipoApreensao;
    @JsonProperty("DestinoApreensao")
    private String destinoApreensao;
    @JsonProperty("CodigoObjeto")
    private Long codigoObjeto;
    @JsonProperty("Arma")
    private Arma arma;
    @JsonProperty("Celular")
    private Celular celular;
    @JsonProperty("Entorpecentes")
    private Entorpecentes entorpecentes;
    @JsonProperty("Objeto")
    private Objeto objeto;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Apreenso() {
    }

    /**
     * 
     * @param codigoServico
     * @param entorpecentes
     * @param codigoSituacaoOcorrencia
     * @param destinoApreensao
     * @param codigoSequencial
     * @param objeto
     * @param arma
     * @param codigoTipoApreensao
     * @param codigoSequencialEnvolvido
     * @param codigoObjeto
     * @param celular
     */
    public Apreenso(Long codigoSequencial, Long codigoSequencialEnvolvido, Long codigoServico, Long codigoSituacaoOcorrencia, String codigoTipoApreensao, String destinoApreensao, Long codigoObjeto, Arma arma, Celular celular, Entorpecentes entorpecentes, Objeto objeto) {
        super();
        this.codigoSequencial = codigoSequencial;
        this.codigoSequencialEnvolvido = codigoSequencialEnvolvido;
        this.codigoServico = codigoServico;
        this.codigoSituacaoOcorrencia = codigoSituacaoOcorrencia;
        this.codigoTipoApreensao = codigoTipoApreensao;
        this.destinoApreensao = destinoApreensao;
        this.codigoObjeto = codigoObjeto;
        this.arma = arma;
        this.celular = celular;
        this.entorpecentes = entorpecentes;
        this.objeto = objeto;
    }

    @JsonProperty("CodigoSequencial")
    public Long getCodigoSequencial() {
        return codigoSequencial;
    }

    @JsonProperty("CodigoSequencial")
    public void setCodigoSequencial(Long codigoSequencial) {
        this.codigoSequencial = codigoSequencial;
    }

    @JsonProperty("CodigoSequencialEnvolvido")
    public Long getCodigoSequencialEnvolvido() {
        return codigoSequencialEnvolvido;
    }

    @JsonProperty("CodigoSequencialEnvolvido")
    public void setCodigoSequencialEnvolvido(Long codigoSequencialEnvolvido) {
        this.codigoSequencialEnvolvido = codigoSequencialEnvolvido;
    }

    @JsonProperty("CodigoServico")
    public Long getCodigoServico() {
        return codigoServico;
    }

    @JsonProperty("CodigoServico")
    public void setCodigoServico(Long codigoServico) {
        this.codigoServico = codigoServico;
    }

    @JsonProperty("CodigoSituacaoOcorrencia")
    public Long getCodigoSituacaoOcorrencia() {
        return codigoSituacaoOcorrencia;
    }

    @JsonProperty("CodigoSituacaoOcorrencia")
    public void setCodigoSituacaoOcorrencia(Long codigoSituacaoOcorrencia) {
        this.codigoSituacaoOcorrencia = codigoSituacaoOcorrencia;
    }

    @JsonProperty("CodigoTipoApreensao")
    public String getCodigoTipoApreensao() {
        return codigoTipoApreensao;
    }

    @JsonProperty("CodigoTipoApreensao")
    public void setCodigoTipoApreensao(String codigoTipoApreensao) {
        this.codigoTipoApreensao = codigoTipoApreensao;
    }

    @JsonProperty("DestinoApreensao")
    public String getDestinoApreensao() {
        return destinoApreensao;
    }

    @JsonProperty("DestinoApreensao")
    public void setDestinoApreensao(String destinoApreensao) {
        this.destinoApreensao = destinoApreensao;
    }

    @JsonProperty("CodigoObjeto")
    public Long getCodigoObjeto() {
        return codigoObjeto;
    }

    @JsonProperty("CodigoObjeto")
    public void setCodigoObjeto(Long codigoObjeto) {
        this.codigoObjeto = codigoObjeto;
    }

    @JsonProperty("Arma")
    public Arma getArma() {
        return arma;
    }

    @JsonProperty("Arma")
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @JsonProperty("Celular")
    public Celular getCelular() {
        return celular;
    }

    @JsonProperty("Celular")
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @JsonProperty("Entorpecentes")
    public Entorpecentes getEntorpecentes() {
        return entorpecentes;
    }

    @JsonProperty("Entorpecentes")
    public void setEntorpecentes(Entorpecentes entorpecentes) {
        this.entorpecentes = entorpecentes;
    }

    @JsonProperty("Objeto")
    public Objeto getObjeto() {
        return objeto;
    }

    @JsonProperty("Objeto")
    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
