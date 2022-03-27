package test;


public class reverse {

	public static void main(String[] args) 
	{
		double A ;
		String B ;
		A = Math.random();
		System.out.println(A);
		B = "2022/01/01";
		
		StringBuilder strb = new StringBuilder(B);
		B = strb.reverse().toString();
		System.out.println(B);
	}
	

}
