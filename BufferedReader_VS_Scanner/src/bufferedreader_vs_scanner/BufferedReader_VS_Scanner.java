
package bufferedreader_vs_scanner;

import java.io.IOException;

/**
 *
 * @author giussani.mirko
 */
public class BufferedReader_VS_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CreazioneFile file = new CreazioneFile();
        Lettura_PopolazioneArray L= new Lettura_PopolazioneArray();
        file.creazioneFile();
        L.letturaFile();
    }
    
}
