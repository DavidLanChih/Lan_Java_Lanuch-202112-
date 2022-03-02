public class learn_01{
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			if(i==6)
			{
				continue; //此回合不執行後面程式
			}
			System.out.println(i);
		}
	}
}
