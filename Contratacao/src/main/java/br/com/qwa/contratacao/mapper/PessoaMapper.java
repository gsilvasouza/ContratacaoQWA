package br.com.qwa.contratacao.mapper;

import br.com.qwa.contratacao.dto.PessoaDTO;
import br.com.qwa.contratacao.model.Pessoa;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Component
public class PessoaMapper {

    public Pessoa convertToEntity(PessoaDTO dto) throws ParseException {
        Pessoa entity = new Pessoa();
        //Calendar dateBornDto = connvertToCalendar(dto.getDateBorn());
        Calendar dateBornDto = dto.getDateBorn();
        Integer ageDto = agePerson(dateBornDto);
        entity.setName(dto.getName());
        entity.setLastName(dto.getLastName());
        entity.setCpf(dto.getCpf());
        entity.setDateBorn(dateBornDto);
        entity.setAge(ageDto);
        entity.setLegalAge(legalAge(ageDto));
        return entity;
    }

    private Integer agePerson(Calendar dateBorn){
        Integer today = Calendar.getInstance().get(Calendar.YEAR);
        return today - dateBorn.get(Calendar.YEAR);
    }

    private Boolean legalAge(Integer age){
        return age > 18 ? true : false;
    }

    private Calendar connvertToCalendar(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(date));
        return calendar;
    }

}
