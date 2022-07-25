package debuggingDemo;

class MyThread extends Thread{
	public void run() {
		for(int i=0; i<3;i++) {
			System.out.println("child: "+i);
		}
	}
	
}

public class debugDemo {

	public static void main(String[] args) throws Exception {
	MyThread t1= new MyThread();
	MyThread t2 = new MyThread();
	MyThread t3 = new MyThread();
	t1.start();
	t1.join();
	t2.start();
	t2.join();
    t3.start();

	}

}
