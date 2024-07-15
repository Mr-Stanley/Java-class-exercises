import java.util.Scanner;
	public class MinMax {
		public static void main(String...args){
		
		Scanner input = new Scanner(System.in);

int counter = 0;		
int number1 = 0;
int number2 = 0;
int number3 = 0;
int number4 = 0;
int number5 = 0;
int number6 = 0;
int number7 = 0;
int number8 = 0;
int number9 = 0;
int number10 = 0;
while (counter != 10) {
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	counter = counter + 1;
if (counter == 1){
	number = number1;
} 
else if (counter == 2){
	number = number2;
}
 else if (counter == 3){
	number = number3;
}
else if (counter == 4){
	number = number4;
}
else if (counter == 5){
	number = number5;
}
else if (counter == 6){
	number = number6;
}
else if (counter == 7){
	number = number7;
} 
else if (counter == 8){
	number = number8;
}
else if (counter == 9){
	number = number9;
}
else if (counter == 10){
	number = number10;
         

       
if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5 && number1 > number6 && number1 > number7 && number1 > number8 && number1 > number9 && number1 > number10)
System.out.print(number1 + "is the largest number");

   }
}



   }
}