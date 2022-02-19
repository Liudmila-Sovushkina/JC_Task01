package by.epam.tr.main;

public class Task7 {
	public static void main(String[] args) {

		// 7. Составить программу для вычисления значений функции F(x) на отрезке [а, b]
		// с шагом h. Результат представить в виде таблицы, первый столбец которой –
		// значения аргумента, второй - соответствующие значения функции: F(x) =
		// sin^2(x)-cos(2x)

		double a = 3.5;
		double b = 6.5;
		double h = 0.5;
		double x, y;

		System.out.println("---------------------");
		System.out.printf("|%5s    |  %5s |\n", "x", "y=F(x)");
		System.out.println("---------------------");

		for (x = a; x <= b; x = x + h) {
			y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
			System.out.printf("|  %5.2f  |  %5.2f  |\n", x, y);
		}
		System.out.println("---------------------");
	}
}
