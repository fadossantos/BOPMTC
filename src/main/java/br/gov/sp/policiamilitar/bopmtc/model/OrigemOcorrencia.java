
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.NCD;
import br.gov.sp.policiamilitar.bopmtc.services.NCDService;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Prioridade",
    "Status",
    "DataGeracaoOcorrencia",
    "NcdInicial",
    "Logradouro",
    "Solicitante",
    "AtendimentoInicial",
    "DistritoPolicial",
    "HistoricoInicial",
    "Reiteracoes",
    "OPM",
    "LatitudeInicial",
    "LongitudeInicial"
})
public class OrigemOcorrencia {
	
    @JsonProperty("Prioridade")
    private String prioridade;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("DataGeracaoOcorrencia")
    private Date dataGeracaoOcorrencia;
    @JsonProperty("NcdInicial")
    private Long ncdInicial;
    
    @JsonIgnore
    private NCD ncdInicialObj;
    
    @JsonProperty("Logradouro")
    private Logradouro logradouro;
    @JsonProperty("Solicitante")
    private String solicitante;
    @JsonProperty("AtendimentoInicial")
    private String atendimentoInicial;
    @JsonProperty("DistritoPolicial")
    private String distritoPolicial;
    @JsonProperty("HistoricoInicial")
    private String historicoInicial;
    @JsonProperty("Reiteracoes")
    private String reiteracoes;
    @JsonProperty("OPM")
    private Long oPM;
    @JsonProperty("LatitudeInicial")
    private Long latitudeInicial;
    @JsonProperty("LongitudeInicial")
    private Long longitudeInicial;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrigemOcorrencia() {
    	this.ncdInicialObj = new NCD();
    }

    /**
     * 
     * @param atendimentoInicial
     * @param dataGeracaoOcorrencia
     * @param status
     * @param solicitante
     * @param oPM
     * @param ncdInicial
     * @param historicoInicial
     * @param longitudeInicial
     * @param logradouro
     * @param reiteracoes
     * @param latitudeInicial
     * @param prioridade
     * @param distritoPolicial
     */
    public OrigemOcorrencia(String prioridade, String status, Date dataGeracaoOcorrencia, Long ncdInicial, Logradouro logradouro, String solicitante, String atendimentoInicial, String distritoPolicial, String historicoInicial, String reiteracoes, Long oPM, Long latitudeInicial, Long longitudeInicial) {
        super();
        this.prioridade = prioridade;
        this.status = status;
        this.dataGeracaoOcorrencia = dataGeracaoOcorrencia;
        this.ncdInicial = ncdInicial;
        this.ncdInicialObj = new NCD();
        this.ncdInicialObj.setNcdCod(ncdInicial);
        this.logradouro = logradouro;
        this.solicitante = solicitante;
        this.atendimentoInicial = atendimentoInicial;
        this.distritoPolicial = distritoPolicial;
        this.historicoInicial = historicoInicial;
        this.reiteracoes = reiteracoes;
        this.oPM = oPM;
        this.latitudeInicial = latitudeInicial;
        this.longitudeInicial = longitudeInicial;
    }

    @JsonProperty("Prioridade")
    public String getPrioridade() {
        return prioridade;
    }

    @JsonProperty("Prioridade")
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("DataGeracaoOcorrencia")
    public Date getDataGeracaoOcorrencia() {
        return dataGeracaoOcorrencia;
    }

    @JsonProperty("DataGeracaoOcorrencia")
    public void setDataGeracaoOcorrencia(Date dataGeracaoOcorrencia) {
        this.dataGeracaoOcorrencia = dataGeracaoOcorrencia;
    }

    @JsonProperty("NcdInicial")
    public Long getNcdInicial() {
        return ncdInicial;
    }

    @JsonProperty("NcdInicial")
    public void setNcdInicial(Long ncdInicial) {
        this.ncdInicial = ncdInicial;
        this.ncdInicialObj.setNcdCod(this.ncdInicial);        
    }
    
    @JsonIgnore
    public NCD getNcdInicialObj() {
        return this.ncdInicialObj;
    }

    @JsonIgnore
    public void setNcdInicialObj(NCD ncdInicialObj) {
        this.ncdInicialObj = ncdInicialObj;
    }    

    @JsonProperty("Logradouro")
    public Logradouro getLogradouro() {
        return logradouro;
    }

    @JsonProperty("Logradouro")
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    @JsonProperty("Solicitante")
    public String getSolicitante() {
        return solicitante;
    }

    @JsonProperty("Solicitante")
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    @JsonProperty("AtendimentoInicial")
    public String getAtendimentoInicial() {
        return atendimentoInicial;
    }

    @JsonProperty("AtendimentoInicial")
    public void setAtendimentoInicial(String atendimentoInicial) {
        this.atendimentoInicial = atendimentoInicial;
    }

    @JsonProperty("DistritoPolicial")
    public String getDistritoPolicial() {
        return distritoPolicial;
    }

    @JsonProperty("DistritoPolicial")
    public void setDistritoPolicial(String distritoPolicial) {
        this.distritoPolicial = distritoPolicial;
    }

    @JsonProperty("HistoricoInicial")
    public String getHistoricoInicial() {
        return historicoInicial;
    }

    @JsonProperty("HistoricoInicial")
    public void setHistoricoInicial(String historicoInicial) {
        this.historicoInicial = historicoInicial;
    }

    @JsonProperty("Reiteracoes")
    public String getReiteracoes() {
        return reiteracoes;
    }

    @JsonProperty("Reiteracoes")
    public void setReiteracoes(String reiteracoes) {
        this.reiteracoes = reiteracoes;
    }

    @JsonProperty("OPM")
    public Long getOPM() {
        return oPM;
    }

    @JsonProperty("OPM")
    public void setOPM(Long oPM) {
        this.oPM = oPM;
    }

    @JsonProperty("LatitudeInicial")
    public Long getLatitudeInicial() {
        return latitudeInicial;
    }

    @JsonProperty("LatitudeInicial")
    public void setLatitudeInicial(Long latitudeInicial) {
        this.latitudeInicial = latitudeInicial;
    }

    @JsonProperty("LongitudeInicial")
    public Long getLongitudeInicial() {
        return longitudeInicial;
    }

    @JsonProperty("LongitudeInicial")
    public void setLongitudeInicial(Long longitudeInicial) {
        this.longitudeInicial = longitudeInicial;
    }
      
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
