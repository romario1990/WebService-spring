package com.ecomerce.webservice.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Usuario {

    @Id
    private Integer id;

    private String name;
    private Integer codigoSeguranca;
    private Date dataValidade;
    private String login;
    private String numeroCartao;
    private String senha;

    public Usuario() {}

    public Usuario(Integer id, String name, Integer codigoSeguranca, Date dataValidade, String login, String numeroCartao, String senha) {
        this.id = id;
        this.name = name;
        this.codigoSeguranca = codigoSeguranca;
        this.dataValidade = dataValidade;
        this.login = login;
        this.numeroCartao = numeroCartao;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(Integer codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
