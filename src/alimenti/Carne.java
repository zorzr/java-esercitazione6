// ESERCITAZIONE 6
package alimenti;

/**
 *
 * @author zorzr
 */

public class Carne extends Alimento {
    protected String provenienza;
    protected String pezzo;
    
    public Carne(String nome, String luogo, String parte) {
        super(nome);
        this.provenienza = luogo;
        this.pezzo = parte;
    }
    
    @Override
    public String getEtichetta() {
        return nome + "\t\t" + provenienza + "\t\t" + pezzo;
    }
}
