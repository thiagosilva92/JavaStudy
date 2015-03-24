package Atividade_5;

public class Atividade_5_07 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int trab;
		
		if (x > y)
			if (x > z)
				trab = x;
			else trab = z;
		else
			if (y > z)
				trab = y;
			else trab = z;
		
		System.out.println(trab);
	}
}
