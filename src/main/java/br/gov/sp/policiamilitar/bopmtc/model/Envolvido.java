
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
    "NumeroPessoaSIOPM",
    "CodigoSituacao",
    "Nome",
    "RG",
    "UFRG",
    "CPF",
    "Pai",
    "Mae",
    "Nacionalidade",
    "Naturalidade",
    "UFNaturalidade",
    "Sexo",
    "DataNascimento",
    "Cutis",
    "Cnh",
    "EstadoCivil",
    "Profissao",
    "Contato",
    "VersaoEnvolvido",
    "RecusaAssinatura",
    "Analfabeta",
    "Proprietario"
})
public class Envolvido {

    @JsonProperty("CodigoSequencial")
    private Long codigoSequencial;
    @JsonProperty("NumeroPessoaSIOPM")
    private Long numeroPessoaSIOPM;
    @JsonProperty("CodigoSituacao")
    private String codigoSituacao;
    @JsonProperty("Nome")
    private String nome;
    @JsonProperty("RG")
    private String rG;
    @JsonProperty("UFRG")
    private UFRG uFRG;
    @JsonProperty("CPF")
    private Long cPF;
    @JsonProperty("Pai")
    private String pai;
    @JsonProperty("Mae")
    private String mae;
    @JsonProperty("Nacionalidade")
    private String nacionalidade;
    @JsonProperty("Naturalidade")
    private String naturalidade;
    @JsonProperty("UFNaturalidade")
    private UFNaturalidade uFNaturalidade;
    @JsonProperty("Sexo")
    private String sexo;
    @JsonProperty("DataNascimento")
    private String dataNascimento;
    @JsonProperty("Cutis")
    private Cutis cutis;
    @JsonProperty("Cnh")
    private Cnh cnh;
    @JsonProperty("EstadoCivil")
    private Long estadoCivil;
    @JsonProperty("Profissao")
    private Profissao profissao;
    @JsonProperty("Contato")
    private List<Contato> contato = new ArrayList<Contato>();
    @JsonProperty("VersaoEnvolvido")
    private String versaoEnvolvido;
    @JsonProperty("RecusaAssinatura")
    private Boolean recusaAssinatura;
    @JsonProperty("Analfabeta")
    private Boolean analfabeta;
    @JsonProperty("Proprietario")
    private Boolean proprietario;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Envolvido() {
    }

    /**
     * 
     * @param proprietario
     * @param recusaAssinatura
     * @param contato
     * @param nacionalidade
     * @param versaoEnvolvido
     * @param codigoSituacao
     * @param estadoCivil
     * @param codigoSequencial
     * @param naturalidade
     * @param rG
     * @param sexo
     * @param pai
     * @param cPF
     * @param cutis
     * @param cnh
     * @param mae
     * @param numeroPessoaSIOPM
     * @param uFNaturalidade
     * @param uFRG
     * @param profissao
     * @param dataNascimento
     * @param nome
     * @param analfabeta
     */
    public Envolvido(Long codigoSequencial, Long numeroPessoaSIOPM, String codigoSituacao, String nome, String rG, UFRG uFRG, Long cPF, String pai, String mae, String nacionalidade, String naturalidade, UFNaturalidade uFNaturalidade, String sexo, String dataNascimento, Cutis cutis, Cnh cnh, Long estadoCivil, Profissao profissao, List<Contato> contato, String versaoEnvolvido, Boolean recusaAssinatura, Boolean analfabeta, Boolean proprietario) {
        super();
        this.codigoSequencial = codigoSequencial;
        this.numeroPessoaSIOPM = numeroPessoaSIOPM;
        this.codigoSituacao = codigoSituacao;
        this.nome = nome;
        this.rG = rG;
        this.uFRG = uFRG;
        this.cPF = cPF;
        this.pai = pai;
        this.mae = mae;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.uFNaturalidade = uFNaturalidade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cutis = cutis;
        this.cnh = cnh;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.contato = contato;
        this.versaoEnvolvido = versaoEnvolvido;
        this.recusaAssinatura = recusaAssinatura;
        this.analfabeta = analfabeta;
        this.proprietario = proprietario;
    }

    @JsonProperty("CodigoSequencial")
    public Long getCodigoSequencial() {
        return codigoSequencial;
    }

    @JsonProperty("CodigoSequencial")
    public void setCodigoSequencial(Long codigoSequencial) {
        this.codigoSequencial = codigoSequencial;
    }

    @JsonProperty("NumeroPessoaSIOPM")
    public Long getNumeroPessoaSIOPM() {
        return numeroPessoaSIOPM;
    }

