import com.euler.library.CommonMethods;

public class Seven {

	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		while (true) {
			boolean status = CommonMethods.isPrimeNumber(number);
			if (status) {
				count++;
				if (count == 10001) {
					System.out.println("Answer is : " + number);
					break;
				}
			}
			number++;
		}
	}
}
