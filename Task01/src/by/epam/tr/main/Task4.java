package by.epam.tr.main;

public class Task4 {

	public static void main(String[] args) {

		// 4. Для данных областей составить линейную программу, которая печатает true,
		// если точка с координатами (х, у) принадлежит закрашенной области, и false — в
		// противном случае

		int x = -2;
		int y = 1;

		if ((x >= -4 && x <= 4 && y <= 0 && y >= -3) || (x >= -2 && x <= 2 && y > 0 && y <= 4)) {
			System.out.println("Точка с координатами (" + x + "," + y + ") принадлежит закрашенной области: true");
		} else {
			System.out.println("Точка с координатами (" + x + "," + y + ") принадлежит закрашенной области: false");
		}
	}
}