package atividade_1;

public class Atividade_1_01 {
	
	public static void main(String[] args) {
		String a = new String("USCS");
		String b = new String("Computa��o");
		
		a = b;
		b = a;
		
		System.out.println(a);
		System.out.println(b);
	}
}