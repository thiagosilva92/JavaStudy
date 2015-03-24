package atividade_4;

public class Atividade_4_17 {
	
	public static void main( String[] args) {
		
		int A = 0xAB;
		int B = 0xFB;
		
		System.out.println((A & B) | (~A & A));
	}

}
