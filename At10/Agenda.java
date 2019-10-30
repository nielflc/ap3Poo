
package pooap3daniel.At10;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    private int diaSemana;
    private String localConsultorio;
    private String horarioPrimeiraConsulta;
    private String horarioUltimaCOnsulta;

    List<Agenda>listaConsultasAgendadas = new ArrayList<>();
    
    public Agenda() {
    }

    public Agenda(int diaSemana, String localConsultorio, String horarioPrimeiraConsulta, String horarioUltimaCOnsulta) {
        this.diaSemana = diaSemana;
        this.localConsultorio = localConsultorio;
        this.horarioPrimeiraConsulta = horarioPrimeiraConsulta;
        this.horarioUltimaCOnsulta = horarioUltimaCOnsulta;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getLocalConsultorio() {
        return localConsultorio;
    }

    public void setLocalConsultorio(String localConsultorio) {
        this.localConsultorio = localConsultorio;
    }

    public String getHorarioPrimeiraConsulta() {
        return horarioPrimeiraConsulta;
    }

    public void setHorarioPrimeiraConsulta(String horarioPrimeiraConsulta) {
        this.horarioPrimeiraConsulta = horarioPrimeiraConsulta;
    }

    public String getHorarioUltimaCOnsulta() {
        return horarioUltimaCOnsulta;
    }

    public void setHorarioUltimaCOnsulta(String horarioUltimaCOnsulta) {
        this.horarioUltimaCOnsulta = horarioUltimaCOnsulta;
    }

    public List<Agenda> getListaConsultasAgendadas() {
        return listaConsultasAgendadas;
    }

  public void addConsulta(){
      
  }
    
  public void removeConsulta(){
      
      
  }  
  
  
    
}
