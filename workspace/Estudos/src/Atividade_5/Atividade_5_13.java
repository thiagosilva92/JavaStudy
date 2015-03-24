package Atividade_5;

public class Atividade_5_13 {

	public static void main(String[] args) {
		int i = 8, x = 0, y = 0;
		
		while (i >= 0) {
			if ((i % 2) == 0) {
				x = x + i;
				/* 1º 0 + 8 =8 
				 * 2º 8 + 6 = 14 
				 * 3º 14 + 4 = 18 
				 * 4º 18 + 2 = 20 
				 * 5º 20 + 0 = 20 */
			}
			else y = y + i;
			/* 1º 0 + 7 = 7
			 * 2º 7 + 5 = 12
			 * 3º 12 + 3 = 15
			 * 4º 15 + 1 = 16*/
			i = i - 1;
		}
		System.out.print(x + " " + y);
	}
}
