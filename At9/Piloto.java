
package pooap3daniel.At9;

public class Piloto {
    
    private String nome;
    protected Historico historico;

    public Piloto() {
    }

    
    public Piloto(String nome, Historico historico) {
        this.nome = nome;
        this.historico = historico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Historico getHistorico() {
        return historico;
       
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }
    
    public String Status(){
        return "Piloto: " + this.getNome()+ "\n"
              + "Pontos: " + historico.getPontos() + "\n"
              + "Número de vitórias: " + historico.getNumerosVitorias() + "\n"
              + "Número de Poles: " + historico.getNumeroPoles() + "\n"
              + "Classificação: " + historico.getClassificacao();
    }
    
  
    
    
}
