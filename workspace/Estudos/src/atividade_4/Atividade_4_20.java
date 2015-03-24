package atividade_4;

public class Atividade_4_20 {

	public static void main(String[] args) {
		
		int A = 0xFF10;
		int B = 0x00FF;
		int C = 0x0110;
		
		System.out.println( (B & C) & (~A | B));
	}
}
