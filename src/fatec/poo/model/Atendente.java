package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author Deivi
 */
public class Atendente extends Pessoa{
    private String regFunc;
    private String turno;
    private ArrayList <QuartoHotel> quartoHotel;
    
    //CONSTRUTOR
    public Atendente(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
    }
    
    //SETS
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    //GETS
    public String getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
    //ADD QUARTO HOTEL
    public void addQuartoHotel(QuartoHotel q){
        quartoHotel.add(q);
    }
    
    //REMOVE QUARTO Hotel
    public void removeQuartoHotel(QuartoHotel q){
        for (int i = 0; i < quartoHotel.size(); i++) {
            if(q == quartoHotel.get(i)){
                quartoHotel.remove(i);
            }
        }
    }
    
}
