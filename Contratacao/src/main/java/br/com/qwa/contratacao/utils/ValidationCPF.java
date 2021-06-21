package br.com.qwa.contratacao.utils;

import br.com.qwa.contratacao.dto.PessoaDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ValidationCPF {
    public boolean validateCpf(List<PessoaDTO> listDto){
        Boolean equalsCpf = true;
        System.out.println(listDto.size());
        for(int i = 0; i < listDto.size(); i++){
            String cpdDto = listDto.get(i).getCpf();
            System.out.println("CPF 1 : " + cpdDto);
            for(int j = i + 1; j < listDto.size(); j++){
                String cpfDtoCompare = listDto.get(j).getCpf();
                System.out.println("CPF 2 : " + cpfDtoCompare);
                if(cpdDto.equals(cpfDtoCompare)){
                    equalsCpf = false;
                    System.out.println("CPFS IGUAIS");
                    break;
                }
            }
        }
        return equalsCpf;
    }
}
