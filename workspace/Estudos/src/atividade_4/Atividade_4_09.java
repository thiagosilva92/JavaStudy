package atividade_4;

public class Atividade_4_09 {
	
	public static void main( String[] args ) {
		int a = 0;
		
		System.out.println(func1(a) - func2(a));
	}
	
	public static float func1(int x) {
		
		float var1 = 15.0F;
		short var2 = 12;
		return (var1 + var2 + x);
	}
	
	public static double func2(int y) {
		
		double var1 = 10.0;
		short var2 = 6;
		return (var1 + var2 + y);
	}
}
