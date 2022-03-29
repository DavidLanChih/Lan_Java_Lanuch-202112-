package test;

import test.week_enum.WeekDay;

public class week_enyum_input 
{
	    public static void main(String[] args) 
	    {
	        WeekDay weekDay = WeekDay.getWeek(6);		//輸入參數到方法，並返值回物件上
	        System.out.println(weekDay.getDay());
	        System.out.println(weekDay.getChinese());    
	    }
}
