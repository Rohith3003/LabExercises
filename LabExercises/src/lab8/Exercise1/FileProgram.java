package lab8.Exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram {

	public static void main(String[] args) {
		// linking stream objects to source and text files
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Rohith\\Documents\\source.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Rohith\\Documents\\target.txt");
			// creating a thread calling the constructor
			CopyDataThread t1 = new CopyDataThread(fis, fos);
			
			
			// starting the thread i.e. invoking the run method.
			t1.start();
			
			
			//running thread with the help of ExecutorService
		    ExecutorService executor = Executors.newSingleThreadExecutor();
		    executor.execute(new CopyDataThread(fis,fos));
		    
		    } 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
