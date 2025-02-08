import java.util.Scanner;
public class Task3 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину последовательности:");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Введите элементы последовательности:");
		for ( int e = 0; e < n; e++) {
			arr[e] = scanner.nextInt();
		}
		
		//	а 
		// for (int i = 0; i < n; i++) {
		// 	boolean isUnique = true;
		// 	for (int j = 0; j < n; j++) {
		// 		if (i != j && arr[i] == arr[j]) {
		// 			isUnique = false;
		// 			break;
		// 		}
		// 	}
		// 	if (isUnique) {
		// 		System.out.print(arr[i] + " ");
		// 	}
		// }
		
		//	б 
		// for (int i = 0; i < n; i++) {
		// 	boolean exists = false;
		// 	for (int j = 0; j < i; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			exists = true;
		// 			break;
		// 		}
		// 	}
		// 	if (!exists) {
		// 		System.out.print(arr[i] + " ");
		// 	}
		// }
		
		//	в
		// int count = 0;
		// for (int i = 0; i < n; i++) {
		// 	boolean exists = false;
		// 	for (int j = 0; j < i; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			exists = true;
		// 			break;
		// 		}
		// 	}
		// 	if (!exists) {
		// 		count++;
		// 	}
		// }
		// System.out.println(count);
		
		//	г
		// int countDuplicates = 0;
		
		// for (int i = 0; i < n; i++) {
		// 	boolean isDuplicate = true;
		// 	for (int j = 0; j < i; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			isDuplicate = true;
		// 			break;
		// 		}
		// 	}
		// 	if (!isDuplicate) {
		// 		int freguency = 0;
		// 		for (int j = 0; j < n; j++) {
		// 			if (arr[i] == arr[j]) {
		// 				freguency++;
		// 			}
		// 		}
		// 	}
			
		// 	if (freguency > 1) {
		// 		countDuplicates++;
		// 	}
		// }
		
		// System.out.println(countDuplicates);
		
		//	е
		// boolean hasDuplicates = false;
		// for (int i = 0; i < n; i++) {
		// 	for (int j = i + 1; j < n; j++) {
		// 		if (arr[i] == arr[j]) {
		// 			hasDuplicates = true;
		// 			break;
		// 		}
		// 	}
		// 	if (hasDuplicates) {
		// 		break;
		// 	}
		// }
		// System.out.println(hasDuplicates);
	
			
	}
}
					
					
					