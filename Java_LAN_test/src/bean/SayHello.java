package bean;

public class SayHello {
	public SayHello() {}
	public String SayHello (String strName) {
		String strMessage;
		strMessage = "hello" + strName + "!!";
		return strMessage;
	}
}
