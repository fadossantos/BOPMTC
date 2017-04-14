
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Numero",
    "CodigoTipo",
    "Endereco",
    "Nome",
    "TipoExtensao",
    "IdentificadorTipo"
})
public class Anexo {

    @JsonProperty("Numero")
    private Long numero;
    @JsonProperty("CodigoTipo")
    private Long codigoTipo;
    @JsonProperty("Endereco")
    private String endereco;
    @JsonProperty("Nome")
    private String nome;
    @JsonProperty("TipoExtensao")
    private String tipoExtensao;
    @JsonProperty("IdentificadorTipo")
    private Long identificadorTipo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Anexo() {
    }

    /**
     * 
     * @param codigoTipo
     * @param identificadorTipo
     * @param tipoExtensao
     * @param nome
     * @param endereco
     * @param numero
     */
    public Anexo(Long numero, Long codigoTipo, String endereco, String nome, String tipoExtensao, Long identificadorTipo) {
        super();
        this.numero = numero;
        this.codigoTipo = codigoTipo;
        this.endereco = endereco;
        this.nome = nome;
        this.tipoExtensao = tipoExtensao;
        this.identificadorTipo = identificadorTipo;
    }

    @JsonProperty("Numero")
    public Long getNumero() {
        return numero;
    }

    @JsonProperty("Numero")
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @JsonProperty("CodigoTipo")
    public Long getCodigoTipo() {
        return codigoTipo;
    }

    @JsonProperty("CodigoTipo")
    public void setCodigoTipo(Long codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    @JsonProperty("Endereco")
    public String getEndereco() {
        return endereco;
    }

    @JsonProperty("Endereco")
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @JsonProperty("Nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("Nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("TipoExtensao")
    public String getTipoExtensao() {
        return tipoExtensao;
    }

    @JsonProperty("TipoExtensao")
    public void setTipoExtensao(String tipoExtensao) {
        this.tipoExtensao = tipoExtensao;
    }

    @JsonProperty("IdentificadorTipo")
    public Long getIdentificadorTipo() {
        return identificadorTipo;
    }

    @JsonProperty("IdentificadorTipo")
    public void setIdentificadorTipo(Long identificadorTipo) {
        this.identificadorTipo = identificadorTipo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
