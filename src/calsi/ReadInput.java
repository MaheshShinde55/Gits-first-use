package calsi;

import java.util.Scanner;
public class ReadInput {

	public static String read() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input Expression : ");
		
		String inputLine = scanner.nextLine();
		
		scanner.close();
		return inputLine;

	}

}
