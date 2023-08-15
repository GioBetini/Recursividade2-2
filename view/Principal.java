package view;
import controller.Divide;
public class Principal {

	public static void main(String[] args) {
		controller.Divide cd = new controller.Divide();
		int dividendo = 31;
		int divisor = 2;
		
		int div = cd.Div(divisor, dividendo);
		System.out.println("O resto da divisão de "+dividendo+" por "+divisor+" é: "+div);
				

	}

}
