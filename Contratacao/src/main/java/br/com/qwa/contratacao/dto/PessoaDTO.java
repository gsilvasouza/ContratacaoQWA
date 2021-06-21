package br.com.qwa.contratacao.dto;

import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

public class PessoaDTO {
    @NotEmpty(message = "O nome não pode ser nula. Contratação não adicionada")
    @NotNull(message = "O nome não pode ser nula. Contratação não adicionada")
    @NotBlank(message = "O nome não pode ser nula. Contratação não adicionada")
    private String name;
    @NotEmpty(message = "O sobrenome não pode ser vazia. Contratação não adicionada")
    @NotNull(message = "O sobrenome não pode ser vazia. Contratação não adicionada")
    private String lastName;
    @NotEmpty(message = "O cpf não pode ser vazia. Contratação não adicionada")
    @NotNull(message = "O sobrenome não pode ser vazia. Contratação não adicionada")
    private String cpf;
    @NotEmpty(message = "A data de nascimento não pode ser vazia. Contratação não adicionada")
    @NotNull(message = "O sobrenome não pode ser vazia. Contratação não adicionada")
    @Temporal(TemporalType.DATE)
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
