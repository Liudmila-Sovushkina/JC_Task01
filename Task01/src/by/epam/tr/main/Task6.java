package by.epam.tr.main;

public class Task6 {

	public static void main(String[] args) {

		// 6. Написать программу нахождения суммы большего и меньшего из трех чисел.

		int a = (int) (Math.random() * 21 - 10);
		int b = (int) (Math.random() * 21 - 10);
		int c = (int) (Math.random() * 21 - 10);

		int min, max, sum;

		if (a > b) {
			if (b > c) {
				max = a;
				min = c;
			} else {
				min = b;
				if (a > c) {
					max = a;
				} else {
					max = c;
				}
			}
		} else {
			if (b < c) {
				min = a;
				max = c;
			} else {
				max = b;
				if (a < c) {
					min = a;
				} else {
					min = c;
				}
			}
		}
		sum = min + max;

		System.out.print("[" + a + "]  [" + b + "]  [" + c + "]");
		System.out.println("\nmin = " + min + "\nmax = " + max + "\nsum = " + sum);
	}
}
