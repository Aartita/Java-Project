package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Employee employee = new Employee(101,"Manas");
		
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Java\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);  //converting employee into byte stream
		outputStream.flush();
		System.out.println("Converted into stream");
		

	}

}
