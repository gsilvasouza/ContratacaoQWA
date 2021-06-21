package br.com.qwa.contratacao.service;

import br.com.qwa.contratacao.model.Pessoa;
import br.com.qwa.contratacao.repository.PessoaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl extends BaseServiceImpl<Pessoa, Integer> implements PessoaService {
    public PessoaServiceImpl(PessoaRepository repository) {
        super(repository);
    }
}
