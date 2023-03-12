package br.com.fiap.prontuario.models;

public class Consulta {

    private String paciente;
    private String clinico;
    private String data;
    private String horario;

    public Consulta(String paciente, String medico, String data, String horario) {
        this.paciente = paciente;
        this.clinico = medico;
        this.data = data;
        this.horario = horario;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return clinico;
    }

    public void setMedico(String medico) {
        this.clinico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Consulta [paciente=" + paciente + ", clinico=" + clinico + ", data=" + data + ", horario=" + horario
                + "]";
    }

}

