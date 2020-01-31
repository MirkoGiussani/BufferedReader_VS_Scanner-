
package bufferedreader_vs_scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author giussani.mirko
 */
public class FileBufferedReader {
    
    public void letturaFile() throws FileNotFoundException, IOException{
        
        BufferedReader in = new BufferedReader(new FileReader("File.txt"));        
        int[] array = new int[500000];   
        int contatore = 0;
        long startTime = System.currentTimeMillis();        
        
        String riga;
        
        for (int i = 0; i < 100000; i++) {
            riga = in.readLine();   
            String[] str = riga.split(" ");
            for (int j = 0; j < 5; j++) {
                array[contatore++]=  Integer.parseInt(str[i]);
            }
        }
        
        System.out.println("il programma ci ha impiegato " + (System.currentTimeMillis()-startTime) + " millisecondi. con bufferedreader");
               
    }
    
    /*public void stampa (int [] array){
    //stampa array
    for (int i = 0; i < array.length; i++) {
    System.out.println((i+1) + " numero: " + array[i]);
    }
    }*/
}
