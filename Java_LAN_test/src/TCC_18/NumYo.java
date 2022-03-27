package TCC_18;

public class NumYo 
{
	private long number;
	
	/*-----------建構子重載-----------*/
	public NumYo(long input) 
	{
		number = input ;
	} 
	public NumYo(float  input) 
	{
		number = (long)input ;
	} 
	public NumYo(String input) 
	{
		number = Long.valueOf(input) ;
	} 
	
	
	/*-----------方法重載------------*/		//用一樣的名字(裡面變數型態不一樣，JAVA會自動判斷最適合的型態進行使用)
	public void set(long input) 
	{
		number = input ;
	}
	public void set(float input) 
	{
		number = (long)input ;				//小數變成整數，會無條件捨去小數
	}
	public void set(String input) 
	{
		number = Long.valueOf(input); 		//將字串變為整數
	}
	
	// 重載也可以用靜態方法做重載
	// **切記!不能以return方法做重載**
	
	public void print()
	{
		System.out.println(number);
	}
}
