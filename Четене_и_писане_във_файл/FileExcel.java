6. �������� �����, ����� ������ ���� ��������� (String path, String pathSecond), ���� ������ �� ������� ������ ���� �� ������ path � ������� ����������� � ���� 2 ����� � ������� � pathSecond. ���� ��� ���� ������� ��������� "start", ��� �� ���� ������� � "finish" � ��� ���� ������� ��������� "finish", ��� �� ���� ������� � "start".
������ ������� ������������ �� ������, ���� �� ������ � ���������, �� � ���������. 
===================================================================================================
package fileexcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;
public class FileExcel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vavedete put do faila:");
        String path = input.next();
        File file = new File(path);

        String pathSecond = input.next();
    
        readReplace(path, pathSecond);
    }

    public static void readReplace(String path, String pathSecond) {
       Scanner fileReader = null;
       PrintStream fileWriter = null;
        
        String word = null;
        try {
            fileReader = new Scanner(new File (path));
            fileWriter = new PrintStream (new File (pathSecond));
            while (fileReader.hasNext()) {
                word = fileReader.next();
            
            if (word.contains("start")) {
                word = word.replaceAll("start", "finish");
            } else if (word.contains("finish")){
                word = word.replaceAll("finish", "start");
            }
            fileWriter.print (word + " ");
            }
            System.out.println("The method's execution is now finished.");
        } catch (FileNotFoundException ex) {

        }

    }
}
