package by.epam.tr.main;

public class Task5 {

	public static void main(String[] args) {

		// 5. Даны три действительных числа. Возвести в квадрат те из них, значения
		// которых неотрицательны, и в четвертую степень — отрицательные.

		double a = -2;
		double b = 3;
		double c = -1.1;
		double aPow, bPow, cPow;

		if (a >= 0) {
			aPow = Math.pow(a, 2);
		} else {
			aPow = Math.pow(a, 4);
		}
		System.out.println("a = " + a + " ; " + aPow);

		if (b >= 0) {
			bPow = Math.pow(b, 2);
		} else {
			bPow = Math.pow(b, 4);
		}
		System.out.println("b = " + b + " ; " + bPow);

		if (c >= 0) {
			cPow = Math.pow(c, 2);
		} else {
			cPow = Math.pow(c, 4);
		}
		System.out.println("c = " + c + " ; " + cPow);
	}
}
