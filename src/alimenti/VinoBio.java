// ESERCITAZIONE 6
package alimenti;

/**
 *
 * @author zorzr
 */

public class VinoBio extends Vino implements Biologico {
    private String codice;
            
    public VinoBio(String nome, String tipo, String colore, double grad, String cod_track) {
        super(nome, tipo, colore, grad);
        this.codice = cod_track;
    }

    @Override
    public String getCodice() {
        return codice;
    }
    
    @Override
    public String getEtichetta() {
        return super.getEtichetta() + "\t\t" + codice;
    }
}