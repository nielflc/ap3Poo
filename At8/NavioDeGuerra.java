
package pooap3daniel.At8;

public class NavioDeGuerra extends Navio{
    
    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(double blindagem, double ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    public void exibirArmas(){
        
    }
    
    public void poderDeFogo(){
        
    }
    
    @Override
    public void exibirinfoGeral(){
        
    }
    
}
