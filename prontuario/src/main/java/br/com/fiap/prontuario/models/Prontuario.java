package br.com.fiap.prontuario.models;

public class Prontuario {
    private String nomePaciente;
    private int idade;
    private String sintomas;
    private String diagnostico;
    private String medicamentos;

    public Prontuario(String nomePaciente, int idade, String sintomas, String diagnostico, String medicamentos) {
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.medicamentos = medicamentos;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Prontuario [nomePaciente=" + nomePaciente + ", idade=" + idade + ", sintomas=" + sintomas
                + ", diagnostico=" + diagnostico + ", medicamentos=" + medicamentos + "]";
    }
}

