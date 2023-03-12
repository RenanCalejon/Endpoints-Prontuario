package br.com.fiap.prontuario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.prontuario.models.Prontuario;

@RestController
public class ProntuarioController {
    
    @GetMapping("/api/prontuario")
    public Prontuario index(){

        Prontuario prontuario = new Prontuario(
                        "Kanye West", 
                        21,
                        "dre",
                        "20-10-2023",
                        "10:10"
   ); 
       
        return prontuario ;

    }
    
}
