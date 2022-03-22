public class TCC_09_advance_array
{
	public static void main(String[] Args) 
    {
        int [] array_A = {10,20,30};    //設定陣列A的標籤
        int [] array_B = array_A ;      //設定陣列B與陣列A的標籤位置一樣
        array_B[1] = 5 ;                //直接幫第二個陣列的值換成5
        System.out.print(array_A[1]);    
    }
}