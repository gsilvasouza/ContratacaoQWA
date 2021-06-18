package br.com.qwa.contratacao.dto;

import java.util.Calendar;

public class PessoaDTO {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Calendar dataNasc;

    public PessoaDTO() {
    }

    public PessoaDTO(String nome, String sobrenome, String cpf, Calendar dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }
}
