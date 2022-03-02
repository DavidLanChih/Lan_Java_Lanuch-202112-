package Lan_time;

public class leap_year
{
	public static void main(String[] args) throws java.io.IOException
	{
        System.out.println("請輸入年份：  輸入0結束 ");
        java.io.BufferedReader br;      
        br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());			//需再加判斷式，若輸入文字就會故障
        while (year != '\0') 
        {   
            if (year % 4 != 0) 
            {
                System.out.println(year + "不是閏年。");
            } 
            else if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    System.out.println(year + "是閏年。");		//可被4，100，400整除，代表是閏年
                } 
                else 
                {
                    System.out.println(year + "不是閏年。");
                }
            } 
            else 
            {
                System.out.println(year + "是閏年。");
            }
            System.out.println("請輸入年份：  輸入0結束 ");   
            year = Integer.parseInt(br.readLine());
        }
	}
}