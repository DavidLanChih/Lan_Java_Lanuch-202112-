package test;

import test.week_enum.WeekDay;

public class week_enyum_input 
{
	    public static void main(String[] args) 
	    {
	        WeekDay weekDay = WeekDay.getWeek(6);		//��J�Ѽƨ��k�A�ê�Ȧ^����W
	        System.out.println(weekDay.getDay());
	        System.out.println(weekDay.getChinese());    
	    }
}
