package Lan_time;
import java.util.Date;

public class Lan_day {
	public static void main(String args[]) {
	       Date date = new Date(); 					// Instantiate a Date object
	       System.out.println(date.toString());		// display time and date using toString()
	       System.out.println(date);
	       long a = date.getTime();					//�q1970/01/01�ܤ����@���
	       System.out.println(a);					
	       System.out.println(date.getDay());		//�P��
	       
	   }

}
