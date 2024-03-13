package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Windows\\Temp\\in.txt");

		Scanner scanner = null;

		int lineNumber = 1;

			try {
				scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			} 
			catch (IOException e) {s
				System.out.println("Error " + e.getMessage());
			} 
			finally {
				if (scanner != null) {
					scanner.close();
				}

			

		}

	}

}
