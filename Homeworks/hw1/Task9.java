import java.util.Scanner;
public class Task9 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите a:");
		double a = scanner.nextDouble();
		// double f1 = 0;
		// if (a <= 0) {
		// 	f1 = 0;
		// } else if ((0 < a) && (a <= 1)) {
		// 	f1 = a;
		// } else {
		// 	f1 = a * a * a * a;
		// }
		// System.out.println("в " + f1);
		double f2 = 0;
		double PI = 3.141592653589793;
		if (a <= 0) {
			f2 = 0;
		} else if ((0 < a) && (a <= 1)) {
			f2 = a * a - a;
		} else {
			f2 = a * a - (Math.sin(PI * (a * a)));
		}
		System.out.println("г " + f2);
	}
}