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
		String denominator2;
    	String[] splitString = input.split(" ");
    	String firstOperand = splitString[0];
    	String operator = splitString[1];
    	String secondOperand = splitString[2];
    	String [] splitFirstFraction = firstOperand.split("_");
    	String [] splitSecondFraction = secondOperand.split("_");
    	String wholeNum2;
    	String wholeNum;
    	if(splitFirstFraction.length == 2){
    		wholeNum = splitFirstFraction[0];
    		String[] splitAgain = splitFirstFraction[1].split("/");
    		if(splitAgain.length == 1){
    			numerator1 = splitAgain[0];
    			denominator = "1"; 
    		}else{
    			numerator1 = splitAgain[0];
    			denominator = splitAgain[1];
    		}
    	} else{
    		wholeNum = "0";
    		String[] splitAgain = splitFirstFraction[0].split("/"); 
    		if(splitAgain.length == 1){
    			numerator1 = splitAgain[0];
    			denominator = "1"; 
    		}else{
    			numerator1 = splitAgain[0];
    			denominator = splitAgain[1];
    		}
    	}
    	if(splitSecondFraction.length == 2){
    		wholeNum2 = splitSecondFraction[0];
    		String[] splitAgain2 = splitSecondFraction[1].split("/");
    		if(splitAgain2.length == 1){
    			numerator2 = splitAgain2[0];
    			denominator2 = "1"; 
    		}else{
    			numerator2 = splitAgain2[0];
    			denominator2 = splitAgain2[1];
    		}
    	} else{
    		String[] splitAgain2 = splitSecondFraction[0].split("/"); 
    		if(splitAgain2.length == 1){
    			wholeNum2 = splitAgain2[0];
    			numerator2 = "0";
    			denominator2 = "1"; 
    		}else{
    			wholeNum2 = "0";
    			numerator2 = splitAgain2[0];
    			denominator2 = splitAgain2[1];
    		}
    	}
    	return "whole:" + wholeNum2 + " numerator:" + numerator2 + " denominator:" + denominator2;        
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    

}

