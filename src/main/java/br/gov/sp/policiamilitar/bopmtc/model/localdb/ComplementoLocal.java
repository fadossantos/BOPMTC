
package br.gov.sp.policiamilitar.bopmtc.model.localdb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Codigo",
    "Descricao"
})
@Entity
@NamedQuery(name="ComplementoLocal.findAll", query="SELECT s FROM ComplementoLocal s")
public class ComplementoLocal {
	@Id
    @JsonProperty("Codigo")
    private Long codigo;
    @JsonProperty("Descricao")
    private String descricao;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ComplementoLocal() {
    }

    /**
     * 
     * @param codigo
     * @param descricao
     */
    public ComplementoLocal(Long codigo, String descricao) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
