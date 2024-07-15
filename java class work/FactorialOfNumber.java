import java.util.Scanner;
public class FactorialOfNumber{
	
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);


System.out.print(" Enter an Integer to check its factorial");
	int number = input.nextInt();
int counter = 0;
int total = 0;
while (counter != number){
counter = counter + 1;

if (counter == 1){
	total = number * counter;
}
else if (counter == 2){
	total = total * counter;
}
else if (counter == 3){
	total = total * counter;
}
else if (counter == 2){
	total = total * counter;
}
else if (counter == 1){
	total = total * counter;
}

}
System.out.print(total);
   }
}
	
