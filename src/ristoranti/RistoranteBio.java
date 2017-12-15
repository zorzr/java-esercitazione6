// ESERCITAZIONE 6
package ristoranti;
import alimenti.*;
import menu.*;

/**
 *
 * @author zorzr
 */

public class RistoranteBio extends Ristorante {
    public RistoranteBio(String nome) {
        super(nome);
    }
    
    @Override
    public boolean addElemento (Alimento portata, double prezzo) {
        if (portata instanceof Carne || portata instanceof VinoBio) {
            return menu.add(new ElementoMenu(portata, prezzo));
        }
        else return false;
    }
}
