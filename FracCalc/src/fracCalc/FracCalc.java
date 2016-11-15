package fracCalc;
//FracCalc1
import java.util.Scanner;

public class FracCalc {
	public static void main(String[] args){
	String userInput = "";
	Scanner scan = new Scanner(System.in);
	while(userInput != "quit"){
	System.out.println("Put in your equation");
	userInput = scan.nextLine();
	System.out.println(produceAnswer(userInput));
	}
	}
	public static String produceAnswer(String input){ 
		String numerator1;
		String numerator2;
		String denominator;
    	String[] splitString = input.split(" ");
    	String firstOperand = splitString[0];
    	String operator = splitString[1];
    	String secondOperand = splitString[2];
    	String [] splitFirstFraction = firstOperand.split("_");
    	String wholeNum;
    	if(splitFirstFraction.length == 2){
    		wholeNum = splitFirstFraction[0];
    		String[] splitAgain = splitFirstFraction[1].split("/");
    		if(splitFirstFraction.length == 1){
    			numerator1 = splitFirstFraction[0];
    			denominator = "1"; 
    		}else{
    			numerator1 = splitFirstFraction[0];
    			denominator = splitFirstFraction[1];
    		}
    	} else{
    		wholeNum = "0";
    		String[] splitAgain = splitFirstFraction[0].split("/"); 
    		if(splitFirstFraction.length == 1){
    			numerator1 = splitFirstFraction[0];
    			denominator = "1"; 
    		}else{
    			numerator1 = splitFirstFraction[0];
    			denominator = splitFirstFraction[1];
    		}
    	}
    	return secondOperand;        
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    

}

