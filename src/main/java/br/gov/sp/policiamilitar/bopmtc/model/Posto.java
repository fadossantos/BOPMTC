
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Codigo",
    "Descricao",
    "Sigla"
})
public class Posto {

    @JsonProperty("Codigo")
    private Long codigo;
    @JsonProperty("Descricao")
    private String descricao;
    @JsonProperty("Sigla")
    private String sigla;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Posto() {
    }

    /**
     * 
     * @param codigo
     * @param sigla
     * @param descricao
     */
    public Posto(Long codigo, String descricao, String sigla) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.sigla = sigla;
    }

    @JsonProperty("Codigo")
    public Long getCodigo() {
        return codigo;
    }

    @JsonProperty("Codigo")
    public void setCodigo(Long codigo) {
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

    @JsonProperty("Sigla")
    public String getSigla() {
        return sigla;
    }

    @JsonProperty("Sigla")
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
