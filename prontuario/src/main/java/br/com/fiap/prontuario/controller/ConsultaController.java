package br.com.fiap.prontuario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.prontuario.models.Consulta;

@RestController
public class ConsultaController {


    @GetMapping("/api/consulta")
    public Consulta index(){

        Consulta consulta = new Consulta(
                    "Kanye West", 
                    "dre",
                    "20-10-2023",
                    "10:10"
   ); 
       
        return consulta ;

    }
}       
