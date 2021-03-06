import java.util.Scanner;
//Leonard Wang, 10/1/2016, 1st period
public class CollabProgram1 {

	public static void main(String[] args) {
		//Makes a new Scanner
		Scanner userInput = new Scanner(System.in);
		//Get the # of integers the user is going to enter
		System.out.println("How many integers do you want to put in?");
		//variable initialization
		int totalInts = userInput.nextInt();
		int total = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int biggestEven = 0;
		//for loop that runs for the length of modified string
		System.out.println("Enter a string of numbers with spaces between each");
		for(int i = 0; i < totalInts; i++){
			//tests for min, max total, largestEven
			int input = userInput.nextInt();
				if(input > max){
					max = input;
				}
				if(input < min){
					min = input;
				}
				if(input % 2 == 0){
					total += input;
					if(input > biggestEven){
						biggestEven = input;
					}
				}
		}
		//Print out all the required data
		System.out.println(" ");
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " +  min);
		System.out.println("The total of the even numbers " + total);
		if(biggestEven == 0){
			System.out.println("No even numbers inputted");
		}else{
			System.out.println("The largest even number is " + biggestEven);
		}
		
	}

}
