import java.util.*;
import java.lang.*;
import java.io.*;

class findTime
{
	private static int hour;
	private static int minute;
	private static int second;
	
	public static void setTime(int h,int m, int s)
	{
		hour = ( (h>=0 && h<24) ?  h:0 );
		minute = ( (m>=0 && m<60) ? m:0 );
		second= ( (s>=0 && s<60) ? s:0 );
	}
	
	public String toMilitary()
	{
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public String toRegular()
	{
		return String.format("%02d:%02d:%02d %s",((hour==0||hour==12)?0:hour%12),minute,second,((hour>=12)?"PM":"AM") );
	}
}
class inputTime
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int hour,minute,second;
		System.out.println("Enter hour:");
		hour = scan.nextInt();
		System.out.println("Enter minute:");
		minute = scan.nextInt();
		System.out.println("Enter second:");
		second = scan.nextInt();
		
		findTime fT = new findTime();
		fT.setTime(hour,minute,second);
		String a = fT.toMilitary();
		String b = fT.toRegular();
		System.out.println("Time in 24-hour format :"+a);
		System.out.println("Time in 12-hour format :" +b);
		
	}
}
