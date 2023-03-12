package br.com.fiap.prontuario.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Clinico {
    
    private BigDecimal clinico_id;
    private String nome;
    private BigDecimal cpf;
    private LocalDate data;
    private String email;
    private String especializacao;

    public Clinico(BigDecimal clinico_id, String nome, BigDecimal cpf, LocalDate data, String email,
            String especializacao) {
        this.clinico_id = clinico_id;
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.email = email;
        this.especializacao = especializacao;
    }

    public BigDecimal getClinico_id() {
        return clinico_id;
    }

    public void setClinico_id(BigDecimal clinico_id) {
        this.clinico_id = clinico_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getCpf() {
        return cpf;
    }

    public void setCpf(BigDecimal cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "Clinico [clinico_id=" + clinico_id + ", nome=" + nome + ", cpf=" + cpf + ", data=" + data + ", email="
                + email + ", especializacao=" + especializacao + "]";
    }

}

