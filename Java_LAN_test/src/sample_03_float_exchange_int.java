public class	sample_03_float_exchange_int
{
	public static void main(String[] args)
	{
		float f_num=0.3f;
		System.out.print(f_num+"\n");
		int num_2=1;
		float result=(float)num_2 / (float)f_num ;  //強制將整數轉換成小數才計算
		System.out.print(result);
	}
}