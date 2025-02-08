import java.util.Scanner;
public class Task3 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите m:");
		int m = scanner.nextInt();
		
		System.out.println("Введите n:");
		int n = scanner.nextInt();
		
		double PI = 3.141592653589793;
		double x = m/n;
		double y = n/m;
		
		if ((PI - x)<(PI - y)) {
			m = m * 10;
		} else {
			n = n * 2;
		}
		
		System.out.println("m = "+ m + ", n = " + n);
			
	}
}
		