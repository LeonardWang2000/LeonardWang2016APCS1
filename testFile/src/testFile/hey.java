package testFile;
import java.util.*;
import java.io.*;
 

public class hey {

	public static void main(String[] args) throws FileNotFoundException{
		File wassup = new File("Resources/hi");
		Scanner whatIsGoingOn = new Scanner(new File("Resources/hi"));
		ArrayList<Double> his = new ArrayList<Double>();
				for(int i = 0; i < wassup.length(); i++){
					if(whatIsGoingOn.hasNextDouble()){
						his.add(whatIsGoingOn.nextDouble());
					}
				}
				for(int i = 0; i < his.size()-1; i++){
					System.out.println(his.get(i+1) - his.get(i));
				}
	}

}
