package Atividade_5;

public class Atividade_5_20 {

	public static void main(String[] args) {
		int i,j;
		for (i=0, j = 10; i < 4; i++, j++)
			System.out.print(i + " ");
		do {
			System.out.print(j + " ");
			i = i + 5;
		} while (i < 10);
	}
}
