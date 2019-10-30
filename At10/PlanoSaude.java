package pooap3daniel.At10;

import java.util.ArrayList;
import java.util.List;

public class PlanoSaude {
    
    private String nome;
    private int limiteConsultaMes;
    
    private List<Paciente> listaPaciente = new ArrayList<>();

    public PlanoSaude() {
    }

    public PlanoSaude(String nome, int limiteConsultaMes) {
        this.nome = nome;
        this.limiteConsultaMes = limiteConsultaMes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLimiteConsultaMes() {
        return limiteConsultaMes;
    }

    public void setLimiteConsultaMes(int limiteConsultaMes) {
        this.limiteConsultaMes = limiteConsultaMes;
    }

    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public void addPaciente(){
        
        
    }
    
    public void removePaciente(){
        
        
    }
    
    
    
}
