package practice;

public class ThisKeywordMethod {
	
	public void method1() {
		this.method4();
		System.out.println("I am default method");
	}

	
	public void method2() {
		this.method5();
		System.out.println("I am one parameterised method");
	
	
	}

	
	public void method3() {
		this.method2();
		System.out.println("I am two parameterised method");
	}

	
	public void method4() {
		System.out.println("I am three parameterised method");
	}

	public void method5() {
		this.method1();
		System.out.println("I am four parameterised method");
	}

	
	public static void main(String[] args) {
		ThisKeywordMethod obj = new ThisKeywordMethod();
		obj.method3();
		

	}

}
