package Lan_time;
import java.util.Date;

public class Lan_day {
	public static void main(String args[]) {
	       Date date = new Date(); 					// Instantiate a Date object
	       System.out.println(date.toString());		// display time and date using toString()
	       System.out.println(date);
	       long a = date.getTime();					//從1970/01/01至今的毫秒數
	       System.out.println(a);					
	       System.out.println(date.getDay());		//星期
	       
	   }

}
