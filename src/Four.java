import com.euler.library.CommonMethods;

public class Four {

	public static void main(String[] args) {

		int number;
		int biggestPalindromic = 1;

		int startNumber = 100;
		int endNumber = 999;

		for (int i = startNumber; i <= endNumber; i++) {
			for (int j = startNumber; j <= endNumber; j++) {
				number = i * j;
				boolean isPalindromic = CommonMethods.isPalindromicNumber(number);
				if (isPalindromic) {
					if (number > biggestPalindromic) {
						System.out.println(number);
						biggestPalindromic = number;
					}
				}
			}
		}

		System.out.println("Biggest Palindromic no is : " + biggestPalindromic);

	}
}
