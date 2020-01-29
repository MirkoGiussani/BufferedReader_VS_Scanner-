
package bufferedreader_vs_scanner;

/**
 *
 * @author giussani.mirko
 */
import java.io.File;
import java.io.FileWriter;  //ci consente di riempire un file
import java.io.IOException;
import java.util.*;

public class CreazioneFile {
    public void creazioneFile() throws IOException{
        File myFile = new File("File.txt");
        if(myFile.exists()){ //se esiste il file lo elimino 
            myFile.delete();
        } 
        
        myFile.createNewFile();

        FileWriter myFileWriter = new FileWriter(myFile);
        int a = 0; // numero minimo
        int b = 256; // numero massimo
        int c = ((b-a) + 1);
        Random r = new Random();
        int casuale;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 5; j++) {
                 casuale = (int) r.nextInt(c) + a;
                 myFileWriter.write(casuale + " ");
            }
            myFileWriter.write(System.getProperty("line.separator"));
        }
        myFileWriter.close();
    }
}
