
package br.gov.sp.policiamilitar.bopmtc.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodigoSequencial",
    "CodigoSequencialEnvolvido",
    "NumeroVeiculoSIOPM",
    "SituacaoOcorrencia",
    "TipoVeiculo",
    "GrupoTipoVeiculo",
    "DanoVeiculo",
    "IdentificadorVeiculoSegurado",
    "Renavam",
    "Placa",
    "UF",
    "Marca",
    "Cor",
    "AnoFabricacao",
    "AnoModelo",
    "Municipio",
    "Chassi",
    "Categoria",
    "ListaAvaria",
    "Observacao",
    "ProprietarioNome",
    "ProprietarioCpf",
    "NumeroProprietarioSIOPM"
})
public class Veiculo {

    @JsonProperty("CodigoSequencial")
    private Long codigoSequencial;
    @JsonProperty("CodigoSequencialEnvolvido")
    private Long codigoSequencialEnvolvido;
    @JsonProperty("NumeroVeiculoSIOPM")
    private Long numeroVeiculoSIOPM;
    @JsonProperty("SituacaoOcorrencia")
    private SituacaoOcorrencia situacaoOcorrencia;
    @JsonProperty("TipoVeiculo")
    private TipoVeiculo tipoVeiculo;
    @JsonProperty("GrupoTipoVeiculo")
    private GrupoTipoVeiculo grupoTipoVeiculo;
    @JsonProperty("DanoVeiculo")
    private Long danoVeiculo;
    @JsonProperty("IdentificadorVeiculoSegurado")
    private String identificadorVeiculoSegurado;
    @JsonProperty("Renavam")
    private Long renavam;
    @JsonProperty("Placa")
    private String placa;
    @JsonProperty("UF")
    private UF uF;
    @JsonProperty("Marca")
    private MarcaVeiculo marca;
    @JsonProperty("Cor")
    private Cor cor;
    @JsonProperty("AnoFabricacao")
    private Long anoFabricacao;
    @JsonProperty("AnoModelo")
    private Long anoModelo;
    @JsonProperty("Municipio")
    private Municipio municipio;
    @JsonProperty("Chassi")
    private String chassi;
    @JsonProperty("Categoria")
    private Categoria categoria;
    @JsonProperty("ListaAvaria")
    private List<ListaAvarium> listaAvaria = new ArrayList<ListaAvarium>();
    @JsonProperty("Observacao")
    private String observacao;
    @JsonProperty("ProprietarioNome")
    private String proprietarioNome;
    @JsonProperty("ProprietarioCpf")
    private Long proprietarioCpf;
    @JsonProperty("NumeroProprietarioSIOPM")
    private Long numeroProprietarioSIOPM;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Veiculo() {
    }

