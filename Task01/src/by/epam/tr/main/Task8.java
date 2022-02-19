package by.epam.tr.main;

import java.util.Random;

public class Task8 {

	public static void main(String[] args) {

		// 8. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
		// которые кратны данному К.

		int n = 10;
		int k = 3;
		int sum = 0;
		int[] arA = new int[n];
		Random rand = new Random();

		System.out.print("Массив:\t ");

		for (int i = 0; i < arA.length; i++) {
			arA[i] = rand.nextInt(100);
		}
		for (int i = 0; i < arA.length; i++) {
			System.out.printf("%4d", arA[i]);
		}
		System.out.println();

		for (int i = 0; i < arA.length; i++) {
			if (arA[i] % k == 0) {
				sum += arA[i];
			}
		}
		System.out.printf("Сумма элементов массива A [N] кратных К=" + k + ": %4d", sum);
	}
}
