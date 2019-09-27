package Thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		
		Thread th1 = new Thread() {
			public void run() {
				for(int i=0; ; i+=1) {
					System.out.printf("하나\n");
				}
			}
		};
        
		Thread th2 = new Thread() {
			public void run() {
				for(int i=0; ; i+=1) {
					System.out.printf("두~울 \n");
				}
			}
		};
		
		th1.start();
		th2.start();
		
		try {
			//1초 동안 일하고 다른 스레드 실행 
	    th1.join(1000);
	    //1초 동안 일하고 다른 스레드 실행 
	    th2.join(1000);
		} catch(Exception e) {}
		
		
		
		
		
	}

}
