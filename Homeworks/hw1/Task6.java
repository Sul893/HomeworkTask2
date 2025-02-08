import java.util.Scanner;
public class Task6 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите a:");
		double a = scanner.nextDouble();
		System.out.println("Введите n:");
		double n = scanner.nextDouble();
		
		// г
		double sum = (1.0 / a);
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / (Math.pow(a, i * 2));
		}
		
		System.out.println(sum);
			
		// д
		double sum2 = a;
		for (int i = 1; i<= n; i++) {
			sum2 *= (a - i * n);
		}
		
		System.out.println(sum2);
	}
}
			