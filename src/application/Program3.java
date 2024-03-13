package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good mornig", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\Fernando\\Downloads\\test.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				bw.write(line + " Parâmetro true");
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error :" + e.getMessage());
		}
		
	}

}
