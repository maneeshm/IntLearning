package Wed_5_29_2013;

public class ThreadSample implements Runnable{
	
		 public static Integer count;

		 public static void main(){
		    new Thread(new ThreadSample()).start();
		    new Thread(new ThreadSample()).start();
		      new Thread(new ThreadSample()).start();
		}

		public void run(){
		  
			synchronized (count) {
				count++;
			}
			
		}
		
}
