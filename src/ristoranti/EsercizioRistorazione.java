// ESERCITAZIONE 6
package ristoranti;
import alimenti.*;
import menu.*;

/**
 *
 * @author zorzr
 */

public abstract class EsercizioRistorazione {
    protected final String nome;
    protected Menu menu;

    public EsercizioRistorazione(String nome) {
        this.nome = nome;
        this.menu = new Menu();
    }
    
    public abstract boolean addElemento(Alimento portata, double prezzo);
    public abstract boolean removeElemento(Alimento portata);
    
    public void printMenu() {
        System.out.println(menu);
    }

    // Non richiesto ma necessario per semplificare il tester
    public Alimento getAlimento (String nome) {
        for (ElementoMenu el : menu.getList()) {
            if (nome.equals(el.getPortata().getNome())) {
                return el.getPortata();
            }
        }
        return null;
    }
}
