import java.util.Scanner;
public class Task1 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое число > 2 и < 9");
		int k = scanner.nextInt();
		if ((k <= 2) || (k >= 9)) {
			System.out.println("неа");
			k = scanner.nextInt();
		}
		System.out.println("Введите ");
		int n = scanner.nextInt();
		int length = 0;
		int y = n;
		while (y > 0) {
			length++;
			y = y / 10;
		}
		int g = 0;
		for ( int c = 0; c < length; c++) {
			if (c == 0) {
				g = g + (n % 10);
				n = n / 10;
			} else {
				while ( c > 0 ) {
					k = k * k;
					c = c - 1;
				}
				g = g + (n % 10) * k;
				n = n / 10;
			}
		}
		System.out.println(g);
	}
}
				
		
		

			