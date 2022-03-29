package test;

public class week_enum 
{
	public enum WeekDay 							/** 用enum設定一個類，裡面變數為固定內容*/  
	{
		SUN("Sunday"   ,"星期日"),					//enum的變數
	    MON("Monday"   ,"星期一"),
	    TUE("Tuesday"  ,"星期二"),
	    WED("Wednesday","星期三"),
	    THU("Thursday" ,"星期四"),
	    FRI("Friday"   ,"星期五"),
	    SAT("Saturday" ,"星期六");
		
		private final String day;					//一般變數
	    private final String chinese;
	    
	    WeekDay(String day, String chinese)			//enum內的建構子
	    {	
	        this.day = day;
	        this.chinese = chinese;
	    }

	    public static WeekDay getWeek(int i)		//方法(輸入值)可返回特定變數
	    {
	        switch(i)
	        {
	            case 0: return SUN;
	            case 1: return MON;
	            case 2: return TUE;
	            case 3: return WED;
	            case 4: return THU;
	            case 5: return FRI;
	            case 6: return SAT;
	            default: return null;
	        }
	    }

	    public String getDay(){						//方法，回傳變數裡面的值
	        return this.day;
	    }

	    public String getChinese(){					//方法，回傳變數裡面的值
	        return this.chinese;
	    }

	}
	
}
