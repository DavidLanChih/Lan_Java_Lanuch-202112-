package test;
import test.replace;
public class replace2 {
	public static String AA;
	public replace2() {
		
	}
	
	public void print(String input)
	{
		AA=input;
		if (AA.length() != 0) {
			System.out.println(AA.replace('s', 'a'));
		}
		else
		{
			System.out.println(AA);
		}
	}

}
