package lab8.Exercise2;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class TimerThread extends Thread
{
	public void run()
	{
		while (true) {
			LocalTime t = LocalTime.now();
			System.out.println(t);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
public class Exercise2 {

	public static void main(String[] args) {
		// creating thread for our display timer thread class.
		TimerThread t1 = new TimerThread();
		t1.start();
		
		//Using ExecutorService to run our thread
		ExecutorService executor1 = Executors.newSingleThreadExecutor();
		executor1.execute(t1);
	}
}
