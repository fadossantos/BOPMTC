
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Relatorio"
})
public class RelatorioAutoridade {

    @JsonProperty("Relatorio")
    private String relatorio;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RelatorioAutoridade() {
    }

    /**
     * 
     * @param relatorio
     */
    public RelatorioAutoridade(String relatorio) {
        super();
        this.relatorio = relatorio;
    }

    @JsonProperty("Relatorio")
    public String getRelatorio() {
        return relatorio;
    }

    @JsonProperty("Relatorio")
    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
