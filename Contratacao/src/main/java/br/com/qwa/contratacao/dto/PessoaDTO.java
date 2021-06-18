package br.com.qwa.contratacao.dto;

import java.util.Calendar;

public class PessoaDTO {
    private String name;
    private String lastName;
    private String cpf;
    private Calendar dateBorn;

    public PessoaDTO() {

    }

    public PessoaDTO(String name, String lastName, String cpf, Calendar dateBorn) {
        this.name = name;
        this.lastName = lastName;
        this.cpf = cpf;
        this.dateBorn = dateBorn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Calendar dateBorn) {
        this.dateBorn = dateBorn;
    }
}
