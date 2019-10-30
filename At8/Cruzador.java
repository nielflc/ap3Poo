package pooap3daniel.At8;

public class Cruzador extends NavioDeGuerra{
    
    protected int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }

    @Override
    public void poderDeFogo(){
        
    }
    
    @Override
    public String toString() {
        return  "CRUZADOR" + "\n"
                +"Nome do Navio: " + nome + "\n"
                + "Número de Tripulantes: " + numTripulantes +"\n"
                + "Número de canhões: " + numCanhoes + "\n"
                + "Blindagem: "
                + String.format("%.2f", blindagem) + "\n"
                + "Ataque: " + String.format("%.2f", ataque) + "\n";

    }
    
    
}
