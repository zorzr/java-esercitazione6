// ESERCITAZIONE 6
import java.io.*;
import alimenti.*;
import ristoranti.*;

/**
 *
 * @author zorzr
 */

public class Tester {
    public static void main(String[] args) {
        EsercizioRistorazione cracco = readRistorante("Cracco");
        cracco.printMenu();
        
        Alimento x = cracco.getAlimento("Brunello tenuta Nuova");
        if (x != null) {
            cracco.removeElemento(x);
            System.out.println("\n");
            cracco.printMenu();
        }
        
        cracco.addElemento(new Carne("Piccione a modo mio", "Piccione", "Petto"), 500.);
        System.out.println("\n");
        cracco.printMenu();
        
        System.exit(0);
    }
    
    
    private static EsercizioRistorazione readRistorante (String nome) {
        Ristorante rist = new Ristorante(nome);
        writeMenu(rist);
        return rist;
    }
    private static EsercizioRistorazione readEnoteca (String nome) {
        Enoteca rist = new Enoteca(nome);
        writeMenu(rist);
        return rist;
    }
    private static EsercizioRistorazione readRistoranteBio (String nome) {
        RistoranteBio rist = new RistoranteBio(nome);
        writeMenu(rist);
        return rist;
    }
    private static EsercizioRistorazione readEnotecaBio (String nome) {
        EnotecaBio rist = new EnotecaBio(nome);
        writeMenu(rist);
        return rist;
    }
    
    private static void writeMenu (EsercizioRistorazione rist) {
        try {
            FileReader file = new FileReader("[PATH]\\menu2.txt");
            BufferedReader in = new BufferedReader(file);
            
            String line;
            String[] param = new String[6];
            int i;
            
            while((line = in.readLine()) != null) {
                switch (line.split("\t")[0]) {
                    case "0":
                        for (i = 0; i < 4; i++) {
                            param[i] = line.split("\t")[i+1];
                        }
                        rist.addElemento(new Carne(param[0], param[1], param[2]), Double.parseDouble(param[3]));
                        break;
                        
                    case "1":
                        for (i = 0; i < 5; i++) {
                            param[i] = line.split("\t")[i+1];
                        }  
                        rist.addElemento(new Vino(param[0], param[2], param[3], Double.parseDouble(param[1])), Double.parseDouble(param[4]));
                        break;
                        
                    case "2":
                        for (i = 0; i < 6; i++) {
                            param[i] = line.split("\t")[i+1];
                        }
                        rist.addElemento(new VinoBio(param[0], param[2], param[3], Double.parseDouble(param[1]), param[4]), Double.parseDouble(param[5]));
                        break;
                        
                    default:
                        break;
                }
            }
            in.close();
            file.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("ERRORE:  File inesistente");
            System.exit(1);
        }
        catch (IOException ex) {
            System.out.println("ERRORE:  Impossibile leggere il file");
            System.exit(2);
        }
    }
}
