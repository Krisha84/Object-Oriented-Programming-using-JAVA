import java.util.*;
class Time{
	int hours;
	int minutes;

	Time(int hours,int minutes){
		this.hours=hours;
		this.minutes=minutes;
	}

	void addTime(Time x,Time y){
		hours=x.hours+y.hours;
		minutes=x.minutes+y.minutes;

		if(minutes>=60){
			hours+=1;
			minutes%=60;
		}
	}
}

public class TimeDemo{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		Time t1=new Time(0,0);
		Time t2=new Time(0,0);
		Time t3=new Time(0,0);

		System.out.println("Enter hours of the time t1 : ");
		t1.hours=sc.nextInt();
		System.out.println("Enter minutes of the time t1 : ");
		t1.minutes=sc.nextInt();

		System.out.println("Enter hours of the time t2 : ");
		t2.hours=sc.nextInt();
		System.out.println("Enter minutes of the time t2 : ");
		t2.minutes=sc.nextInt();

		t3.addTime(t1,t2);
		System.out.println(t3.hours+":"+t3.minutes);
		
	}
}