public class student 								//�w�q����
{
	//�R�A�ܼ�(�u���@�Q�ϥΦbstudent.x�o���ܼ�)
	public static int x;							//���ݩ󪫥�A���ݩ�class����
	
	//�ʺA�ܼ�(�S��:�����ܼơA�i�H�Q�h�Ӫ���ϥ�)
	public float weight;							//�w�q�����ܼ�
	public float height;
	
	public student()								//�гy�غc�l�A�W�r�����Pclass���W�r�@��
	{
		System.out.println("student created");		//����L����ϥΦ�����ɡA���榹�q�{��
	}
	
	public void print()								//�D�R�A����k
	{
		System.out.println("print data");
	}
	
	public static void s_print()					//�R�A����k
	{
		System.out.println("S_print");
	}
	
	public float bmi()								//�p��BMI����k
	{
		return weight / (height * height ) ;
	}
	
}
