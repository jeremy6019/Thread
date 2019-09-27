package Thread;

//Thread클래스를 상속받은 클래스 
public class ThreadEx extends Thread {
   //1초씩 쉬면서 0-9까지 출력하는 메소드
	public void run() {
		for(int i = 0; i < 10; i += 1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.printf("%s\n", e.getMessage());
				e.printStackTrace();
			}
			System.out.printf("%d\n", i);
		}
		
	}
}
