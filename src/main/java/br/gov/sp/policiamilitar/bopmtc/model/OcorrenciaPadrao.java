
package br.gov.sp.policiamilitar.bopmtc.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodigoOcorrenciaBOTC",
    "TipoOrigemComunicacao",
    "DataHoraOcorrencia",
    "CodigoServico",
    "NumeroOcorrencia",
    "CadOcorrencia",
    "DataInclusaoBOTC",
    "Envolvidos",
    "Veiculos",
    "DetalheOcorrencia",
    "OrigemOcorrencia",
    "ProprietarioOcorrencia",
    "Apreensoes",
    "RelatorioAutoridade",
    "Operacao",
    "LiberadoFinalizacao"
})
public class OcorrenciaPadrao {

    @JsonProperty("CodigoOcorrenciaBOTC")
    private Long codigoOcorrenciaBOTC;
    @JsonProperty("TipoOrigemComunicacao")
    private String tipoOrigemComunicacao;
    @JsonProperty("DataHoraOcorrencia")
    private String dataHoraOcorrencia;
    @JsonProperty("CodigoServico")
    private Long codigoServico;
    @JsonProperty("NumeroOcorrencia")
    private Long numeroOcorrencia;
    @JsonProperty("CadOcorrencia")
    private Long cadOcorrencia;
    @JsonProperty("DataInclusaoBOTC")
    private String dataInclusaoBOTC;
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
    private List<Apreenso> apreensoes = new ArrayList<Apreenso>();
    @JsonProperty("RelatorioAutoridade")
    private RelatorioAutoridade relatorioAutoridade;
    @JsonProperty("Operacao")
    private Operacao operacao;
    @JsonProperty("LiberadoFinalizacao")
    private Boolean liberadoFinalizacao;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OcorrenciaPadrao() {
    }

    /**
     * 
     * @param apreensoes
     * @param codigoOcorrenciaBOTC
     * @param tipoOrigemComunicacao
     * @param cadOcorrencia
     * @param detalheOcorrencia
     * @param dataHoraOcorrencia
     * @param operacao
     * @param codigoServico
     * @param veiculos
     * @param relatorioAutoridade
     * @param numeroOcorrencia
     * @param dataInclusaoBOTC
     * @param liberadoFinalizacao
     * @param origemOcorrencia
     * @param proprietarioOcorrencia
     * @param envolvidos
     */
    public OcorrenciaPadrao(Long codigoOcorrenciaBOTC, String tipoOrigemComunicacao, String dataHoraOcorrencia, Long codigoServico, Long numeroOcorrencia, Long cadOcorrencia, String dataInclusaoBOTC, List<Envolvido> envolvidos, List<Veiculo> veiculos, DetalheOcorrencia detalheOcorrencia, OrigemOcorrencia origemOcorrencia, ProprietarioOcorrencia proprietarioOcorrencia, List<Apreenso> apreensoes, RelatorioAutoridade relatorioAutoridade, Operacao operacao, Boolean liberadoFinalizacao) {
        super();
        this.codigoOcorrenciaBOTC = codigoOcorrenciaBOTC;
        this.tipoOrigemComunicacao = tipoOrigemComunicacao;
        this.dataHoraOcorrencia = dataHoraOcorrencia;
        this.codigoServico = codigoServico;
        this.numeroOcorrencia = numeroOcorrencia;
        this.cadOcorrencia = cadOcorrencia;
        this.dataInclusaoBOTC = dataInclusaoBOTC;
        this.envolvidos = envolvidos;
        this.veiculos = veiculos;
        this.detalheOcorrencia = detalheOcorrencia;
        this.origemOcorrencia = origemOcorrencia;
        this.proprietarioOcorrencia = proprietarioOcorrencia;
        this.apreensoes = apreensoes;
        this.relatorioAutoridade = relatorioAutoridade;
        this.operacao = operacao;
        this.liberadoFinalizacao = liberadoFinalizacao;
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
    public String getDataHoraOcorrencia() {
        return dataHoraOcorrencia;
    }

    @JsonProperty("DataHoraOcorrencia")
    public void setDataHoraOcorrencia(String dataHoraOcorrencia) {
        this.dataHoraOcorrencia = dataHoraOcorrencia;
    }

    @JsonProperty("CodigoServico")
    public Long getCodigoServico() {
        return codigoServico;
    }

    @JsonProperty("CodigoServico")
    public void setCodigoServico(Long codigoServico) {
        this.codigoServico = codigoServico;
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
    public String getDataInclusaoBOTC() {
        return dataInclusaoBOTC;
    }

    @JsonProperty("DataInclusaoBOTC")
    public void setDataInclusaoBOTC(String dataInclusaoBOTC) {
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
    public List<Apreenso> getApreensoes() {
        return apreensoes;
    }

    @JsonProperty("Apreensoes")
    public void setApreensoes(List<Apreenso> apreensoes) {
        this.apreensoes = apreensoes;
    }

    @JsonProperty("RelatorioAutoridade")
    public RelatorioAutoridade getRelatorioAutoridade() {
        return relatorioAutoridade;
    }

    @JsonProperty("RelatorioAutoridade")
    public void setRelatorioAutoridade(RelatorioAutoridade relatorioAutoridade) {
        this.relatorioAutoridade = relatorioAutoridade;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
