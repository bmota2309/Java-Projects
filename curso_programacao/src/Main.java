import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Area area1 = new Area();
		// double area = area1.calcArea(30, 200);
		// System.out.printf("%.2f%n",area);
		// Locale.setDefault(Locale.US);
		// System.out.printf("%.4f%n",area);
		// System.out.printf("Area � de %2f",area);

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		x = sc.next(); // Solicita a inser��o do dado String ao usu�rio
		System.out.println("Voc� digitou: " + x);

		y = sc.nextInt();// Solicita a inser��o do dado Integer ao usu�rio
		System.out.println("Voc� digitou: " + y);

		z = sc.nextDouble();// Solicita a inser��o do dado Double ao usu�rio
		System.out.printf("Voc� digitou: %.2f %n ", z);

		char a;
		a = sc.next().charAt(0);// Armazena apenas a primeira letra digitada
		System.out.println("Voc� digitou: " + a);
		sc.close();

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;

		char gender = 'F';

		double price1 = 21000.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is %.2f %n", product1, price1);
		System.out.printf("%s, which price is %.2f %n", product2, price2);

		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.printf(
				"Measue whith eight decimal places: %f %nRouded (three decimal places):%.3f %nUS decimal point: %3f ",
				measure, measure, measure);

	}

}
