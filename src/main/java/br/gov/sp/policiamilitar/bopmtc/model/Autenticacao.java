
package br.gov.sp.policiamilitar.bopmtc.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Autenticacao implements Serializable
{
	@JsonProperty("CPF")
    private String CPF;
	@JsonProperty("Senha")
    private String senha;
	@JsonProperty("Imei")
    private Imei imei;
	@JsonProperty("Token")
    private Token token;
	@JsonProperty("ResultadoAcao")
    private ResultadoAcao resultadoAcao;
    private final static long serialVersionUID = 4073727880936545653L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Autenticacao() {
    }

    /**
     * 
     * @param token
     * @param imei
     * @param resultadoAcao
     * @param senha
     * @param cPF
     */
    public Autenticacao(String cPF, String senha, Imei imei, Token token, ResultadoAcao resultadoAcao) {
        super();
        this.CPF = cPF;
        this.senha = senha;
        this.imei = imei;
        this.token = token;
        this.resultadoAcao = resultadoAcao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        this.CPF = cPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Imei getImei() {
        return imei;
    }

    public void setImei(Imei imei) {
        this.imei = imei;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }

    public void setResultadoAcao(ResultadoAcao resultadoAcao) {
        this.resultadoAcao = resultadoAcao;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

	public List<Permissao> getPermissoes() {
		// TODO Auto-generated method stub
		return null;
	}

}
