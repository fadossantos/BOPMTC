
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
    "CodigoSituacaoVeiculo",
    "CodigoTipoVeiculo",
    "CodigoGrupoTipoVeiculo",
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
    "ProprietarioNome"
})
public class Veiculo {

    @JsonProperty("CodigoSequencial")
    private Long codigoSequencial;
    @JsonProperty("CodigoSequencialEnvolvido")
    private Long codigoSequencialEnvolvido;
    @JsonProperty("NumeroVeiculoSIOPM")
    private Long numeroVeiculoSIOPM;
    @JsonProperty("CodigoSituacaoVeiculo")
    private Long codigoSituacaoVeiculo;
    @JsonProperty("CodigoTipoVeiculo")
    private Long codigoTipoVeiculo;
    @JsonProperty("CodigoGrupoTipoVeiculo")
    private Long codigoGrupoTipoVeiculo;
    @JsonProperty("DanoVeiculo")
    private Long danoVeiculo;
    @JsonProperty("IdentificadorVeiculoSegurado")
    private String identificadorVeiculoSegurado;
    @JsonProperty("Renavam")
    private Long renavam;
    @JsonProperty("Placa")
    private String placa;
    @JsonProperty("UF")
    private UF_ uF;
    @JsonProperty("Marca")
    private Marca marca;
    @JsonProperty("Cor")
    private Cor cor;
    @JsonProperty("AnoFabricacao")
    private Long anoFabricacao;
    @JsonProperty("AnoModelo")
    private Long anoModelo;
    @JsonProperty("Municipio")
    private Municipio_ municipio;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public Veiculo() {
    }

    /**
     * 
     * @param anoFabricacao
     * @param codigoSituacaoVeiculo
     * @param cor
     * @param codigoSequencial
     * @param danoVeiculo
     * @param renavam
     * @param uF
     * @param marca
     * @param numeroVeiculoSIOPM
     * @param listaAvaria
     * @param observacao
     * @param categoria
     * @param proprietarioNome
     * @param municipio
     * @param chassi
     * @param codigoGrupoTipoVeiculo
     * @param placa
     * @param anoModelo
     * @param codigoTipoVeiculo
     * @param identificadorVeiculoSegurado
     * @param codigoSequencialEnvolvido
     */
    public Veiculo(Long codigoSequencial, Long codigoSequencialEnvolvido, Long numeroVeiculoSIOPM, Long codigoSituacaoVeiculo, Long codigoTipoVeiculo, Long codigoGrupoTipoVeiculo, Long danoVeiculo, String identificadorVeiculoSegurado, Long renavam, String placa, UF_ uF, Marca marca, Cor cor, Long anoFabricacao, Long anoModelo, Municipio_ municipio, String chassi, Categoria categoria, List<ListaAvarium> listaAvaria, String observacao, String proprietarioNome) {
        super();
        this.codigoSequencial = codigoSequencial;
        this.codigoSequencialEnvolvido = codigoSequencialEnvolvido;
        this.numeroVeiculoSIOPM = numeroVeiculoSIOPM;
        this.codigoSituacaoVeiculo = codigoSituacaoVeiculo;
        this.codigoTipoVeiculo = codigoTipoVeiculo;
        this.codigoGrupoTipoVeiculo = codigoGrupoTipoVeiculo;
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

    @JsonProperty("CodigoSituacaoVeiculo")
    public Long getCodigoSituacaoVeiculo() {
        return codigoSituacaoVeiculo;
    }

    @JsonProperty("CodigoSituacaoVeiculo")
    public void setCodigoSituacaoVeiculo(Long codigoSituacaoVeiculo) {
        this.codigoSituacaoVeiculo = codigoSituacaoVeiculo;
    }

    @JsonProperty("CodigoTipoVeiculo")
    public Long getCodigoTipoVeiculo() {
        return codigoTipoVeiculo;
    }

    @JsonProperty("CodigoTipoVeiculo")
    public void setCodigoTipoVeiculo(Long codigoTipoVeiculo) {
        this.codigoTipoVeiculo = codigoTipoVeiculo;
    }

    @JsonProperty("CodigoGrupoTipoVeiculo")
    public Long getCodigoGrupoTipoVeiculo() {
        return codigoGrupoTipoVeiculo;
    }

    @JsonProperty("CodigoGrupoTipoVeiculo")
    public void setCodigoGrupoTipoVeiculo(Long codigoGrupoTipoVeiculo) {
        this.codigoGrupoTipoVeiculo = codigoGrupoTipoVeiculo;
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
    public UF_ getUF() {
        return uF;
    }

    @JsonProperty("UF")
    public void setUF(UF_ uF) {
        this.uF = uF;
    }

    @JsonProperty("Marca")
    public Marca getMarca() {
        return marca;
    }

    @JsonProperty("Marca")
    public void setMarca(Marca marca) {
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
    public Municipio_ getMunicipio() {
        return municipio;
    }

    @JsonProperty("Municipio")
    public void setMunicipio(Municipio_ municipio) {
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
