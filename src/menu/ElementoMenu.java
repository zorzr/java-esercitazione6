// ESERCITAZIONE 6
package menu;
import alimenti.*;

/**
 *
 * @author zorzr
 */

public class ElementoMenu {
    private Alimento portata;
    private double prezzo;
    
    public ElementoMenu(Alimento piatto, double costo) {
        this.portata = piatto;
        this.prezzo = costo;
    }
    
    public String toString() {
        return portata + "\t\t\t" + prezzo;
    }

    
    public Alimento getPortata() {
        return portata;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
    
}
