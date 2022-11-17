/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Deivi
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;
    
    //CONSTRUTOR
    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }
    //RESERVAR
    public void reservar(Hospede h, Atendente a){
        situacao = true;
        h.setQuartoHotel(this);
        a.addQuartoHotel(this);
        hospede = h;
        atendente = a;
        
    }
    //LIBERAR
    public double liberar(int dias, double taxaDesconto){
        taxaDesconto = taxaDesconto/100;
        double valorHospedagem =0;
        situacao = false;
        dataEntrada ="";
        hospede = null;
        atendente.removeQuartoHotel(this);
        atendente = null;
        valorHospedagem += (dias * valorDiaria) - (dias * taxaDesconto);
        totalFaturado = valorHospedagem;
        return valorHospedagem;
    }
    
    //SETS

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    //GETS

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Atendente getAtendente() {
        return atendente;
    }
    
    
}