    /**
     * 
     * @param anoFabricacao
     * @param grupoTipoVeiculo
     * @param cor
     * @param codigoSequencial
     * @param danoVeiculo
     * @param renavam
     * @param uF
     * @param marca
     * @param numeroVeiculoSIOPM
     * @param listaAvaria
     * @param observacao
     * @param proprietarioCpf
     * @param categoria
     * @param situacaoOcorrencia
     * @param proprietarioNome
     * @param municipio
     * @param chassi
     * @param numeroProprietarioSIOPM
     * @param placa
     * @param anoModelo
     * @param tipoVeiculo
     * @param identificadorVeiculoSegurado
     * @param codigoSequencialEnvolvido
     */
    public Veiculo(Long codigoSequencial, Long codigoSequencialEnvolvido, Long numeroVeiculoSIOPM, SituacaoOcorrencia situacaoOcorrencia, TipoVeiculo tipoVeiculo, GrupoTipoVeiculo grupoTipoVeiculo, Long danoVeiculo, String identificadorVeiculoSegurado, Long renavam, String placa, UF uF, MarcaVeiculo marca, Cor cor, Long anoFabricacao, Long anoModelo, Municipio municipio, String chassi, Categoria categoria, List<ListaAvarium> listaAvaria, String observacao, String proprietarioNome, Long proprietarioCpf, Long numeroProprietarioSIOPM) {
        super();
        this.codigoSequencial = codigoSequencial;
        this.codigoSequencialEnvolvido = codigoSequencialEnvolvido;
        this.numeroVeiculoSIOPM = numeroVeiculoSIOPM;
        this.situacaoOcorrencia = situacaoOcorrencia;
        this.tipoVeiculo = tipoVeiculo;
        this.grupoTipoVeiculo = grupoTipoVeiculo;
        this.danoVeiculo = danoVeiculo;
        this.identificadorVeiculoSegurado = identificadorVeiculoSegurado;
        this.renavam = renavam;
        this.placa = placa;
        this.uF = uF;
        this.marca = marca;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.municipio = municipio;
        this.chassi = chassi;
        this.categoria = categoria;
        this.listaAvaria = listaAvaria;
        this.observacao = observacao;
        this.proprietarioNome = proprietarioNome;
        this.proprietarioCpf = proprietarioCpf;
        this.numeroProprietarioSIOPM = numeroProprietarioSIOPM;
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

    @JsonProperty("NumeroVeiculoSIOPM")
    public Long getNumeroVeiculoSIOPM() {
        return numeroVeiculoSIOPM;
    }

    @JsonProperty("NumeroVeiculoSIOPM")
    public void setNumeroVeiculoSIOPM(Long numeroVeiculoSIOPM) {
        this.numeroVeiculoSIOPM = numeroVeiculoSIOPM;
    }

    @JsonProperty("SituacaoOcorrencia")
    public SituacaoOcorrencia getSituacaoOcorrencia() {
        return situacaoOcorrencia;
    }

    @JsonProperty("SituacaoOcorrencia")
    public void setSituacaoOcorrencia(SituacaoOcorrencia situacaoOcorrencia) {
        this.situacaoOcorrencia = situacaoOcorrencia;
    }

    @JsonProperty("TipoVeiculo")
    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    @JsonProperty("TipoVeiculo")
    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @JsonProperty("GrupoTipoVeiculo")
    public GrupoTipoVeiculo getGrupoTipoVeiculo() {
        return grupoTipoVeiculo;
    }

    @JsonProperty("GrupoTipoVeiculo")
    public void setGrupoTipoVeiculo(GrupoTipoVeiculo grupoTipoVeiculo) {
        this.grupoTipoVeiculo = grupoTipoVeiculo;
    }

    @JsonProperty("DanoVeiculo")
    public Long getDanoVeiculo() {
        return danoVeiculo;
    }

    @JsonProperty("DanoVeiculo")
    public void setDanoVeiculo(Long danoVeiculo) {
        this.danoVeiculo = danoVeiculo;
    }

    @JsonProperty("IdentificadorVeiculoSegurado")
    public String getIdentificadorVeiculoSegurado() {
        return identificadorVeiculoSegurado;
    }

    @JsonProperty("IdentificadorVeiculoSegurado")
    public void setIdentificadorVeiculoSegurado(String identificadorVeiculoSegurado) {
        this.identificadorVeiculoSegurado = identificadorVeiculoSegurado;
    }

    @JsonProperty("Renavam")
    public Long getRenavam() {
        return renavam;
    }

    @JsonProperty("Renavam")
    public void setRenavam(Long renavam) {
        this.renavam = renavam;
    }

    @JsonProperty("Placa")
    public String getPlaca() {
        return placa;
    }

    @JsonProperty("Placa")
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @JsonProperty("UF")
    public UF getUF() {
        return uF;
    }

    @JsonProperty("UF")
    public void setUF(UF uF) {
        this.uF = uF;
    }

    @JsonProperty("Marca")
    public MarcaVeiculo getMarca() {
        return marca;
    }

    @JsonProperty("Marca")
    public void setMarca(MarcaVeiculo marca) {
        this.marca = marca;
    }

    @JsonProperty("Cor")
    public Cor getCor() {
        return cor;
    }

    @JsonProperty("Cor")
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @JsonProperty("AnoFabricacao")
    public Long getAnoFabricacao() {
        return anoFabricacao;
    }

    @JsonProperty("AnoFabricacao")
    public void setAnoFabricacao(Long anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @JsonProperty("AnoModelo")
    public Long getAnoModelo() {
        return anoModelo;
    }

    @JsonProperty("AnoModelo")
    public void setAnoModelo(Long anoModelo) {
        this.anoModelo = anoModelo;
    }

    @JsonProperty("Municipio")
    public Municipio getMunicipio() {
        return municipio;
    }

    @JsonProperty("Municipio")
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @JsonProperty("Chassi")
    public String getChassi() {
        return chassi;
    }

    @JsonProperty("Chassi")
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @JsonProperty("Categoria")
    public Categoria getCategoria() {
        return categoria;
    }

    @JsonProperty("Categoria")
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @JsonProperty("ListaAvaria")
    public List<ListaAvarium> getListaAvaria() {
        return listaAvaria;
    }

    @JsonProperty("ListaAvaria")
    public void setListaAvaria(List<ListaAvarium> listaAvaria) {
        this.listaAvaria = listaAvaria;
    }

    @JsonProperty("Observacao")
    public String getObservacao() {
        return observacao;
    }

    @JsonProperty("Observacao")
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @JsonProperty("ProprietarioNome")
    public String getProprietarioNome() {
        return proprietarioNome;
    }

    @JsonProperty("ProprietarioNome")
    public void setProprietarioNome(String proprietarioNome) {
        this.proprietarioNome = proprietarioNome;
    }

    @JsonProperty("ProprietarioCpf")
    public Long getProprietarioCpf() {
        return proprietarioCpf;
    }

    @JsonProperty("ProprietarioCpf")
    public void setProprietarioCpf(Long proprietarioCpf) {
        this.proprietarioCpf = proprietarioCpf;
    }

    @JsonProperty("NumeroProprietarioSIOPM")
    public Long getNumeroProprietarioSIOPM() {
        return numeroProprietarioSIOPM;
    }

    @JsonProperty("NumeroProprietarioSIOPM")
    public void setNumeroProprietarioSIOPM(Long numeroProprietarioSIOPM) {
        this.numeroProprietarioSIOPM = numeroProprietarioSIOPM;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
