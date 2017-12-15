// ESERCITAZIONE 6
package alimenti;

/**
 *
 * @author zorzr
 */

public class Vino extends Alimento {
    protected String tipo;
    protected String colore;
    protected double gradazione;
    
    public Vino(String nome, String tipo, String colore, double grad) {
        super(nome);
        this.tipo = tipo;
        this.colore = colore;
        this.gradazione = grad;
    }
    
    @Override
    public String getEtichetta() {
        return nome + "\t\t" + colore + "\t\t" + tipo + "\t\t(" + gradazione + "°)";
    }
}