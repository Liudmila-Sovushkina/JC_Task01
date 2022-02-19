package by.epam.tr.main;

public class Task2 {

	public static void main(String[] args) {

		// 2. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения)

		double a = 5.8;
		double b = -2.1;
		double c = 3.5;

		double d = b * b + 4 * a * c;
		double x = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		if (d >= 0 && a != 0 && b != 0) {
			System.out.println("x=" + x);
		} else {
			System.out.println("x=NaN");
		}
	}
}
