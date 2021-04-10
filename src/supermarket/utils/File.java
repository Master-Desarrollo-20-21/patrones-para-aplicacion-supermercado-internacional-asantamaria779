package supermarket.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
	
	public String readFile(String fileName) {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader(fileName));
			line = in.readLine();
		} catch (IOException ex) {
			System.out.println("IOException reading: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: "
							+ ex.getMessage());
				}
			}
		}
		return line;
	}
}
