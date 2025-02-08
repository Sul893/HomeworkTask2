import java.util.Arrays;
import java.util.Scanner;
public class Task5 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 15 чисел:");
		int length = 15;
		double[] arr = new double[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextDouble();
		}
		System.out.println(Arrays.toString(arr));
		for ( int c = 0; c < length; c++) {
			if (arr[c] < 0) {
				arr[c] = arr[c] + 0.5;
			} else {
				
				arr[c] = 0.1;
			}
		}


		System.out.println(Arrays.toString(arr));
				
	}
}