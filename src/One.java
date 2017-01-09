import java.util.Scanner;

public class One {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = scanner.nextInt();
		
		int i,sum = 0;
		for(i=2;i<number;i++){
			if(i%3 == 0){
				sum = sum + i;
			}
			else if(i%5==0){
				sum = sum + i;
			}
		}
		
		System.out.println("Answer is : "+sum);
		
		
	}
}
