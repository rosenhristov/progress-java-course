2. Напишете метод, който приема като аргументи (String path), и връща int число с бройката на изреченията в него.
==============================================================================================

package intarraymasive3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IntArrayMasive3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Path:");
        String path = sc.nextLine();
        
        System.out.println("Total sentances:" + sentanceCounter(path));

    }
    
    public static int sentanceCounter(String path) {
       
            Scanner fileReader = null;
            int totalSentances = 0;
            
            String word;
             try {
            fileReader = new Scanner(new File(path));
            
            while(fileReader.hasNext()){
                word = fileReader.next();
                
                if(word.contains(".") || word.contains("?") 
                        || word.contains("!")){
                    totalSentances++;
                }
            }
        } catch (FileNotFoundException ex) {
                 System.err.println("File not found!");
        }finally{
                if(fileReader != null){
                    fileReader.close();
                }
             }
        return totalSentances;
    }
}
