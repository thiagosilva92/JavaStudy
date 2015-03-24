package atividade_4;

public class Atividade_4_19 {

	public static void main( String[] args) {
		
		int A = 0x000F;
		int B = 0X000F;
		int C = 0xFFFF;
		
		System.out.println( (A & C) | (~B & B) );
	}
}
