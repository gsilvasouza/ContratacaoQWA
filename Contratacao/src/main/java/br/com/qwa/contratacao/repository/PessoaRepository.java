package br.com.qwa.contratacao.repository;

import br.com.qwa.contratacao.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
