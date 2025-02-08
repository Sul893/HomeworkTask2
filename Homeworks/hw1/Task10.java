import java.util.Scanner;
public class Task10 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите возраст:");
		int n = scanner.nextInt();
		if (n > 100) {
			System.out.println("уверен?");
		}
		
		if (((n % 10) == 1) && ((n < 10) || (n > 20))) {
			System.out.println(n + " год");
		} else if (((n % 10 == 2) || (n % 10 == 3) || (n % 10 == 4)) && ((n < 10) || (n > 20))) {
			System.out.println(n + " года");
		} else if ((n % 10 == 5) || (n % 10 == 6) || (n % 10 == 7) || (n % 10 == 8) || (n % 10 == 9)) {
			System.out.println(n + " лет");
		} else {
			System.out.println(n + " лет");
		}
	}
}
		