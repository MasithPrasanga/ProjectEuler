import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		double number = scanner.nextDouble();
		int sqrtOfNumber = (int) Math.sqrt(number);
		
		int factor;
		int primeFactor;
		
		for(int i=2;i<=sqrtOfNumber;i++){
			if(number%i==0){
				factor = i;
				boolean isPrimeNumber = isPrimeNumber(factor);
				if(isPrimeNumber){
					System.out.println(factor);
				}
			}
		}
	}
	
	public static boolean isPrimeNumber(int number){
		
		boolean isPrimeNumber = true;
		
		if(number%2 == 0){
			isPrimeNumber = false;
		}
		else{
			for(int i=3;i<=(number/2);i++){
				if(number%i == 0){
					isPrimeNumber = false;
				}
			}
		}
			
		return isPrimeNumber;
	}
	
}
