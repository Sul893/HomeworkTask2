import java.util.Arrays;
import java.util.Scanner;
public class Task8 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		arr[0] = 1;
		for (int x = 1; x < n; x++) {
			if (arr[x-1] < 0) {
				arr[x] = ((arr[x-1] * (-1)) + 2);
			} else {
				arr[x] = ((arr[x-1] + 2) * (-1));
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
			
			
			