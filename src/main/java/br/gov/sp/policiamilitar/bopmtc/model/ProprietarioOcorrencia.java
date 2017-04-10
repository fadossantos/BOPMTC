
package br.gov.sp.policiamilitar.bopmtc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ImeiDispositivo",
    "NomePatrulheiro",
    "CpfPatrulheiro",
    "NumeroUnidadeServico",
    "CadPatrulha",
    "EncarregadoOcorrencia"
})
public class ProprietarioOcorrencia {

    @JsonProperty("ImeiDispositivo")
    private String imeiDispositivo;
    @JsonProperty("NomePatrulheiro")
    private String nomePatrulheiro;
    @JsonProperty("CpfPatrulheiro")
    private Long cpfPatrulheiro;
    @JsonProperty("NumeroUnidadeServico")
    private String numeroUnidadeServico;
    @JsonProperty("CadPatrulha")
    private Long cadPatrulha;
    @JsonProperty("EncarregadoOcorrencia")
    private EncarregadoOcorrencia encarregadoOcorrencia;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProprietarioOcorrencia() {
    }

    /**
     * 
     * @param cadPatrulha
     * @param numeroUnidadeServico
     * @param encarregadoOcorrencia
     * @param nomePatrulheiro
     * @param cpfPatrulheiro
     * @param imeiDispositivo
     */
    public ProprietarioOcorrencia(String imeiDispositivo, String nomePatrulheiro, Long cpfPatrulheiro, String numeroUnidadeServico, Long cadPatrulha, EncarregadoOcorrencia encarregadoOcorrencia) {
        super();
        this.imeiDispositivo = imeiDispositivo;
        this.nomePatrulheiro = nomePatrulheiro;
        this.cpfPatrulheiro = cpfPatrulheiro;
        this.numeroUnidadeServico = numeroUnidadeServico;
        this.cadPatrulha = cadPatrulha;
        this.encarregadoOcorrencia = encarregadoOcorrencia;
    }

    @JsonProperty("ImeiDispositivo")
    public String getImeiDispositivo() {
        return imeiDispositivo;
    }

    @JsonProperty("ImeiDispositivo")
    public void setImeiDispositivo(String imeiDispositivo) {
        this.imeiDispositivo = imeiDispositivo;
    }

    @JsonProperty("NomePatrulheiro")
    public String getNomePatrulheiro() {
        return nomePatrulheiro;
    }

    @JsonProperty("NomePatrulheiro")
    public void setNomePatrulheiro(String nomePatrulheiro) {
        this.nomePatrulheiro = nomePatrulheiro;
    }

    @JsonProperty("CpfPatrulheiro")
    public Long getCpfPatrulheiro() {
        return cpfPatrulheiro;
    }

    @JsonProperty("CpfPatrulheiro")
    public void setCpfPatrulheiro(Long cpfPatrulheiro) {
        this.cpfPatrulheiro = cpfPatrulheiro;
    }

    @JsonProperty("NumeroUnidadeServico")
    public String getNumeroUnidadeServico() {
        return numeroUnidadeServico;
    }

    @JsonProperty("NumeroUnidadeServico")
    public void setNumeroUnidadeServico(String numeroUnidadeServico) {
        this.numeroUnidadeServico = numeroUnidadeServico;
    }

    @JsonProperty("CadPatrulha")
    public Long getCadPatrulha() {
        return cadPatrulha;
    }

    @JsonProperty("CadPatrulha")
    public void setCadPatrulha(Long cadPatrulha) {
        this.cadPatrulha = cadPatrulha;
    }

    @JsonProperty("EncarregadoOcorrencia")
    public EncarregadoOcorrencia getEncarregadoOcorrencia() {
        return encarregadoOcorrencia;
    }

    @JsonProperty("EncarregadoOcorrencia")
    public void setEncarregadoOcorrencia(EncarregadoOcorrencia encarregadoOcorrencia) {
        this.encarregadoOcorrencia = encarregadoOcorrencia;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
