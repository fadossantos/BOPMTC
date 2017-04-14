
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NumeroArmaSIOPM",
    "Calibre",
    "Acabamento",
    "NumeroSerie",
    "Marca",
    "Tipo",
    "NumeroRaspado",
    "NumeroRegistro"
})
public class Arma {

    @JsonProperty("NumeroArmaSIOPM")
    private Long numeroArmaSIOPM;
    @JsonProperty("Calibre")
    private CalibreArma calibre;
    @JsonProperty("Acabamento")
    private AcabamentoArma acabamento;
    @JsonProperty("NumeroSerie")
    private String numeroSerie;
    @JsonProperty("Marca")
    private MarcaArma marca;
    @JsonProperty("Tipo")
    private TipoArma tipo;
    @JsonProperty("NumeroRaspado")
    private Boolean numeroRaspado;
    @JsonProperty("NumeroRegistro")
    private String numeroRegistro;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Arma() {
    }

    /**
     * 
     * @param numeroRaspado
     * @param acabamento
     * @param numeroRegistro
     * @param tipo
     * @param marca
     * @param numeroSerie
     * @param numeroArmaSIOPM
     * @param calibre
     */
    public Arma(Long numeroArmaSIOPM, CalibreArma calibre, AcabamentoArma acabamento, String numeroSerie, MarcaArma marca, TipoArma tipo, Boolean numeroRaspado, String numeroRegistro) {
        super();
        this.numeroArmaSIOPM = numeroArmaSIOPM;
        this.calibre = calibre;
        this.acabamento = acabamento;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.tipo = tipo;
        this.numeroRaspado = numeroRaspado;
        this.numeroRegistro = numeroRegistro;
    }

    @JsonProperty("NumeroArmaSIOPM")
    public Long getNumeroArmaSIOPM() {
        return numeroArmaSIOPM;
    }

    @JsonProperty("NumeroArmaSIOPM")
    public void setNumeroArmaSIOPM(Long numeroArmaSIOPM) {
        this.numeroArmaSIOPM = numeroArmaSIOPM;
    }

    @JsonProperty("Calibre")
    public CalibreArma getCalibre() {
        return calibre;
    }

    @JsonProperty("Calibre")
    public void setCalibre(CalibreArma calibre) {
        this.calibre = calibre;
    }

    @JsonProperty("Acabamento")
    public AcabamentoArma getAcabamento() {
        return acabamento;
    }

    @JsonProperty("Acabamento")
    public void setAcabamento(AcabamentoArma acabamento) {
        this.acabamento = acabamento;
    }

    @JsonProperty("NumeroSerie")
    public String getNumeroSerie() {
        return numeroSerie;
    }

    @JsonProperty("NumeroSerie")
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @JsonProperty("Marca")
    public MarcaArma getMarca() {
        return marca;
    }

    @JsonProperty("Marca")
    public void setMarca(MarcaArma marca) {
        this.marca = marca;
    }

    @JsonProperty("Tipo")
    public TipoArma getTipo() {
        return tipo;
    }

    @JsonProperty("Tipo")
    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("NumeroRaspado")
    public Boolean getNumeroRaspado() {
        return numeroRaspado;
    }

    @JsonProperty("NumeroRaspado")
    public void setNumeroRaspado(Boolean numeroRaspado) {
        this.numeroRaspado = numeroRaspado;
    }

    @JsonProperty("NumeroRegistro")
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    @JsonProperty("NumeroRegistro")
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
