package lab8.Exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {
	FileInputStream fis;
	FileOutputStream fos;

	// constructor of our own Thread class
	public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
		this.fis = fis;
		this.fos = fos;
	}

	// copies data from source file to file to target file and notifies after
	// copying every 10 characters.
	public void run() {
		int num;
		int count = 0;
		try {
			while ((num = fis.read()) != -1) {
				try {
					fos.write((char) num);
					count++;
					if (count == 10) {
						System.out.println("10 characters are copied");
						count = 0;
						Thread.sleep(1000);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully copied.");
	}
}