    @JsonProperty("NumeroPessoaSIOPM")
    public void setNumeroPessoaSIOPM(Long numeroPessoaSIOPM) {
        this.numeroPessoaSIOPM = numeroPessoaSIOPM;
    }

    @JsonProperty("CodigoSituacao")
    public String getCodigoSituacao() {
        return codigoSituacao;
    }

    @JsonProperty("CodigoSituacao")
    public void setCodigoSituacao(String codigoSituacao) {
        this.codigoSituacao = codigoSituacao;
    }

    @JsonProperty("Nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("Nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("RG")
    public String getRG() {
        return rG;
    }

    @JsonProperty("RG")
    public void setRG(String rG) {
        this.rG = rG;
    }

    @JsonProperty("UFRG")
    public UFRG getUFRG() {
        return uFRG;
    }

    @JsonProperty("UFRG")
    public void setUFRG(UFRG uFRG) {
        this.uFRG = uFRG;
    }

    @JsonProperty("CPF")
    public Long getCPF() {
        return cPF;
    }

    @JsonProperty("CPF")
    public void setCPF(Long cPF) {
        this.cPF = cPF;
    }

    @JsonProperty("Pai")
    public String getPai() {
        return pai;
    }

    @JsonProperty("Pai")
    public void setPai(String pai) {
        this.pai = pai;
    }

    @JsonProperty("Mae")
    public String getMae() {
        return mae;
    }

    @JsonProperty("Mae")
    public void setMae(String mae) {
        this.mae = mae;
    }

    @JsonProperty("Nacionalidade")
    public String getNacionalidade() {
        return nacionalidade;
    }

    @JsonProperty("Nacionalidade")
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @JsonProperty("Naturalidade")
    public String getNaturalidade() {
        return naturalidade;
    }

    @JsonProperty("Naturalidade")
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    @JsonProperty("UFNaturalidade")
    public UFNaturalidade getUFNaturalidade() {
        return uFNaturalidade;
    }

    @JsonProperty("UFNaturalidade")
    public void setUFNaturalidade(UFNaturalidade uFNaturalidade) {
        this.uFNaturalidade = uFNaturalidade;
    }

    @JsonProperty("Sexo")
    public String getSexo() {
        return sexo;
    }

    @JsonProperty("Sexo")
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @JsonProperty("DataNascimento")
    public String getDataNascimento() {
        return dataNascimento;
    }

    @JsonProperty("DataNascimento")
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @JsonProperty("Cutis")
    public Cutis getCutis() {
        return cutis;
    }

    @JsonProperty("Cutis")
    public void setCutis(Cutis cutis) {
        this.cutis = cutis;
    }

    @JsonProperty("Cnh")
    public Cnh getCnh() {
        return cnh;
    }

    @JsonProperty("Cnh")
    public void setCnh(Cnh cnh) {
        this.cnh = cnh;
    }

    @JsonProperty("EstadoCivil")
    public Long getEstadoCivil() {
        return estadoCivil;
    }

    @JsonProperty("EstadoCivil")
    public void setEstadoCivil(Long estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @JsonProperty("Profissao")
    public Profissao getProfissao() {
        return profissao;
    }

    @JsonProperty("Profissao")
    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    @JsonProperty("Contato")
    public List<Contato> getContato() {
        return contato;
    }

    @JsonProperty("Contato")
    public void setContato(List<Contato> contato) {
        this.contato = contato;
    }

    @JsonProperty("VersaoEnvolvido")
    public String getVersaoEnvolvido() {
        return versaoEnvolvido;
    }

    @JsonProperty("VersaoEnvolvido")
    public void setVersaoEnvolvido(String versaoEnvolvido) {
        this.versaoEnvolvido = versaoEnvolvido;
    }

    @JsonProperty("RecusaAssinatura")
    public Boolean getRecusaAssinatura() {
        return recusaAssinatura;
    }

    @JsonProperty("RecusaAssinatura")
    public void setRecusaAssinatura(Boolean recusaAssinatura) {
        this.recusaAssinatura = recusaAssinatura;
    }

    @JsonProperty("Analfabeta")
    public Boolean getAnalfabeta() {
        return analfabeta;
    }

    @JsonProperty("Analfabeta")
    public void setAnalfabeta(Boolean analfabeta) {
        this.analfabeta = analfabeta;
    }

    @JsonProperty("Proprietario")
    public Boolean getProprietario() {
        return proprietario;
    }

    @JsonProperty("Proprietario")
    public void setProprietario(Boolean proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
