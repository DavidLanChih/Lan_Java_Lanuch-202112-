public class learn_dice
{
	public static void main(String[] args) 
	{
		/*--------------- �@����10�ӻ�l ---------------*/
		int [] dicecounter = new int[10];						//�]�w��10�ӻ�l��m
		for (int i=0;i<10;i++)
		{
			int Num=(int)(Math.random()*5.99999+1);		   		//�H���Ʀr��1-6�����
			dicecounter[i] = Num;                      			//�N�C�ӻ�l���Ȧs�b���P�}�C��m
			System.out.println("��"+(i+1)+"�ӻ�l: "+dicecounter[i]);
		}
		
		/*-------------�p��10�ӻ�l��������-------------*/
		int Num_total=0;
		float Num_average;
		for(int j=0;j<10;j++)
		{
			Num_total = dicecounter[j] + Num_total;
		}
		
		Num_average = (float)Num_total/10;
		System.out.println("�`��: "+Num_total);
		System.out.println("������: "+Num_average);
		System.out.println("�`���ܬ���P���|: "+(float)Num_total/3.14f); //�p�ƭp��(�p�ƻݭn�[f)
		
	}
}