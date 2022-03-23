public class TCC_07_method
{
	public static void main(String[] args) 
	{
		int Number = 8;
		System.out.println(square(Number)); //甅よ猭1:盢把计块秈squareよ猭程ノprintln陪ボよ猭挡狦
		
		print("hi~");						//甅よ猭2:ノよ猭蠢セ把计ず跑计
		String something = "hello";
		print(something);					
	}
	
	public static int square(int input)		//よ猭1: 砞﹚よ猭嘿俱计square柑块把计(﹚计)
	{
		return input*input;					//眔把计穦秈︽笲衡肚
	}
	
	public static void print(String name)	//よ猭2: 砞﹚よ猭嘿print柑块把计(﹚ゅ)voidぃ肚
	{
		System.out.println(name);			
	}
}