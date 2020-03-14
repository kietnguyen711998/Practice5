package Bai2;

public class Exercise2 {

	public static void main(String[] args) {

		String str = "Don't Be Evil";
		System.out.println("Original String : " + str);

		int val1 = str.codePointAt(1);
		int val2 = str.codePointAt(9);

		System.out.println("Character(unicode point) = " + val1);
		System.out.println("Character(unicode point) = " + val2);
	}
}
