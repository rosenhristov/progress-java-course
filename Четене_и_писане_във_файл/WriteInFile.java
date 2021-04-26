import java.io.PrintStream;
import java.util.Scanner;

public class WriteInFile {

	public static void main(String[] args) {
		PrintStream fileWriter = null;
		try{
		 fileWriter = new PrintStream("numbers.txt");
		 
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		System.out.println("Vyvedete chislo:");
		while(sc.hasNextInt()){
			num = sc.nextInt();
		    fileWriter.println(num);
			System.out.println("Vyvedete chislo:");
		}
		// Close the stream when you are done using it
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			fileWriter.close();
		}
	}
}
