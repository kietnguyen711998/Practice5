package Bai3;

public class Exercise3 {

	public static void main(String[] args) {

		String str = "Don't Be Evil";
		System.out.println("Original String : " + str);

		int val1 = str.codePointBefore(1);
		int val2 = str.codePointBefore(9);

		System.out.println("Character(unicode point) = " + val1);
		System.out.println("Character(unicode point) = " + val2);
	}

}
