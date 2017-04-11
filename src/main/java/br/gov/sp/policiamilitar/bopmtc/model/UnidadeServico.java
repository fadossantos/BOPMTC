
package br.gov.sp.policiamilitar.bopmtc.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identificador",
    "CodigoTurno",
    "CadPatrulha",
    "PoliciaisMilitares",
    "Viaturas"
})
public class UnidadeServico {

    @JsonProperty("Identificador")
    private String identificador;
    @JsonProperty("CodigoTurno")
    private int codigoTurno;
    @JsonProperty("CadPatrulha")
    private int cadPatrulha;
    @JsonProperty("PoliciaisMilitares")
    private List<PoliciaisMilitares> policiaisMilitares = new ArrayList<PoliciaisMilitares>();
    @JsonProperty("Viaturas")
    private List<Viatura> viaturas = new ArrayList<Viatura>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UnidadeServico() {
    }

    /**
     * 
     * @param cadPatrulha
     * @param viaturas
     * @param identificador
     * @param policiaisMilitares
     * @param codigoTurno
     */
    public UnidadeServico(String identificador, int codigoTurno, int cadPatrulha, List<PoliciaisMilitares> policiaisMilitares, List<Viatura> viaturas) {
        super();
        this.identificador = identificador;
        this.codigoTurno = codigoTurno;
        this.cadPatrulha = cadPatrulha;
        this.policiaisMilitares = policiaisMilitares;
        this.viaturas = viaturas;
    }

    @JsonProperty("Identificador")
    public String getIdentificador() {
        return identificador;
    }

    @JsonProperty("Identificador")
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @JsonProperty("CodigoTurno")
    public int getCodigoTurno() {
        return codigoTurno;
    }

    @JsonProperty("CodigoTurno")
    public void setCodigoTurno(int codigoTurno) {
        this.codigoTurno = codigoTurno;
    }

    @JsonProperty("CadPatrulha")
    public int getCadPatrulha() {
        return cadPatrulha;
    }

    @JsonProperty("CadPatrulha")
    public void setCadPatrulha(int cadPatrulha) {
        this.cadPatrulha = cadPatrulha;
    }

    @JsonProperty("PoliciaisMilitares")
    public List<PoliciaisMilitares> getPoliciaisMilitares() {
        return policiaisMilitares;
    }

    @JsonProperty("PoliciaisMilitares")
    public void setPoliciaisMilitares(List<PoliciaisMilitares> policiaisMilitares) {
        this.policiaisMilitares = policiaisMilitares;
    }

    @JsonProperty("Viaturas")
    public List<Viatura> getViaturas() {
        return viaturas;
    }

    @JsonProperty("Viaturas")
    public void setViaturas(List<Viatura> viaturas) {
        this.viaturas = viaturas;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
