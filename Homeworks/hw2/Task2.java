import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 10 чисел:");
		int length = 10;
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int otrkol = 0;
		int polkol = 0;
		int otr = -1;
		int pol = 0;
		
		for ( int x = 0; x < length; x++) {
			if (arr[x] < 0) {
				otr = x;
				break;
			}
		}
		for ( int x = 0; x < length; x++) {
			if (arr[x] > 0) {
				polkol++;
				pol = x;
			}
		}
		if ((polkol > 0) && (otr != -1)) {
			int otrpovtor = arr[otr];
			arr[otr] = arr[pol];
			arr[pol] = otrpovtor;
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("Необходимые данные не найдены");
		}
		
	}
}
		
		