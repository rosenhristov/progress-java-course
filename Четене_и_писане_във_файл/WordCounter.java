4. Напишете метод, който приема като аргументи (String path) и връща(int) броя на думите на зададен файл,
като за дума не се считат следните знаци " . , ! ? : ; "
Нека пътя до файла се изписва от потребителя в main() метода.
======================================================================================================
package wordcounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете път до файла:");
        String path = input.nextLine();
        System.out.println("Общия брой на думите във Вашия файл е:" + countWords(path));

    
     }

    public static int countWords(String path) {

        File file = new File(path);
        int wordCounter = 0;
        int lineCounter = 0;
        String line = null;
        String word = null;
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                lineCounter++;

                Scanner lineReader = new Scanner(line);
                while (lineReader.hasNextLine()) {
                    word = lineReader.next();

                    if (!word.equals(" . ") && !word.equals(" , ") && !word.equals(" ? ") && !word.equals(" ! ")
                            && !word.equals(" : ") && !word.equals(" ; ")) {

                        wordCounter++;
                    }
                }
            }

        } catch (FileNotFoundException fnf) {
            System.err.println("Търсеният файл не е намерен.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordCounter;
    }
}
