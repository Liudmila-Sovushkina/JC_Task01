package by.epam.tr.main;

public class Task3 {

	public static void main(String[] args) {

		// 3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		// двух катетов.

		double a = 3.2;
		double b = 4.5;
		double c = Math.sqrt(a * a + b * b);

		double Perimeter = a + b + c;
		double Area = a * b / 2;

		System.out.println("Периметр прямоугольного треугольника = " + Perimeter + '\n'
				+ "Площадь прямоугольного тругольника = " + Area);
	}
}
