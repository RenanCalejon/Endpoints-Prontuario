package br.com.fiap.prontuario.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.prontuario.models.Clinico;

@RestController
public class ClinicoController {

    @GetMapping("/api/clinico")
    public Clinico index(){

        Clinico clinico = new Clinico(

                     new BigDecimal(1),
                    "Doctor Dre", 
                    new BigDecimal(590281565),
                    LocalDate.now(),
                    "dre@hotmail.com",
                    "cardiolozista"
            ); 
                

         return clinico ;

    }
}

