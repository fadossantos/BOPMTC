
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Nome",
    "Posto",
    "CPF"
})
public class EncarregadoOcorrencia {

    @JsonProperty("Nome")
    private String nome;
    @JsonProperty("Posto")
    private Posto posto;
    @JsonProperty("CPF")
    private Long cPF;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EncarregadoOcorrencia() {
    }

    /**
     * 
     * @param posto
     * @param nome
     * @param cPF
     */
    public EncarregadoOcorrencia(String nome, Posto posto, Long cPF) {
        super();
        this.nome = nome;
        this.posto = posto;
        this.cPF = cPF;
    }

    @JsonProperty("Nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("Nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("Posto")
    public Posto getPosto() {
        return posto;
    }

    @JsonProperty("Posto")
    public void setPosto(Posto posto) {
        this.posto = posto;
    }

    @JsonProperty("CPF")
    public Long getCPF() {
        return cPF;
    }

    @JsonProperty("CPF")
    public void setCPF(Long cPF) {
        this.cPF = cPF;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
