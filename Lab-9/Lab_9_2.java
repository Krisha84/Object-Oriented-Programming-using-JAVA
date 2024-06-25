import java.util.*;
class Odd implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2!=0){
				System.out.println("Odd = "+i);
			}
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Even implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2==0){
				System.out.println("Even = "+i);
			}

			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}


public class Lab_9_2{
	public static void main(String[] args){
		
		Odd a = new Odd();
		Even b = new Even();

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();
	}
}