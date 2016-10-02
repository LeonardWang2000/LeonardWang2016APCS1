import java.util.Scanner;
//Leonard Wang, 10/1/2016, 1st period
public class CollabProgram1 {

	public static void main(String[] args) {
		//Makes a new Scanner
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a string ofnumbers with spaces between each");
		String input = userInput.nextLine();
		//Gets rid of all the spaces between the int values
		String[] stringOfInts = input.split(" ");
		int total = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int biggestEven = 0;
		//for loop that runs for the length of modified string
		for(int i = 0; i < stringOfInts.length; i++){
			//parse changes the string values to int values
			int numberAtI = Integer.parseInt(stringOfInts[i]);
				if(numberAtI > max){
					max = numberAtI;
				}
				if(numberAtI < min){
					min = numberAtI;
				}
				if(numberAtI % 2 == 0){
					total += numberAtI;
					if(numberAtI > biggestEven){
						biggestEven = numberAtI;
					}
				}
		}
		//Print out all the required data
		System.out.println(" ");
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " +  min);
		System.out.println("The total of the even numbers " + total);
		System.out.println("The largest even number is " + biggestEven);
		
	}

}
