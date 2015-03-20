package atividade_4;

public class Atividade_4_02 {

	public static void main( String[] args) {
		
		int x = 10;
		int y = 9;
		x = x / y;
		y = y / x;
		
		System.out.println( func(x,y) + func(y,x));
	}
	
	public static String func(int a, int b) {
		if ((a != b) | ( a > 2 ))
			return ("AB" + "X");
		else return ("RR");
	}
}
