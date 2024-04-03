package util;

public class TestLogin {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s+"Selenium"); // HelloSelenium
		System.out.println(s); // Hello
		
		s=s+"selenium"; // new object is created in SCM and heap obj is pointed by no one
		System.out.println(s);
	
	}

}
