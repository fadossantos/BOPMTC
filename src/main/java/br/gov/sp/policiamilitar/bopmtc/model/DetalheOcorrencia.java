
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.NCD;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NcdFinal",
    "DataHoraFato",
    "Logradouro",
    "CodigoLocal",
    "CodigoLocalComplemento",
    "DataHoraChegadaLocal",
    "DataHoraSaidaFinal",
    "CodigoLocalDetalhe",
    "LocalAmbiente",
    "LocalPreservado",
    "CodigoIluminacao",
    "CodigoTempo",
    "CodigoSemaforo",
    "CodigoCondicaoPista",
    "CodigoTipoTrecho",
    "LatitudeFinal",
    "LongitudeFinal"
})
public class DetalheOcorrencia {
	
	@JsonProperty("NcdFinal")
    private Long ncdFinal;
    
    @JsonIgnore
    private NCD ncdFinalObj;
    
    @JsonProperty("DataHoraFato")
    private Date dataHoraFato;
    @JsonProperty("Logradouro")
    private Logradouro logradouro;
    @JsonProperty("CodigoLocal")
    private String codigoLocal;
    @JsonProperty("CodigoLocalComplemento")
    private Long codigoLocalComplemento;
    @JsonProperty("DataHoraChegadaLocal")
    private Date dataHoraChegadaLocal;
    @JsonProperty("DataHoraSaidaFinal")
    private Date dataHoraSaidaFinal;
    @JsonProperty("CodigoLocalDetalhe")
    private Long codigoLocalDetalhe;
    @JsonProperty("LocalAmbiente")
    private String localAmbiente;
    @JsonProperty("LocalPreservado")
    private Boolean localPreservado;
    @JsonProperty("CodigoIluminacao")
    private Long codigoIluminacao;
    @JsonProperty("CodigoTempo")
    private Long codigoTempo;
    @JsonProperty("CodigoSemaforo")
    private Long codigoSemaforo;
    @JsonProperty("CodigoCondicaoPista")
    private Long codigoCondicaoPista;
    @JsonProperty("CodigoTipoTrecho")
    private Long codigoTipoTrecho;
    @JsonProperty("LatitudeFinal")
    private Long latitudeFinal;
    @JsonProperty("LongitudeFinal")
    private Long longitudeFinal;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DetalheOcorrencia() {
    	this.ncdFinalObj = new NCD();
    }

    /**
     * 
     * @param localAmbiente
     * @param codigoSemaforo
     * @param localPreservado
     * @param longitudeFinal
     * @param codigoTempo
     * @param codigoIluminacao
     * @param dataHoraSaidaFinal
     * @param dataHoraFato
     * @param dataHoraChegadaLocal
     * @param latitudeFinal
     * @param codigoLocalDetalhe
     * @param ncdFinal
     * @param codigoLocalComplemento
     * @param logradouro
     * @param codigoCondicaoPista
     * @param codigoTipoTrecho
     * @param codigoLocal
     */
    public DetalheOcorrencia(Long ncdFinal, Date dataHoraFato, Logradouro logradouro, String codigoLocal, Long codigoLocalComplemento, Date dataHoraChegadaLocal, Date dataHoraSaidaFinal, Long codigoLocalDetalhe, String localAmbiente, Boolean localPreservado, Long codigoIluminacao, Long codigoTempo, Long codigoSemaforo, Long codigoCondicaoPista, Long codigoTipoTrecho, Long latitudeFinal, Long longitudeFinal) {
        super();
        this.ncdFinal = ncdFinal;
        this.ncdFinalObj = new NCD();
        this.ncdFinalObj.setNcdCod(ncdFinal);
        this.dataHoraFato = dataHoraFato;
        this.logradouro = logradouro;
        this.codigoLocal = codigoLocal;
        this.codigoLocalComplemento = codigoLocalComplemento;
        this.dataHoraChegadaLocal = dataHoraChegadaLocal;
        this.dataHoraSaidaFinal = dataHoraSaidaFinal;
        this.codigoLocalDetalhe = codigoLocalDetalhe;
        this.localAmbiente = localAmbiente;
        this.localPreservado = localPreservado;
        this.codigoIluminacao = codigoIluminacao;
        this.codigoTempo = codigoTempo;
        this.codigoSemaforo = codigoSemaforo;
        this.codigoCondicaoPista = codigoCondicaoPista;
        this.codigoTipoTrecho = codigoTipoTrecho;
        this.latitudeFinal = latitudeFinal;
        this.longitudeFinal = longitudeFinal;
    }

    @JsonProperty("NcdFinal")
    public Long getNcdFinal() {
        return ncdFinal;
    }

    @JsonProperty("NcdFinal")
    public void setNcdFinal(Long ncdFinal) {
        this.ncdFinal = ncdFinal;        
    }
    
    @JsonIgnore
    public NCD getNcdFinalObj() {
    	return this.ncdFinalObj;
    }
    
    @JsonIgnore
    public void setNcdFinalObj(NCD ncdFinalObj){
    	this.ncdFinalObj = ncdFinalObj;    	
    }

