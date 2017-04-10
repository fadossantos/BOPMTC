
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Codigo",
    "Descricao"
})
public class UF__ {

    @JsonProperty("Codigo")
    private String codigo;
    @JsonProperty("Descricao")
    private String descricao;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UF__() {
    }

    /**
     * 
     * @param codigo
     * @param descricao
     */
    public UF__(String codigo, String descricao) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @JsonProperty("Codigo")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("Codigo")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("Descricao")
    public String getDescricao() {
        return descricao;
    }

    @JsonProperty("Descricao")
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
