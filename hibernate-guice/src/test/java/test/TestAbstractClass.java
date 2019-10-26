package test;

interface Aa{
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}

public abstract class TestAbstractClass implements Aa{
	int statusCode;
	protected static String name = "DEFAULT";

	public TestAbstractClass(int statusCode) {
		this.statusCode = statusCode;
		Aa.super.log("ddd");
	}

	public static void main(String[] args) {
		System.out.println("dddddddddddd");
	}
}
