import java.util.*;
class Run1 implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Morning!!");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class Run2 implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Afternoon!!");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				e.printStackTrace();
		}
		}
	}
}


public class Lab_9_1{
	public static void main(String[] args) {
		Run1 r1 = new Run1();
		Run2 r2 = new Run2();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}