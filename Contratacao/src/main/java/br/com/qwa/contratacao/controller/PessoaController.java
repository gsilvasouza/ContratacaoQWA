package br.com.qwa.contratacao.controller;

import br.com.qwa.contratacao.dto.ListPessoa;
import br.com.qwa.contratacao.dto.PessoaDTO;
import br.com.qwa.contratacao.mapper.PessoaMapper;
import br.com.qwa.contratacao.model.Pessoa;
import br.com.qwa.contratacao.service.PessoaService;
import br.com.qwa.contratacao.utils.ValidationCPF;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaMapper pessoaMapper;
    private final ValidationCPF validationCPF;

    public PessoaController(PessoaService pessoaService, PessoaMapper pessoaMapper, ValidationCPF validationCPF) {
        this.pessoaService = pessoaService;
        this.pessoaMapper = pessoaMapper;
        this.validationCPF = validationCPF;
    }


    @PostMapping
    @Transactional(rollbackOn = Exception.class)
    public ResponseEntity<Pessoa> save(@RequestBody PessoaDTO dto) throws ParseException {
        Pessoa person = pessoaService.create(pessoaMapper.convertToEntity(dto));
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping("/List/")
    public ResponseEntity<String> saveList(@RequestBody List<PessoaDTO> listDto) throws ParseException, MethodArgumentNotValidException {
        System.out.println(listDto.size());
        if(listDto.size() < 10){
            if(validationCPF.validateCpf(listDto)) {
                for (PessoaDTO dto : listDto) {
                    save(dto);
                }
                return new ResponseEntity<>("Adicionados com sucesso", HttpStatus.OK);
            }
            return new ResponseEntity<>("CPFs duplicados", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("A lista deve possuir um tamanho menor que 10", HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    public ResponseEntity<String> findAll(){
        List<Pessoa> listPessoa= pessoaService.findAll();
        ListPessoa list = new ListPessoa(listPessoa);
        System.out.println(list);
        return new ResponseEntity<String>(list.toString(), HttpStatus.OK);
    }
}
