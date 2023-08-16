package controller;

public class Divide {

	public Divide() {
		super();
	}
	public int Div(int divisor, int dividendo) {
		if(dividendo<divisor) {
			return dividendo;  //A recursividade se encerra quando o dividendo for maior que o divisor (gerando o resto)
		}
		return Div(divisor,dividendo-divisor); // chamamos a função recursiva subtraindo o divisor do dividendo até obtermos o resto
	} 

}
