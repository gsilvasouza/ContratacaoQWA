package br.com.qwa.contratacao.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "TB_PESSOA")
@SequenceGenerator(name = "pessoa", sequenceName = "SQ_TB_PESSOA", allocationSize = 1)
public class Pessoa {
    
    @Id
    @Column(name = "cd_pessoa")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa")
    private Integer codigo;

    @Column(name = "nm_pessoa", nullable = false, length = 50)
    private String nome;

    @Column(name = "sbr_pessoa", nullable = false, length = 50)
    private String sobrenome;

    @Column(name = "cpf_pessoa", nullable = false, length = 14)
    private String cpf;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_nascimento_pessoa", nullable = false)
    private Calendar dataNascimento;

    @Column(name = "idade_pessoa", nullable = false, length = 2)
    private Integer idade;

    @Column(name = "pessoa_maior_idade", nullable = false)
    private Boolean maiorIdade;

    public Pessoa(Integer codigo, String nome, String sobrenome, String cpf, Calendar dataNascimento, Integer idade, Boolean maiorIdade) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.maiorIdade = maiorIdade;
    }

    public Pessoa() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Boolean getMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }
}
