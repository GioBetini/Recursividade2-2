package controller;

public class Divide {

	public Divide() {
		super();
	}
	public int Div(int divisor, int dividendo) {
		if(dividendo<divisor) {
			return dividendo;
		}
		return Div(divisor,dividendo-divisor);
	} 

}
