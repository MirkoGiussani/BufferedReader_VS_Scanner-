package bufferedreader_vs_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author giussani.mirko
 */
public class Lettura_PopolazioneArray {

    public void letturaFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("File.txt"));

        int righe = 0;
        int colonne = 0;    //questi numeri non servono a nulla

        while (input.hasNextLine()) {
            colonne = 0;    //nel file è presente uno spazio finale quindi si parte dal 0 e non da 1
            righe++;
            String riga = input.nextLine();
            for (int i = 0; i < riga.length(); i++) {
                if (riga.charAt(i) == ' ') {
                    colonne++;
                }
            }
        }

        System.out.println("colonne: " + colonne + " righe: " + righe);
        int[] array = new int[500000];

        input = new Scanner(new File("File.txt"));
        
        for (int i = 0; i < array.length; i++) {
            if (input.hasNextInt()) {
                array[i] = input.nextInt();
            }
        }
        
        //stampa array
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + " numero: " + array[i]);
        }
    }
}
