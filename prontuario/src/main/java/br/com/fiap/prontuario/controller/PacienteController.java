package br.com.fiap.prontuario.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.prontuario.models.Paciente;

@RestController
public class PacienteController {
    
    @GetMapping("/api/paciente")
    public Paciente index(){

        Paciente paciente = new Paciente(
                     new BigDecimal(1),
                    "Kanye West", 
                    new BigDecimal(590281565),
                    LocalDate.now(),
                    new BigDecimal(100),
                    new BigDecimal(11-95606-2008)
            ); 
                

         return paciente ;

    }
}
