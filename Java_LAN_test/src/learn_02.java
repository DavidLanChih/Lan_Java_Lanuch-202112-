public class learn_02{
	public static void main(String[] args) {
		
		/*  �ŧi�}�C�覡�@  */
		int[] a1= new int[] {1,2,3,4,5,6,7,8,9,10};
		
		/*  �ŧi�}�C�覡�G  */
		int i[] = new int[10];
		i[0]=10;
		i[1]=101;
		i[2]=010; //�۰��ܦ�8�i��
		
		for(int x=0; x<10; x++)
		{
			System.out.print("<"+a1[x]+">");
			
			if(x>=9)System.out.print(i[x]);
			else System.out.print(i[x]+",");	
		}
	}
}