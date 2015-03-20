package atividade_4;

public class Atividade_4_04 {
	public static void main( String[] args) {
		char m = 'a';
		char n = 'x';
		
		func1(m);
		func2(n);
	}
	
	public static void func1(char x) {
		if ( x == 'a') {
			System.out.println("uscs");
			if (x == 'b')
				System.out.println("Sistemas");
		}
	}
	
	public static void func2(char y) {
		if (y != 'a')
			System.out.println("comp");
		else {
			if(y == 'x')
				System.out.println("informática");
		}
	}
}
