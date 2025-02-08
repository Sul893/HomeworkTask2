import java.util.Scanner;
public class Task4 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину :");
		int length = scanner.nextInt();
		int[] array = new int[length];
		
		System.out.println("Введите элементы :");
		for ( int e = 0; e < length; e++) {
			array[e] = scanner.nextInt();
		}
		int p = 0;
		
		for ( int x = 0; x < length; x++) {
			int dl = 0;
			int ch = 0;
			while (array[x] > 0) {
				int y = array[x] % 10;
				dl++;
				array[x] = array[x] / 10;
				if (y % 2 == 0) {
					ch++;
				}
			}
			if (((dl == 3) || (dl == 5)) && ((ch == 0) || (ch == dl))){
				p++;
			}
		}
		
		if (p == 2) {
			System.out.println("+");
		} else {
			System.out.println("-");
		}
					
	}
}