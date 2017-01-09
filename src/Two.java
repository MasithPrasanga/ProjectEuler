import java.util.Scanner;

public class Two {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.print("Enter the Limit Number : ");
		int limit = scanner.nextInt();
		
		int evenSum = 0;
		int preNumber = 1;
		int postNumber = 2;
		int spare;
		
		while(true){
			if(limit < postNumber){
				break;
			}
			if(postNumber%2 == 0){
				evenSum = evenSum + postNumber;
			}
			System.out.println(postNumber);
			spare = preNumber;
			preNumber = postNumber;
			postNumber = postNumber+spare;
		}
		
		System.out.println("Evern Sum is : "+evenSum);
	}
}
