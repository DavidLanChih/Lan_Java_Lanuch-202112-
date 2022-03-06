public class learn_dice
{
	public static void main(String[] args) 
	{
		/*--------------- 一次丟10個骰子 ---------------*/
		int [] dicecounter = new int[10];						//設定有10個骰子位置
		for (int i=0;i<10;i++)
		{
			int Num=(int)(Math.random()*5.99999+1);		   		//隨機數字為1-6的整數
			dicecounter[i] = Num;                      			//將每個骰子的值存在不同陣列位置
			System.out.println("第"+(i+1)+"個骰子: "+dicecounter[i]);
		}
		
		/*-------------計算10個骰子的平均值-------------*/
		int Num_total=0;
		float Num_average;
		for(int j=0;j<10;j++)
		{
			Num_total = dicecounter[j] + Num_total;
		}
		
		Num_average = (float)Num_total/10;
		System.out.println("總值: "+Num_total);
		System.out.println("平均值: "+Num_average);
		System.out.println("總值變為圓周直徑: "+(float)Num_total/3.14f); //小數計算(小數需要加f)
		
	}
}