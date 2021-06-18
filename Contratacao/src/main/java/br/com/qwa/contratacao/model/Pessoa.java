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
    private Integer code;

    @Column(name = "nm_pessoa", nullable = false, length = 50)
    private String name;

    @Column(name = "lstNm_pessoa", nullable = false, length = 50)
    private String lastName;

    @Column(name = "cpf_pessoa", nullable = false, length = 14)
    private String cpf;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_nascimento_pessoa", nullable = false)
    private Calendar dateBorn;

    @Column(name = "idade_pessoa", nullable = false, length = 2)
    private Integer age;

    @Column(name = "legalAge_pessoa", nullable = false)
    private Boolean legalAge;

    public Pessoa(Integer code, String name, String lastName, String cpf, Calendar dateBorn, Integer age, Boolean legalAge) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.cpf = cpf;
        this.dateBorn = dateBorn;
        this.age = age;
        this.legalAge = legalAge;
    }

    public Pessoa() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getLegalAge() {
        return legalAge;
    }

    public void setLegalAge(Boolean legalAge) {
        this.legalAge = legalAge;
    }
}
