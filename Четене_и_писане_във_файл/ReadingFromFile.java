import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vyvedete pyt do faila:");
		String path = input.next();
		File file = new File(path);
		Scanner fileReader = null;
		try{
		fileReader = new Scanner(file);
		int lineNumber =0;
		String line;
		// Read file
			while (fileReader.hasNextLine()) {
				line = fileReader.nextLine();
				lineNumber++;
				System.out.printf("Line %d: %s%n", lineNumber,line );
			}
		}
		 catch (FileNotFoundException fnf) {
			    System.err.println("File not found.");
			}
		catch(Exception e){
			e.printStackTrace();
		} finally{
			fileReader.close();
		}
	}
}
