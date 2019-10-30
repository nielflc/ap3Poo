
package pooap3daniel.At9;

public class Carro {
    
    private double nivelCombustivel;
    private double capacidadeTanque;
    private Equipe equipe;
    private Piloto piloto;
    private Pneu pneu;

    public Carro() {
    }

    public Carro(double nivelCombustivel, double capacidadeTanque, Equipe equipe, Piloto piloto, Pneu pneu) {
        this.nivelCombustivel = nivelCombustivel;
        this.capacidadeTanque = capacidadeTanque;
        this.equipe = equipe;
        this.piloto = piloto;
        this.pneu = pneu;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }
    
    public boolean rodar(double km){
        return true;
    }
    
    
}
