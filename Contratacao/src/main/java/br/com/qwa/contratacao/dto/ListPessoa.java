package br.com.qwa.contratacao.dto;

import br.com.qwa.contratacao.model.Pessoa;

import java.util.List;

public class ListPessoa {
    private List<Pessoa> listPessoa;
    private Integer size;

    public ListPessoa(List<Pessoa> listPessoa){
        this.listPessoa = listPessoa;
        this.size = listPessoa.size();
    }

    @Override
    public String toString() {
        return "ListPessoa{"
                 + listPessoa +
                "} size=" + size;
    }
}
