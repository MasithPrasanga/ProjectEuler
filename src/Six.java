
public class Six {

	public static void main(String[] args) {
		
		int startingPoint = 1;
		int endingPoint = 100;
		
		int sumOfSquars = 0;
		int squareOfSums = 0;
		int sum = 0;
		for(int i=startingPoint;i<=endingPoint;i++){
			sumOfSquars = sumOfSquars + (i*i);
		}
		
		System.out.println("Sum of squares : "+sumOfSquars);
		
		for(int i=startingPoint;i<=endingPoint;i++){
			sum  = sum + i;
		}
		
		squareOfSums = (sum*sum);
		
		System.out.println("SQuare of Sums : "+squareOfSums);
		
		System.out.println("Answer is : "+(squareOfSums-sumOfSquars));
	}
	
}
