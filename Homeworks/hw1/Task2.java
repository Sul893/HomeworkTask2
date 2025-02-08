import java.util.Scanner;
public class Task2 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		
		System.out.println("Введите элементы ");
		for ( int e = 0; e < length; e++) {
			array[e] = scanner.nextInt();
		}
		
		int kol = 0;
		
		for ( int e = 1; e+1 < length; e++) {
		if ( (array[e] > array[e+1]) && (array[e] > array[e-1]) && (array[e]%2==0) ) {
			kol++;
			}
		}
		
		if (kol == 2){
			System.out.println("В последовательности ровно два чётных по значению локальных максимума");
		} else {
			System.out.println("не правильно");
		}
		
	}
}
			