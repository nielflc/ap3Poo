package pooap3daniel.At8;

public class PortaAvioes extends NavioDeGuerra {
    
    protected int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    @Override
    public void poderDeFogo(){
        
    }
    
    @Override
    public String toString() {
        return  "PORTA AVIÕES" + "\n"
                +"Nome do Navio: " + nome + "\n"
                + "Número de Tripulantes: " + numTripulantes +"\n"
                + "Número de Aviões: " + numAvioes + "\n"
                + "Blindagem: "
                + String.format("%.2f", blindagem) + "\n"
                + "Ataque: " + String.format("%.2f", ataque) + "\n";
                

    }
    
}
