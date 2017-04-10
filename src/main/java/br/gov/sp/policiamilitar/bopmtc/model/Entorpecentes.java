
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UnidadeMedida",
    "Quantidade"
})
public class Entorpecentes {

    @JsonProperty("UnidadeMedida")
    private String unidadeMedida;
    @JsonProperty("Quantidade")
    private Long quantidade;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entorpecentes() {
    }

    /**
     * 
     * @param unidadeMedida
     * @param quantidade
     */
    public Entorpecentes(String unidadeMedida, Long quantidade) {
        super();
        this.unidadeMedida = unidadeMedida;
        this.quantidade = quantidade;
    }

    @JsonProperty("UnidadeMedida")
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    @JsonProperty("UnidadeMedida")
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @JsonProperty("Quantidade")
    public Long getQuantidade() {
        return quantidade;
    }

    @JsonProperty("Quantidade")
    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