    @JsonProperty("DataHoraFato")
    public Date getDataHoraFato() {
        return dataHoraFato;
    }

    @JsonProperty("DataHoraFato")
    public void setDataHoraFato(Date dataHoraFato) {
        this.dataHoraFato = dataHoraFato;
    }

    @JsonProperty("Logradouro")
    public Logradouro getLogradouro() {
        return logradouro;
    }

    @JsonProperty("Logradouro")
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    @JsonProperty("CodigoLocal")
    public String getCodigoLocal() {
        return codigoLocal;
    }

    @JsonProperty("CodigoLocal")
    public void setCodigoLocal(String codigoLocal) {
        this.codigoLocal = codigoLocal;
    }

    @JsonProperty("CodigoLocalComplemento")
    public Long getCodigoLocalComplemento() {
        return codigoLocalComplemento;
    }

    @JsonProperty("CodigoLocalComplemento")
    public void setCodigoLocalComplemento(Long codigoLocalComplemento) {
        this.codigoLocalComplemento = codigoLocalComplemento;
    }

    @JsonProperty("DataHoraChegadaLocal")
    public Date getDataHoraChegadaLocal() {
        return dataHoraChegadaLocal;
    }

    @JsonProperty("DataHoraChegadaLocal")
    public void setDataHoraChegadaLocal(Date dataHoraChegadaLocal) {
        this.dataHoraChegadaLocal = dataHoraChegadaLocal;
    }

    @JsonProperty("DataHoraSaidaFinal")
    public Date getDataHoraSaidaFinal() {
        return dataHoraSaidaFinal;
    }

    @JsonProperty("DataHoraSaidaFinal")
    public void setDataHoraSaidaFinal(Date dataHoraSaidaFinal) {
        this.dataHoraSaidaFinal = dataHoraSaidaFinal;
    }

    @JsonProperty("CodigoLocalDetalhe")
    public Long getCodigoLocalDetalhe() {
        return codigoLocalDetalhe;
    }

    @JsonProperty("CodigoLocalDetalhe")
    public void setCodigoLocalDetalhe(Long codigoLocalDetalhe) {
        this.codigoLocalDetalhe = codigoLocalDetalhe;
    }

    @JsonProperty("LocalAmbiente")
    public String getLocalAmbiente() {
        return localAmbiente;
    }

    @JsonProperty("LocalAmbiente")
    public void setLocalAmbiente(String localAmbiente) {
        this.localAmbiente = localAmbiente;
    }

    @JsonProperty("LocalPreservado")
    public Boolean getLocalPreservado() {
        return localPreservado;
    }

    @JsonProperty("LocalPreservado")
    public void setLocalPreservado(Boolean localPreservado) {
        this.localPreservado = localPreservado;
    }

    @JsonProperty("CodigoIluminacao")
    public Long getCodigoIluminacao() {
        return codigoIluminacao;
    }

    @JsonProperty("CodigoIluminacao")
    public void setCodigoIluminacao(Long codigoIluminacao) {
        this.codigoIluminacao = codigoIluminacao;
    }

    @JsonProperty("CodigoTempo")
    public Long getCodigoTempo() {
        return codigoTempo;
    }

    @JsonProperty("CodigoTempo")
    public void setCodigoTempo(Long codigoTempo) {
        this.codigoTempo = codigoTempo;
    }

    @JsonProperty("CodigoSemaforo")
    public Long getCodigoSemaforo() {
        return codigoSemaforo;
    }

    @JsonProperty("CodigoSemaforo")
    public void setCodigoSemaforo(Long codigoSemaforo) {
        this.codigoSemaforo = codigoSemaforo;
    }

    @JsonProperty("CodigoCondicaoPista")
    public Long getCodigoCondicaoPista() {
        return codigoCondicaoPista;
    }

    @JsonProperty("CodigoCondicaoPista")
    public void setCodigoCondicaoPista(Long codigoCondicaoPista) {
        this.codigoCondicaoPista = codigoCondicaoPista;
    }

    @JsonProperty("CodigoTipoTrecho")
    public Long getCodigoTipoTrecho() {
        return codigoTipoTrecho;
    }

    @JsonProperty("CodigoTipoTrecho")
    public void setCodigoTipoTrecho(Long codigoTipoTrecho) {
        this.codigoTipoTrecho = codigoTipoTrecho;
    }

    @JsonProperty("LatitudeFinal")
    public Long getLatitudeFinal() {
        return latitudeFinal;
    }

    @JsonProperty("LatitudeFinal")
    public void setLatitudeFinal(Long latitudeFinal) {
        this.latitudeFinal = latitudeFinal;
    }

    @JsonProperty("LongitudeFinal")
    public Long getLongitudeFinal() {
        return longitudeFinal;
    }

    @JsonProperty("LongitudeFinal")
    public void setLongitudeFinal(Long longitudeFinal) {
        this.longitudeFinal = longitudeFinal;
    }

       
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
