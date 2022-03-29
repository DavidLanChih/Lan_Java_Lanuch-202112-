package test;

public class week_enum 
{
	public enum WeekDay 							/** ��enum�]�w�@�����A�̭��ܼƬ��T�w���e*/  
	{
		SUN("Sunday"   ,"�P����"),					//enum���ܼ�
	    MON("Monday"   ,"�P���@"),
	    TUE("Tuesday"  ,"�P���G"),
	    WED("Wednesday","�P���T"),
	    THU("Thursday" ,"�P���|"),
	    FRI("Friday"   ,"�P����"),
	    SAT("Saturday" ,"�P����");
		
		private final String day;					//�@���ܼ�
	    private final String chinese;
	    
	    WeekDay(String day, String chinese)			//enum�����غc�l
	    {	
	        this.day = day;
	        this.chinese = chinese;
	    }

	    public static WeekDay getWeek(int i)		//��k(��J��)�i��^�S�w�ܼ�
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

	    public String getDay(){						//��k�A�^���ܼƸ̭�����
	        return this.day;
	    }

	    public String getChinese(){					//��k�A�^���ܼƸ̭�����
	        return this.chinese;
	    }

	}
	
}
