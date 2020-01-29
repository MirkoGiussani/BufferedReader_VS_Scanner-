
package bufferedreader_vs_scanner;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author giussani.mirko
 */
public class BufferedReader_VS_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
        
        CreazioneFile file = new CreazioneFile();
        Lettura_PopolazioneArray L= new Lettura_PopolazioneArray();
        file.creazioneFile();
        
        int [] array = L.letturaFile();
        System.out.print("vuoi stampare l'array sulla console? ");
        String scelta = input.nextLine().toLowerCase().trim();
        if (scelta == "si"){        //non funziona questo if
            L.stampa(array);
        }else {
            System.out.println("ok");
        }
        
    }
    
}
