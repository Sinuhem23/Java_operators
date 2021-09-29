package ConditionPackage.Java_operators;
import java.util.Scanner;


public class Conditions {

	public static void main(String[] args) {
	

//Write an if/else statement for the following requirements:
		int score = 95;	

//If student gets 90 or higher: console log  A
		
			
		if(score>=90) {
			
			System.out.println("A");
		}
//If students get 80 or above: console log B
		if(score>=80 && score<90) {
			
			System.out.println("B");
		}
//If students get 70 or above: console log C
		if(score>=70 && score<80) {
			
			System.out.println("C");
		}
//If students get 55 or above: console log D
		if(score>=55 && score<70) {
			
			System.out.println("D");
		}
//Any grade lower than 55 is F
		if(score<55) {
			
			System.out.println("F");
		}
//Using switch case, do the following:
//Store a number between 1-7
		int day = 3;
       
//If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
//Anything other than 1-7 would default to "Invalid Input"
		 String dayString;
	        switch (day) {
	            case 1:  dayString = "Monday";
	            break;
	            case 2:  dayString = "Tuesday";
                break;
	            case 3:  dayString = "Wednesday";
                break;
	            case 4:  dayString = "Thurday";
                break;
	            case 5:  dayString = "Friday";
                break;
	            case 6:  dayString = "Saturday";
                break;
	            case 7:  dayString = "Sunday";
                break;
	            default: dayString = "Invalid Input";
                break;
	                     
	        }
	        System.out.println(dayString);

//Store a number in a variable called num and write an if statement: 
//	        Scanner userNum = new Scanner(System.in);
//	       int number;
//	        
//	        System.out.println("Enter a number");
//	        number = userNum.nextInt();
	        
	        int number =4;
	        
//If num is odd, display "Cool"
	        if (number % 2 != 0) {
	        	System.out.println("Odd " +"Cool");
	        }
//If num is even and between 2-5, display "Not Cool"
	        else if (number % 2 == 0 && number > 2 && 5 > number ) {
	        	System.out.println("Even and btw 2-5 " + "Not Cool");
	        }
//If num is even and between 6-20, display "Cool"
	        else if (number % 2 == 0 && number > 6 && number < 20 ) {
	        	System.out.println("Even and btw 6-20 " + "Cool");
	        }
//If num is even and greater than 20, display "Not Cool
	        else if (number % 2 == 0 && number >= 20 ) {
	        	System.out.println("Even and greater than 20 " + "Not Cool");
	        }else {
	        	System.out.println("try again");
	        }
//		
		
		
		
		
		
		
		

	}

}
