// ESERCITAZIONE 6
package menu;
import alimenti.*;
import java.util.*;

/**
 *
 * @author zorzr
 */
public class Menu {
    private ArrayList<ElementoMenu> menu;
    
    public Menu() {
        this.menu = new ArrayList();
    }
    
    public boolean add (ElementoMenu el) {
        if (el.getPrezzo() <= 0)  return false;
        
        return menu.add(el);
    }
    
    public boolean remove (Alimento portata) {
        for (ElementoMenu x : menu) {
            if (portata.equals(x.getPortata())) {
                return menu.remove(x);
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        StringJoiner join = new StringJoiner("\n");
        
        for (ElementoMenu el : menu) {
            join = join.add(el.toString());
        }
        
        return join.toString();
    }
    
    // Non richiesto ma utile
    public ArrayList<ElementoMenu> getList() {
        return menu;
    }
}
