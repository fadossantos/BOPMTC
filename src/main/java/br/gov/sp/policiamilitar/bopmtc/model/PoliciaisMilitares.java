
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Nome",
    "NomeGuerra",
    "RE",
    "REDigito",
    "OPM",
    "Posto",
    "Foto",
    "Turno",
    "UnidadeServico"
})
public class PoliciaisMilitares {

    @JsonProperty("Nome")
    private String nome;
    @JsonProperty("NomeGuerra")
    private String nomeGuerra;
    @JsonProperty("RE")
    private int rE;
    @JsonProperty("REDigito")
    private String rEDigito;
    @JsonProperty("OPM")
    private OPM oPM;
    @JsonProperty("Posto")
    private Posto posto;
    @JsonProperty("Foto")
    private String foto;
    @JsonProperty("Turno")
    private Turno turno;
    @JsonProperty("UnidadeServico")
    private UnidadeServico unidadeServico;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PoliciaisMilitares() {
    }

    /**
     * 
     * @param nomeGuerra
     * @param rEDigito
     * @param posto
     * @param oPM
     * @param turno
     * @param nome
     * @param unidadeServico
     * @param foto
     * @param rE
     */
    public PoliciaisMilitares(String nome, String nomeGuerra, int rE, String rEDigito, OPM oPM, Posto posto, String foto, Turno turno, UnidadeServico unidadeServico) {
        super();
        this.nome = nome;
        this.nomeGuerra = nomeGuerra;
        this.rE = rE;
        this.rEDigito = rEDigito;
        this.oPM = oPM;
        this.posto = posto;
        this.foto = foto;
        this.turno = turno;
        this.unidadeServico = unidadeServico;
    }

    @JsonProperty("Nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("Nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("NomeGuerra")
    public String getNomeGuerra() {
        return nomeGuerra;
    }

    @JsonProperty("NomeGuerra")
    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    @JsonProperty("RE")
    public int getRE() {
        return rE;
    }

    @JsonProperty("RE")
    public void setRE(int rE) {
        this.rE = rE;
    }

    @JsonProperty("REDigito")
    public String getREDigito() {
        return rEDigito;
    }

    @JsonProperty("REDigito")
    public void setREDigito(String rEDigito) {
        this.rEDigito = rEDigito;
    }

    @JsonProperty("OPM")
    public OPM getOPM() {
        return oPM;
    }

    @JsonProperty("OPM")
    public void setOPM(OPM oPM) {
        this.oPM = oPM;
    }

    @JsonProperty("Posto")
    public Posto getPosto() {
        return posto;
    }

    @JsonProperty("Posto")
    public void setPosto(Posto posto) {
        this.posto = posto;
    }

    @JsonProperty("Foto")
    public String getFoto() {
        return foto;
    }

    @JsonProperty("Foto")
    public void setFoto(String foto) {
        this.foto = foto;
    }

    @JsonProperty("Turno")
    public Turno getTurno() {
        return turno;
    }

    @JsonProperty("Turno")
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @JsonProperty("UnidadeServico")
    public UnidadeServico getUnidadeServico() {
        return unidadeServico;
    }

    @JsonProperty("UnidadeServico")
    public void setUnidadeServico(UnidadeServico unidadeServico) {
        this.unidadeServico = unidadeServico;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
