/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
