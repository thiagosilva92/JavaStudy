package atividade_4;

public class Atividade_4_01 {

		public static void main( String[] args) {
			int x = 10/3;
			
			System.out.println( func(x));
		}
		
		public static String func(int x) {
			if (x % 2 == 0)
				return ("uscs");
			else
				return ("Computação");
		}
}
