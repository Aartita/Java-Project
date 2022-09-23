package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileWriter writer = new FileWriter("C:\\Java\\xyz.txt");
	writer.write("This is String oriented. ");
	writer.close();
	System.out.println("file created");
	}

}
