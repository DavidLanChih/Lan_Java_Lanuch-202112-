package Gitbook;

public class test{

	   public static void main(String args[]){
	      Integer x = 5; // boxes int to an Integer object
	      x =  x + 165;   // unboxes the Integer to a int
	      System.out.println(x.toString()); 
	      System.out.println(x.equals(x));
	      System.out.println(x.intValue());
	      System.out.println(x.longValue());
	      System.out.println(x.floatValue());
	      System.out.println(x.hashCode());
	      System.out.println(x.byteValue());
	      System.out.println(x.toBinaryString(x));
	      System.out.println(x.getClass());
	      System.out.println(x.reverse(x));
	      System.out.println(Integer.reverse(x));
	      
	   }
	}
