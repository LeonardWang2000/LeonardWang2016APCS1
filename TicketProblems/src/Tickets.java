
public abstract class Tickets {
	//Number is numberOfDays???
	private int number;
	public Tickets(int number){
		this.number = number;
	}
	public abstract int getPrice();
	public String toString(){
		return "Number: " + number + "Priceb : " + getPrice();
	}
}
