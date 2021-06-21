package br.com.qwa.contratacao.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
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

    @Override
    public String toString() {
        return "Pessoa{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dateBorn=" + dateBorn.getTime() +
                ", age=" + age +
                ", legalAge=" + legalAge +
                '}';
    }
}
