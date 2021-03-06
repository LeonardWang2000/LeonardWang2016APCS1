
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if(statement.indexOf("Mr.") >= 0){
			response = "He sounds like a great teacher!";
		} else if(statement.indexOf("Mrs.") >= 0
				|| statement.indexOf("Ms.") >= 0) {
			response = "She sounds like a great teacher!";
		} else if(statement.indexOf("Hi")>= 0
				||statement.indexOf("Hey") >=0){
			response = "Howdy!";
		} else if(statement.indexOf("you")>=0){
			response = "Let's not talk about me";
		} else if(statement.indexOf("food") >= 0){
			response = "I eat humans";
		}
		else {
			response = getRandomResponse();
		}
		String noSpaceStatement = statement.trim();
		int lengthOfStatement = noSpaceStatement.length();
		if(lengthOfStatement == 0){
			response = "Say something, please.";
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if( whichResponse == 4){
			response = "Hahaha, very funny.";
		} else if(whichResponse == 5){
			response = "I like it, sounds nice.";
		}

 		return response;
	}
}
