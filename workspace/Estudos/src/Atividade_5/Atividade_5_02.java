package Atividade_5;

public class Atividade_5_02 {

	public static void main(String[] args) {
		
		boolean x = 50 != 7;
		boolean y = true == (1 <= 0);
		
		if (x == y)
			System.out.println("USCS");
		else {
			if (x != y)
				System.out.println("Comp");
			else
				System.out.println("Algoritmo");
		}
	}
}
