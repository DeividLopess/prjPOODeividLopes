package fatec.poo.model;

/**
 *
 * @author Deivid
 */
public class Hospede extends Pessoa{
    private String cpf;
    private double txDesconto;
    private QuartoHotel quartoHotel;
    
    //CONSTRUTOR
    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }
    
    //SETS
    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto/100;
    }

    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }
    
    //GETS
    public String getCpf() {
        return cpf;
    }

    public double getTxDesconto() {
        return txDesconto;
    }

    public QuartoHotel getQuartoHotel() {
        return quartoHotel;
    }
    
    
    
    
    
}
