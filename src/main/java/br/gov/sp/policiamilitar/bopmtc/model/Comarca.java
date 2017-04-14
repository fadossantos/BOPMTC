
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DataHoraComparecimento",
    "Logradouro"
})
public class Comarca {

    @JsonProperty("DataHoraComparecimento")
    private String dataHoraComparecimento;
    @JsonProperty("Logradouro")
    private Logradouro logradouro;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Comarca() {
    }

    /**
     * 
     * @param dataHoraComparecimento
     * @param logradouro
     */
    public Comarca(String dataHoraComparecimento, Logradouro logradouro) {
        super();
        this.dataHoraComparecimento = dataHoraComparecimento;
        this.logradouro = logradouro;
    }

    @JsonProperty("DataHoraComparecimento")
    public String getDataHoraComparecimento() {
        return dataHoraComparecimento;
    }

    @JsonProperty("DataHoraComparecimento")
    public void setDataHoraComparecimento(String dataHoraComparecimento) {
        this.dataHoraComparecimento = dataHoraComparecimento;
    }

    @JsonProperty("Logradouro")
    public Logradouro getLogradouro() {
        return logradouro;
    }

    @JsonProperty("Logradouro")
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
