package pooap3daniel.At10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {

    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String endereco;
    private Date dataNascimeto;
    private String email;
    private boolean planoParticular;

    private PlanoSaude planoSaude;
    private List<Telefone> listaTelefones = new ArrayList<>();
    private List<Consulta> listaConsultas = new ArrayList<>();

    public Paciente() {
    }

    public Paciente(String nome, String endereco, Date dataNascimeto, String email,
            boolean planoParticular, PlanoSaude planoSaude) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimeto = dataNascimeto;
        this.email = email;
        this.planoParticular = planoParticular;
        this.planoSaude = planoSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(Date dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPlanoParticular() {
        return planoParticular;
    }

    public void setPlanoParticular(boolean planoParticular) {
        this.planoParticular = planoParticular;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {

        this.planoSaude = planoSaude;
    }

    public List<Telefone> getListaTelefone() {
        return listaTelefones;
    }

    public List<Consulta> getListaConsulta() {
        return listaConsultas;
    }

    public void addTelefone(Telefone listaTelefone) {
        listaTelefones.add(listaTelefone);
    }

    public void removeTelefone(Telefone listaTelefone) {
        listaTelefones.remove(listaTelefone);
    }

    public void marcarConsulta(Consulta listaConsulta) {
        listaConsultas.add(listaConsulta);
    }

    public void cancelarConsulta(Consulta listaConsulta) {
        listaConsultas.remove(listaConsulta);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n"
                + "Endereço: " + this.getEndereco() + "\n"
                + "Data Nascimento: " + dataFormatada.format(this.getDataNascimeto()) + "\n"
                + "E-mail: " + this.getEmail() + "\n";
    }

}
