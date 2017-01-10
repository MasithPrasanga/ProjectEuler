
public class Five {

	public static void main(String[] args) {
		
		int number = 1;
		int answer = 0;
		int startingDivider = 2;
		int endingDivider = 20;
		while(true){
			int count = 0;
			for(int i=startingDivider;i<=endingDivider;i++){
				if(number%i==0){
					count++;
				}
			}
			if(count==(endingDivider-startingDivider+1)){
				answer = number;
				break;
			}
			
			number++;
		}
		System.out.println("Answer is : "+answer);
	}
	
}
