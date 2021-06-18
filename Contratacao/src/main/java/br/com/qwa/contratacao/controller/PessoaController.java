package br.com.qwa.contratacao.controller;

import br.com.qwa.contratacao.dto.PessoaDTO;
import br.com.qwa.contratacao.mapper.PessoaMapper;
import br.com.qwa.contratacao.model.Pessoa;
import br.com.qwa.contratacao.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaMapper pessoaMapper;

    public PessoaController(PessoaService pessoaService, PessoaMapper pessoaMapper) {
        this.pessoaService = pessoaService;
        this.pessoaMapper = pessoaMapper;
    }

    @PostMapping
    public ResponseEntity<Pessoa> create(@RequestBody PessoaDTO dto) throws ParseException {
        Pessoa person = pessoaMapper.convertToEntity(dto);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
