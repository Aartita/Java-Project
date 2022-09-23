package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream outputstream = new FileOutputStream("C:\\Java\\abc.txt");
		
		String str = "Hello User ";
		byte bArr[] = str.getBytes();  //Converting string into byte
		outputstream.write(bArr);
		System.out.println("file created");

	}

}
