
package br.gov.sp.policiamilitar.bopmtc.model;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodigoOcorrenciaBOTC",
    "TipoOrigemComunicacao",
    "DataHoraOcorrencia",
    "NumeroOcorrencia",
    "CadOcorrencia",
    "DataInclusaoBOTC",
    "Envolvidos",
    "Veiculos",
    "DetalheOcorrencia",
    "OrigemOcorrencia",
    "ProprietarioOcorrencia",
    "Apreensoes",
    "Anexos",
    "RelatorioAutoridade",
    "Comarca",
    "Operacao",
    "LiberadoFinalizacao",
    "CodigoResultadoEncerramento"
})
public class OcorrenciaPadrao {

    @JsonProperty("CodigoOcorrenciaBOTC")
    private Long codigoOcorrenciaBOTC;
    @JsonProperty("TipoOrigemComunicacao")
    private String tipoOrigemComunicacao; 
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]")
    @JsonProperty("DataHoraOcorrencia")   
    private LocalDateTime dataHoraOcorrencia;    
    @JsonIgnore
    private Long dataHoraOcorrenciaAbsoluta;    
    @JsonProperty("NumeroOcorrencia")
    private Long numeroOcorrencia;
    @JsonProperty("CadOcorrencia")
    private Long cadOcorrencia;   
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]")
    @JsonProperty("DataInclusaoBOTC")
    private LocalDateTime dataInclusaoBOTC;
    @JsonProperty("Envolvidos")
    private List<Envolvido> envolvidos = new ArrayList<Envolvido>();
    @JsonProperty("Veiculos")
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();
    @JsonProperty("DetalheOcorrencia")
    private DetalheOcorrencia detalheOcorrencia;
    @JsonProperty("OrigemOcorrencia")
    private OrigemOcorrencia origemOcorrencia;
    @JsonProperty("ProprietarioOcorrencia")
    private ProprietarioOcorrencia proprietarioOcorrencia;
    @JsonProperty("Apreensoes")
    private List<Apreensao> apreensoes = new ArrayList<Apreensao>();
    @JsonProperty("Anexos")
    private List<Anexo> anexos = new ArrayList<Anexo>();
    @JsonProperty("RelatorioAutoridade")
    private RelatorioAutoridade relatorioAutoridade;
    @JsonProperty("Comarca")
    private Comarca comarca;
    @JsonProperty("Operacao")
    private Operacao operacao;
    @JsonProperty("LiberadoFinalizacao")
    private Boolean liberadoFinalizacao;
    @JsonProperty("CodigoResultadoEncerramento")
    private Long codigoResultadoEncerramento;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OcorrenciaPadrao() {
    }

    /**
     * 
     * @param codigoResultadoEncerramento
     * @param codigoOcorrenciaBOTC
     * @param apreensoes
     * @param tipoOrigemComunicacao
     * @param cadOcorrencia
     * @param detalheOcorrencia
     * @param dataHoraOcorrencia
     * @param operacao
     * @param veiculos
     * @param relatorioAutoridade
     * @param anexos
     * @param numeroOcorrencia
     * @param dataInclusaoBOTC
     * @param liberadoFinalizacao
     * @param origemOcorrencia
     * @param proprietarioOcorrencia
     * @param comarca
     * @param envolvidos
     */
    public OcorrenciaPadrao(Long codigoOcorrenciaBOTC, String tipoOrigemComunicacao, LocalDateTime dataHoraOcorrencia, Long numeroOcorrencia, Long cadOcorrencia, LocalDateTime dataInclusaoBOTC, List<Envolvido> envolvidos, List<Veiculo> veiculos, DetalheOcorrencia detalheOcorrencia, OrigemOcorrencia origemOcorrencia, ProprietarioOcorrencia proprietarioOcorrencia, List<Apreensao> apreensoes, List<Anexo> anexos, RelatorioAutoridade relatorioAutoridade, Comarca comarca, Operacao operacao, Boolean liberadoFinalizacao, Long codigoResultadoEncerramento) {
        super();
        this.codigoOcorrenciaBOTC = codigoOcorrenciaBOTC;
        this.tipoOrigemComunicacao = tipoOrigemComunicacao;
        this.dataHoraOcorrencia = dataHoraOcorrencia;
        this.dataHoraOcorrenciaAbsoluta = dataHoraOcorrencia.toEpochSecond(ZoneOffset.ofTotalSeconds(0));
        this.numeroOcorrencia = numeroOcorrencia;
        this.cadOcorrencia = cadOcorrencia;
        this.dataInclusaoBOTC = dataInclusaoBOTC;
        this.envolvidos = envolvidos;
        this.veiculos = veiculos;
        this.detalheOcorrencia = detalheOcorrencia;
        this.origemOcorrencia = origemOcorrencia;
        this.proprietarioOcorrencia = proprietarioOcorrencia;
        this.apreensoes = apreensoes;
        this.anexos = anexos;
        this.relatorioAutoridade = relatorioAutoridade;
        this.comarca = comarca;
        this.operacao = operacao;
        this.liberadoFinalizacao = liberadoFinalizacao;
        this.codigoResultadoEncerramento = codigoResultadoEncerramento;
    }

    @JsonProperty("CodigoOcorrenciaBOTC")
    public Long getCodigoOcorrenciaBOTC() {
        return codigoOcorrenciaBOTC;
    }

    @JsonProperty("CodigoOcorrenciaBOTC")
    public void setCodigoOcorrenciaBOTC(Long codigoOcorrenciaBOTC) {
        this.codigoOcorrenciaBOTC = codigoOcorrenciaBOTC;
    }

    @JsonProperty("TipoOrigemComunicacao")
    public String getTipoOrigemComunicacao() {
        return tipoOrigemComunicacao;
    }

    @JsonProperty("TipoOrigemComunicacao")
    public void setTipoOrigemComunicacao(String tipoOrigemComunicacao) {
        this.tipoOrigemComunicacao = tipoOrigemComunicacao;
    }

    @JsonProperty("DataHoraOcorrencia")
    public LocalDateTime getDataHoraOcorrencia() {
        return dataHoraOcorrencia;
    }
    
    @JsonIgnore
    public Long getDataHoraOcorrenciaAbsoluta() {
        return dataHoraOcorrenciaAbsoluta;
    }

    @JsonProperty("DataHoraOcorrencia")
    public void setDataHoraOcorrencia(LocalDateTime dataHoraOcorrencia) {
        this.dataHoraOcorrencia = dataHoraOcorrencia;
        this.dataHoraOcorrenciaAbsoluta = dataHoraOcorrencia.toEpochSecond(ZoneOffset.ofTotalSeconds(0));
       }

    @JsonProperty("NumeroOcorrencia")
    public Long getNumeroOcorrencia() {
        return numeroOcorrencia;
    }

    @JsonProperty("NumeroOcorrencia")
    public void setNumeroOcorrencia(Long numeroOcorrencia) {
        this.numeroOcorrencia = numeroOcorrencia;
    }

    @JsonProperty("CadOcorrencia")
    public Long getCadOcorrencia() {
        return cadOcorrencia;
    }

    @JsonProperty("CadOcorrencia")
    public void setCadOcorrencia(Long cadOcorrencia) {
        this.cadOcorrencia = cadOcorrencia;
    }

    @JsonProperty("DataInclusaoBOTC")
    public LocalDateTime getDataInclusaoBOTC() {
        return dataInclusaoBOTC;
    }

    @JsonProperty("DataInclusaoBOTC")
    public void setDataInclusaoBOTC(LocalDateTime dataInclusaoBOTC) {
        this.dataInclusaoBOTC = dataInclusaoBOTC;        
    }

    @JsonProperty("Envolvidos")
    public List<Envolvido> getEnvolvidos() {
        return envolvidos;
    }

    @JsonProperty("Envolvidos")
    public void setEnvolvidos(List<Envolvido> envolvidos) {
        this.envolvidos = envolvidos;
    }

    @JsonProperty("Veiculos")
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    @JsonProperty("Veiculos")
    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @JsonProperty("DetalheOcorrencia")
    public DetalheOcorrencia getDetalheOcorrencia() {
        return detalheOcorrencia;
    }

    @JsonProperty("DetalheOcorrencia")
    public void setDetalheOcorrencia(DetalheOcorrencia detalheOcorrencia) {
        this.detalheOcorrencia = detalheOcorrencia;
    }

    @JsonProperty("OrigemOcorrencia")
    public OrigemOcorrencia getOrigemOcorrencia() {
        return origemOcorrencia;
    }

    @JsonProperty("OrigemOcorrencia")
    public void setOrigemOcorrencia(OrigemOcorrencia origemOcorrencia) {
        this.origemOcorrencia = origemOcorrencia;
    }

    @JsonProperty("ProprietarioOcorrencia")
    public ProprietarioOcorrencia getProprietarioOcorrencia() {
        return proprietarioOcorrencia;
    }

    @JsonProperty("ProprietarioOcorrencia")
    public void setProprietarioOcorrencia(ProprietarioOcorrencia proprietarioOcorrencia) {
        this.proprietarioOcorrencia = proprietarioOcorrencia;
    }

    @JsonProperty("Apreensoes")
    public List<Apreensao> getApreensoes() {
        return apreensoes;
    }

    @JsonProperty("Apreensoes")
    public void setApreensoes(List<Apreensao> apreensoes) {
        this.apreensoes = apreensoes;
    }

    @JsonProperty("Anexos")
    public List<Anexo> getAnexos() {
        return anexos;
    }

    @JsonProperty("Anexos")
    public void setAnexos(List<Anexo> anexos) {
        this.anexos = anexos;
    }

    @JsonProperty("RelatorioAutoridade")
    public RelatorioAutoridade getRelatorioAutoridade() {
        return relatorioAutoridade;
    }

    @JsonProperty("RelatorioAutoridade")
    public void setRelatorioAutoridade(RelatorioAutoridade relatorioAutoridade) {
        this.relatorioAutoridade = relatorioAutoridade;
    }

    @JsonProperty("Comarca")
    public Comarca getComarca() {
        return comarca;
    }

    @JsonProperty("Comarca")
    public void setComarca(Comarca comarca) {
        this.comarca = comarca;
    }

    @JsonProperty("Operacao")
    public Operacao getOperacao() {
        return operacao;
    }

    @JsonProperty("Operacao")
    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    @JsonProperty("LiberadoFinalizacao")
    public Boolean getLiberadoFinalizacao() {
        return liberadoFinalizacao;
    }

    @JsonProperty("LiberadoFinalizacao")
    public void setLiberadoFinalizacao(Boolean liberadoFinalizacao) {
        this.liberadoFinalizacao = liberadoFinalizacao;
    }

    @JsonProperty("CodigoResultadoEncerramento")
    public Long getCodigoResultadoEncerramento() {
        return codigoResultadoEncerramento;
    }

    @JsonProperty("CodigoResultadoEncerramento")
    public void setCodigoResultadoEncerramento(Long codigoResultadoEncerramento) {
        this.codigoResultadoEncerramento = codigoResultadoEncerramento;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
