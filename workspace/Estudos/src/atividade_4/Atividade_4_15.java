package atividade_4;

public class Atividade_4_15 {
	
	public static void main( String[] args) {
		
		int A = 0xA;
		int B = 0xB;
		
		System.out.println((A | B) | func(A,B));
	}
	
	public static int func(int a, int b) {
		return (a & b);
	}
}
