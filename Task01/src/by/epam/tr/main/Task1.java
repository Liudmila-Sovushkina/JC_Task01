package by.epam.tr.main;

public class Task1 {

	public static void main(String[] args) {

		// 1. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух
		// его последних цифр: true or false

		int num = 1543;

		int num1 = num / 1000 % 10;
		int num2 = num / 100 % 10;
		int num3 = num / 10 % 10;
		int num4 = num % 10;

		if (num1 + num2 == num3 + num4) {
			System.out.println("Сумма двух первых цифр числа " + num + " равна сумме двух его последних цифр: true");
		} else {
			System.out.println("Сумма двух первых цифр числа " + num + " равна сумме двух его последних цифр: false");
		}
	}
}
