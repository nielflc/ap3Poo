package pooap3daniel.At10;

public class Telefone {
    
    private String numero;
    private String tipo;
    private String obs;

    public Telefone() {
    }

    public Telefone(String numero, String tipo, String obs) {
        this.numero = numero;
        this.tipo = tipo;
        this.obs = obs;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
    
}
