package atividade_1;

public class Atividade_1_10 {
	public static void main(String[] args) {
		
		String S1 = args[0];
		String S2 = null;
		S2 = args[1]+args[0];
		
		int x = Integer.parseInt(S2);
		
		int y = Integer.parseInt(S1);
		
		System.out.println(x + y);
	}
}
