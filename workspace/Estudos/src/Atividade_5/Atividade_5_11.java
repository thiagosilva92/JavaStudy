package Atividade_5;

public class Atividade_5_11 {

	public static void main(String[] args) {
		int i = 8, x = 0, y = 0;
		
		while (i >= 0) {
			if ((i % 2) == 0) {
				x++;
			}
			else y++;
			i = i - 1;
		}
		System.out.print(x + " " + y);
	}
}
