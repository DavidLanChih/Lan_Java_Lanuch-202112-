public class	sample_04_char
{
	public static void main(String[] args)
	{
		//兩個char放一起會有奇怪計算
		char ch_1='T';
		char ch_2='\n';
		String c_str_2="01" + ch_2 + "02" +ch_1;
		System.out.print(c_str_2);
	}
}