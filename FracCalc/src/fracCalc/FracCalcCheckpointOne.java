package fracCalc;
//FracCalc1
import java.util.*;




public class FracCalcCheckpointOne {


    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Put in your equation");
    	System.out.println(produceAnswer(scan.nextLine()));


    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
    	String[] splitString = input.split(" ");
    	String firstOperand = splitString[0];
    	String operator = splitString[1];
    	String secondOperand = splitString[2];
    	return secondOperand;        
    }


    // TODO: Fill in the space below with any helper methods that you think you will need
    
}

