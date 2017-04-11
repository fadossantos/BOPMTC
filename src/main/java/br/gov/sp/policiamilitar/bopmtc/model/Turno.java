
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identificador",
    "DataHoraInicio",
    "DataHoraFim"
})
public class Turno {

    @JsonProperty("Identificador")
    private int identificador;
    @JsonProperty("DataHoraInicio")
    private String dataHoraInicio;
    @JsonProperty("DataHoraFim")
    private String dataHoraFim;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Turno() {
    }

    /**
     * 
     * @param dataHoraFim
     * @param identificador
     * @param dataHoraInicio
     */
    public Turno(int identificador, String dataHoraInicio, String dataHoraFim) {
        super();
        this.identificador = identificador;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    @JsonProperty("Identificador")
    public int getIdentificador() {
        return identificador;
    }

    @JsonProperty("Identificador")
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @JsonProperty("DataHoraInicio")
    public String getDataHoraInicio() {
        return dataHoraInicio;
    }

    @JsonProperty("DataHoraInicio")
    public void setDataHoraInicio(String dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    @JsonProperty("DataHoraFim")
    public String getDataHoraFim() {
        return dataHoraFim;
    }

    @JsonProperty("DataHoraFim")
    public void setDataHoraFim(String dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
