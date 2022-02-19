package by.epam.tr.main;

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {

		// 9. Заданы два одномерных массива с различным количеством элементов и
		// натуральное число k. Объединить их в один массив, включив второй массив между
		// k-м и (k+1) - м элементами первого.

		int[] mas1 = new int[7];
		int[] mas2 = new int[3];
		int[] mas3 = new int[mas1.length + mas2.length];

		int k = 2;

		Random rand = new Random();

		// Массив 1
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = rand.nextInt(20);
		}
		System.out.printf("Массив 1:");
		for (int i = 0; i < mas1.length; i++) {
			System.out.printf("%4d ", mas1[i]);
		}

		// Массив 2
		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = rand.nextInt(20);
		}
		System.out.printf("\nМассив 2:");
		for (int i = 0; i < mas2.length; i++) {
			System.out.printf("%4d ", mas2[i]);
		}

		// Массив 3
		for (int i = 0; i <= k - 1; i++) {
			mas3[i] = mas1[i];
		}
		for (int i = k; i < mas2.length + k; i++) {
			mas3[i] = mas2[i - k];
		}
		for (int i = mas2.length + k; i < mas3.length; i++) {
			mas3[i] = mas1[k];
			k++;
		}
		System.out.printf("\nМассив 3:");
		for (int i = 0; i < mas3.length; i++) {
			System.out.printf("%4d ", mas3[i]);
		}
	}
}
