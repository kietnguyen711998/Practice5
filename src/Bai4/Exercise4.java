package Bai4;

public class Exercise4 {

	public static void main(String[] args) {

		String str = "Don't Be Evil";
		System.out.println("Original String : " + str);

		int ctr = str.codePointCount(1, 10);
		System.out.println("Codepoint count = " + ctr);
	}

}
