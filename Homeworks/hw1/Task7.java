import java.util.Scanner;
public class Task7 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n <= 100:");
		int n = scanner.nextInt();
		
		//а
		int kolch = 0;
		int sumch = 0;
		int n0 = n;
		while (n0 > 0) {
			kolch++;
			sumch = sumch + (n0 % 10);
			n0 = n0 / 10;
		}
		System.out.println(kolch); 
		
		//б
		System.out.println(sumch); 
		
		//в
		int n1 = 0;
		int n00 = n;
		int kol1 = kolch;
		while (kol1 > 1) {
			n00 = n00 / 10;
			kol1 = kol1 - 1;
		}
		n1 = n00;
		System.out.println(n1);
		
		//г
		if (n >= 10) {
			int npre = 0;
			int n000 = n;
			n000 /= 10;
			npre = n000 % 10;
			System.out.println(npre);
		}
		
	}
}