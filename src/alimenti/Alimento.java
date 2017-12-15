// ESERCITAZIONE 6
package alimenti;

/**
 *
 * @author zorzr
 */

public abstract class Alimento {
    protected String nome;
    
    public Alimento(String nome) {
        this.nome = nome;
    }
    
    public abstract String getEtichetta();
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return getEtichetta();
    }
    
    //@Override
    public boolean equals (Alimento al) {
        if (al == null)  return false;
        return al.toString().equals(this.toString());
    }
}
