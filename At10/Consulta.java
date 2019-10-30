package pooap3daniel.At10;

import java.util.Date;

public class Consulta {

    private Date data;
    private String hora;
    private Date dataLimiteMarcacaoConsulta;
    private boolean encaixe;
    private int limiteEncaixe = 3;
    
    private Paciente paciente;
    private Agenda agenda;

    public Consulta() {
    }

    public Consulta(Date data, String hora, Date dataLimiteMarcacaoConsulta, boolean encaixe, Paciente paciente, Agenda agenda) {
        this.data = data;
        this.hora = hora;
        this.dataLimiteMarcacaoConsulta = dataLimiteMarcacaoConsulta;
        this.encaixe = encaixe;
        this.paciente = paciente;
        this.agenda = agenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getDataLimiteMarcacaoConsulta() {
        return dataLimiteMarcacaoConsulta;
    }

    public void setDataLimiteMarcacaoConsulta(Date dataLimiteMarcacaoConsulta) {
        this.dataLimiteMarcacaoConsulta = dataLimiteMarcacaoConsulta;
    }

    public boolean isEncaixe() {
        return encaixe;
    }

    public void setEncaixe(boolean encaixe) {
        this.encaixe = encaixe;
    }

    public int getLimiteEncaixe() {
        return limiteEncaixe;
    }

    public void setLimiteEncaixe(int limiteEncaixe) {
        this.limiteEncaixe = limiteEncaixe;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    
    public void marcarConsulta(String dadosConsulta){
        
        
    }
    
    
}
