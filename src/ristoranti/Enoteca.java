// ESERCITAZIONE 6
package ristoranti;
import alimenti.*;
import menu.*;

/**
 *
 * @author zorzr
 */

public class Enoteca extends EsercizioRistorazione {
    public Enoteca(String nome) {
        super(nome);
    }
    
    @Override
    public boolean addElemento (Alimento portata, double prezzo) {
        if (portata instanceof Vino) {
            return menu.add(new ElementoMenu(portata, prezzo));
        }
        else return false;
    }
    
    @Override
    public boolean removeElemento (Alimento portata) {
        return menu.remove(portata);
    }
}
