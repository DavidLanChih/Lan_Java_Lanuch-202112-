public class TCC_03_04_Array
{
	public static void main(String[] args) {
		
		/*----------  宣告陣列方式一  ----------*/
		int[] a1= new int[] {1,2,3,4,5,6,7,8,9,10};
		
		/*----------  宣告陣列方式二  ----------*/
		int i[] = new int[10];
		i[0]=10;
		i[1]=101;
		i[2]=010; 				//自動變成8進位
		i[3]=1000;
		
		for(int x=0; x<10; x++)
		{
			System.out.print(a1[x]+": ");
			if(x>=9)
			{
				System.out.println(i[x]);
			}
			else
			{
				System.out.println(i[x]+",");
			}
		}
	}
}