
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NumeroArmaSIOPM",
    "Calibre",
    "CodigoAcabamento",
    "NumeroSerie",
    "CodigoMarca",
    "CodigoTipo",
    "NumeroRaspado",
    "NumeroRegistro"
})
public class Arma {

    @JsonProperty("NumeroArmaSIOPM")
    private Long numeroArmaSIOPM;
    @JsonProperty("Calibre")
    private String calibre;
    @JsonProperty("CodigoAcabamento")
    private Long codigoAcabamento;
    @JsonProperty("NumeroSerie")
    private String numeroSerie;
    @JsonProperty("CodigoMarca")
    private Long codigoMarca;
    @JsonProperty("CodigoTipo")
    private Long codigoTipo;
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
     * @param codigoTipo
     * @param numeroRaspado
     * @param codigoMarca
     * @param codigoAcabamento
     * @param numeroRegistro
     * @param numeroSerie
     * @param numeroArmaSIOPM
     * @param calibre
     */
    public Arma(Long numeroArmaSIOPM, String calibre, Long codigoAcabamento, String numeroSerie, Long codigoMarca, Long codigoTipo, Boolean numeroRaspado, String numeroRegistro) {
        super();
        this.numeroArmaSIOPM = numeroArmaSIOPM;
        this.calibre = calibre;
        this.codigoAcabamento = codigoAcabamento;
        this.numeroSerie = numeroSerie;
        this.codigoMarca = codigoMarca;
        this.codigoTipo = codigoTipo;
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
    public String getCalibre() {
        return calibre;
    }

    @JsonProperty("Calibre")
    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    @JsonProperty("CodigoAcabamento")
    public Long getCodigoAcabamento() {
        return codigoAcabamento;
    }

    @JsonProperty("CodigoAcabamento")
    public void setCodigoAcabamento(Long codigoAcabamento) {
        this.codigoAcabamento = codigoAcabamento;
    }

    @JsonProperty("NumeroSerie")
    public String getNumeroSerie() {
        return numeroSerie;
    }

    @JsonProperty("NumeroSerie")
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @JsonProperty("CodigoMarca")
    public Long getCodigoMarca() {
        return codigoMarca;
    }

    @JsonProperty("CodigoMarca")
    public void setCodigoMarca(Long codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    @JsonProperty("CodigoTipo")
    public Long getCodigoTipo() {
        return codigoTipo;
    }

    @JsonProperty("CodigoTipo")
    public void setCodigoTipo(Long codigoTipo) {
        this.codigoTipo = codigoTipo;
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
