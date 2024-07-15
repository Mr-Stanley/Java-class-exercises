import java.util.Scanner;
	public class Summation {
		public static void main(String...args){
		
		Scanner input = new Scanner(System.in);

int evenSum = 0;
int oddSum = 0;
for (int counter = 0; counter <= 10; counter++){

	System.out.print("Enter a number: ");
		int number = input.nextInt();

 	if (number % 2 == 0) {
		evenSum = number + evenSum;
}
	else {
	oddSum = number + evenSum;
}
}
System.out.println(" The sum of even Numbers is "+ evenSum);
System.out.print(" The sum of odd Numbers is "+ oddSum);

   }
}