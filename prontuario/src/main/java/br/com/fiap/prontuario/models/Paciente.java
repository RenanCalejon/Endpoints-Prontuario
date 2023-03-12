package br.com.fiap.prontuario.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Paciente {

    private BigDecimal paciente_id;
    private String nome;
    private BigDecimal cpf;
    private LocalDate data;
    private String email;
    private BigDecimal telefone;
    
    public Paciente(BigDecimal paciente_id, String nome, BigDecimal cpf, LocalDate data, Boolean sexo, String email,
            BigDecimal telefone) {
        this.paciente_id = paciente_id;
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.email = email;
        this.telefone = telefone;
    }
    public Paciente(BigDecimal bigDecimal, String string, BigDecimal bigDecimal2, LocalDate now, BigDecimal bigDecimal3,
            BigDecimal bigDecimal4) {
    }
    public BigDecimal getPaciente_id() {
        return paciente_id;
    }
    public void setPaciente_id(BigDecimal paciente_id) {
        this.paciente_id = paciente_id;
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
    public BigDecimal getTelefone() {
        return telefone;
    }
    public void setTelefone(BigDecimal telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Paciente [paciente_id=" + paciente_id + ", nome=" + nome + ", cpf=" + cpf + ", data=" + data + ", email=" + email + ", telefone=" + telefone + "]";
    }
      
}
