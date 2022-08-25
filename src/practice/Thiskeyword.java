package practice;

public class Thiskeyword {

	
	public Thiskeyword() {
		this(7,8,9,0);
		System.out.println("I am default constructor");
	}
	
	public Thiskeyword(int a) {
		this();
		System.out.println("I am one parameterised constructor");
	}
	
	public Thiskeyword(int a, int b) {
		this(5);
		System.out.println("I am two parameterised constructor");
	}
	
	public Thiskeyword(int a, int b, int c) {
		this(2,3);
		System.out.println("I am three parameterised constructor");
	}
	
	
	public Thiskeyword(int a, int b, int c, int d) {
		
		System.out.println("I am four parameterised constructor");
	}
	

	public static void main(String[] args) {
	Thiskeyword obj = new Thiskeyword(1,4,6);
	
	
		
		

	}

}
