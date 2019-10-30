package pooap3daniel.At8;

public class NavioMercante extends Navio {

    private double capacidadeCarga;
    private double carga;

    public NavioMercante(double capacidadeCarga, double carga, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void carregamento(int p1) {

        this.capacidadeCarga -= p1 * carga;
        if (capacidadeCarga < 0) {

            System.out.println("Carga não suportada");
            System.out.println("Peso ultrapassado em " + String.format("%.2f",Math.abs(capacidadeCarga)) + " Kg");
        } else {
            System.out.println("Navio carregado!");
            System.out.println("O Navio ainda suporta peso extra de " + String.format("%.2f", capacidadeCarga) + " Kg");
        }

    }

    @Override
    public void exibirinfoGeral() {
        System.out.print("Nome do navio: " + nome);
        System.out.println("Número de Tripulantes: " + numTripulantes);

    }

    @Override
    public String toString() {
        return  "NAVIO MERCANTE" + "\n"
                +"Nome do Navio: " + nome + "\n"
                +"Número de Tripulantes: " + numTripulantes + "\n"
                + "Carga(kg): " + String.format("%.2f", carga) + " Kg" + "\n"
                + "Capacidade de carga(kg): "
                + String.format("%.2f", capacidadeCarga) + " Kg" + "\n";
                
                

    }

}
