import java.util.Scanner;
public class MaxMin{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
int lowest = 0 ;
	int largest = 0 ;
	int sum = 0 ;
	int average = 0 ;
	int total = 10 ;
	int product = 1 ;
	for(int count = 0 ; count < 10 ; count++){
	System.out.print("Enter number one - ten: ");
	int number = input.nextInt();

		
		
		if(number > largest){
			largest = number;
		}
			else if(lowest == 0 || lowest > number){
			lowest = number;
		}

		System.out.printf(" %d %d ", largest, lowest);

}
}
}