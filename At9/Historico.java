package pooap3daniel.At9;

public class Historico {

    private int pontos;
    private int numerosVitorias;
    private int numeroPoles;
    private int classificacao;

    public Historico() {
    }

    public Historico(int pontos, int numerosVitorias, int numeroPoles, int classificacao) {
        this.pontos = pontos;
        this.numerosVitorias = numerosVitorias;
        this.numeroPoles = numeroPoles;
        this.classificacao = classificacao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
        
        
    }

    public int getNumerosVitorias() {
        return numerosVitorias ;
    }

    public void setNumerosVitorias(int numerosVitorias) {
        this.numerosVitorias = numerosVitorias;
    }

    public int getNumeroPoles() {
        return numeroPoles;
    }

    public void setNumeroPoles(int numeroPoles) {
        this.numeroPoles = numeroPoles;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;

    }

    public void ganharCorrida() {
        this.setPontos(this.getPontos() + 10);
        this.setNumerosVitorias(this.getNumerosVitorias() + 1);
        
       
    }
    
    public void ganharPole(){
        this.setNumeroPoles(this.getNumeroPoles() + 1);
        this.setPontos(this.getPontos() + 2);
    }
    
    public void classificacao(){
        this.setClassificacao(this.getClassificacao() +2);
        
    }
       
}
