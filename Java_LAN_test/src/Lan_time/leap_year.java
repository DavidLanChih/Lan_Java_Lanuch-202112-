package Lan_time;

public class leap_year
{
	public static void main(String[] args) throws java.io.IOException
	{
        System.out.println("�п�J�~���G  ��J0���� ");
        java.io.BufferedReader br;      
        br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());			//�ݦA�[�P�_���A�Y��J��r�N�|�G��
        while (year != '\0') 
        {   
            if (year % 4 != 0) 
            {
                System.out.println(year + "���O�|�~�C");
            } 
            else if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    System.out.println(year + "�O�|�~�C");		//�i�Q4�A100�A400�㰣�A�N��O�|�~
                } 
                else 
                {
                    System.out.println(year + "���O�|�~�C");
                }
            } 
            else 
            {
                System.out.println(year + "�O�|�~�C");
            }
            System.out.println("�п�J�~���G  ��J0���� ");   
            year = Integer.parseInt(br.readLine());
        }
	}
}