
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodigoSequencial",
    "CodigoSequencialEnvolvido",
    "CodigoServico",
    "SituacaoOcorrencia",
    "CodigoTipoApreensao",
    "DestinoApreensao",
    "ObjetoSiopm",
    "Lacre",
    "Arma",
    "Celular",
    "Entorpecentes",
    "Objeto"
})
public class Apreensao {

    @JsonProperty("CodigoSequencial")
    private Long codigoSequencial;
    @JsonProperty("CodigoSequencialEnvolvido")
    private Long codigoSequencialEnvolvido;
    @JsonProperty("CodigoServico")
    private Long codigoServico;
    @JsonProperty("SituacaoOcorrencia")
    private SituacaoOcorrencia situacaoOcorrencia;
    @JsonProperty("CodigoTipoApreensao")
    private String codigoTipoApreensao;
    @JsonProperty("DestinoApreensao")
    private DestinoApreensao destinoApreensao;
    @JsonProperty("ObjetoSiopm")
    private ObjetoSiopm objetoSiopm;
    @JsonProperty("Lacre")
    private String lacre;
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
    public Apreensao() {
    }

    /**
     * 
     * @param codigoServico
     * @param situacaoOcorrencia
     * @param entorpecentes
     * @param destinoApreensao
     * @param codigoSequencial
     * @param objeto
     * @param arma
     * @param codigoTipoApreensao
     * @param codigoSequencialEnvolvido
     * @param lacre
     * @param objetoSiopm
     * @param celular
     */
    public Apreensao(Long codigoSequencial, Long codigoSequencialEnvolvido, Long codigoServico, SituacaoOcorrencia situacaoOcorrencia, String codigoTipoApreensao, DestinoApreensao destinoApreensao, ObjetoSiopm objetoSiopm, String lacre, Arma arma, Celular celular, Entorpecentes entorpecentes, Objeto objeto) {
        super();
        this.codigoSequencial = codigoSequencial;
        this.codigoSequencialEnvolvido = codigoSequencialEnvolvido;
        this.codigoServico = codigoServico;
        this.situacaoOcorrencia = situacaoOcorrencia;
        this.codigoTipoApreensao = codigoTipoApreensao;
        this.destinoApreensao = destinoApreensao;
        this.objetoSiopm = objetoSiopm;
        this.lacre = lacre;
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

    @JsonProperty("SituacaoOcorrencia")
    public SituacaoOcorrencia getSituacaoOcorrencia() {
        return situacaoOcorrencia;
    }

    @JsonProperty("SituacaoOcorrencia")
    public void setSituacaoOcorrencia(SituacaoOcorrencia situacaoOcorrencia) {
        this.situacaoOcorrencia = situacaoOcorrencia;
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
    public DestinoApreensao getDestinoApreensao() {
        return destinoApreensao;
    }

    @JsonProperty("DestinoApreensao")
    public void setDestinoApreensao(DestinoApreensao destinoApreensao) {
        this.destinoApreensao = destinoApreensao;
    }

    @JsonProperty("ObjetoSiopm")
    public ObjetoSiopm getObjetoSiopm() {
        return objetoSiopm;
    }

    @JsonProperty("ObjetoSiopm")
    public void setObjetoSiopm(ObjetoSiopm objetoSiopm) {
        this.objetoSiopm = objetoSiopm;
    }

    @JsonProperty("Lacre")
    public String getLacre() {
        return lacre;
    }

    @JsonProperty("Lacre")
    public void setLacre(String lacre) {
        this.lacre = lacre;
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
