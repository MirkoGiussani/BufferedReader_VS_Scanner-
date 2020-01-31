
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
        FileScannerReader L= new FileScannerReader();
        FileBufferedReader b = new FileBufferedReader();
        file.creazioneFile();
        
        int [] array = L.letturaFile();
        b.letturaFile();
        System.out.print("vuoi stampare l'array sulla console? ");
        String scelta = input.nextLine().toLowerCase().trim();
        if ("si".equals(scelta)){        
            L.stampa(array);
        }else {
            System.out.println("ok");
        }
        
    }
    
}
