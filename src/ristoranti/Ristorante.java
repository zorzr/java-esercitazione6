// ESERCITAZIONE 6
package ristoranti;
import alimenti.*;
import menu.*;

/**
 *
 * @author zorzr
 */

public class Ristorante extends EsercizioRistorazione {
    public Ristorante(String nome) {
        super(nome);
    }
    
    @Override
    public boolean addElemento (Alimento portata, double prezzo) {
        return menu.add(new ElementoMenu(portata, prezzo));
    }
    
    @Override
    public boolean removeElemento (Alimento portata) {
        return menu.remove(portata);
    }
}
