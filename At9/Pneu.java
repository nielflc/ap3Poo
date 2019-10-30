
package pooap3daniel.At9;

public class Pneu {
    
    protected double pressao;
    protected double qtdBorracha;
    protected String marca;
    protected double fatorDesgaste;

    public Pneu() {
    }

    public Pneu(double pressao, double qtdBorracha, String marca, double fatorDesgaste) {
        this.pressao = pressao;
        this.qtdBorracha = qtdBorracha;
        this.marca = marca;
        this.fatorDesgaste = fatorDesgaste;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public double getQtdBorracha() {
        return qtdBorracha;
    }

    public void setQtdBorracha(double qtdBorracha) {
        this.qtdBorracha = qtdBorracha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getFatorDesgaste() {
        return fatorDesgaste;
        
    }

    public void setFatorDesgaste(double fatorDesgaste) {
        this.fatorDesgaste = fatorDesgaste;
        
        
    }
    
    public void Pneu(double fator){
        
    }
    
    public boolean rodar(double km){
        return true;
    }
    
}
