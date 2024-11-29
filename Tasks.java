import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        System.out.println("Введите k");
        int k = sc.nextInt();
        System.out.println("Введите n");
        int n = sc.nextInt();
        int fin = 0;
        for (int i = String.valueOf(n).length(); i > 0; i--) {
            fin += (n / (int) Math.pow(10, i - 1)) * ((int) Math.pow(k, i - 1));
            n -= (n / (int) Math.pow(10, i - 1)) * (int) Math.pow(10, i - 1);
        }
        System.out.println(fin);

        // Task 2
        System.out.println("Введите длину массива: ");
        int l = sc.nextInt();
        int[] arrr = new int[l];
        for (int i = 0; i < l; i++) {
            arrr[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < l - 2; i++) {
            if (arrr[i + 1] > arrr[i + 2] && arrr[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter == 2);

        // Task 3
        double PI = 3.141592653589793;
        System.out.println("Введите m ");
        int m = sc.nextInt();
        System.out.println("Введите n ");
        n = sc.nextInt();
        double a1 = m * 10.0 / n;
        double a2 = n * 2.0 / m;
        System.out.println((Math.abs(a1 - PI) > Math.abs(a2 - PI)) ? "n/m" : "m/n");

        // Task 4
        System.out.println("Введи N");
        n = sc.nextInt();
        counter = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String strA = String.valueOf(a);
            if (strA.length() == 3 || strA.length() == 5) {
                boolean flag1 = true, flag2 = true;
                for (char num : strA.toCharArray()) {
                    int dv = Character.getNumericValue(num);
                    if (dv % 2 == 0) flag2 = false;
                    if (dv % 2 != 0) flag1 = false;
                }
                if (flag1 || flag2) counter++;
            }
        }
        if (counter == 2) {
            System.out.println("да");
        }

        // Task 6
        System.out.println("ВВедите N");
        n = sc.nextInt();
        double a = sc.nextDouble();
        double res = 0, res1 = 1;
        for (int i = 0; i < n; i++) {
            res += 1 / Math.pow(a, Math.pow(2, i));
        }
        for (int i = 0; i < Math.sqrt(n); i++) {
            res1 *= (a - n * i);
        }
        System.out.println(res);
        System.out.println(res1);

        // Task 7
        n = sc.nextInt();
        int temp = n, i = 0;
        while (n != 0) {
            n /= 10;
            i++;
        }
        n = temp;
        System.out.println(i);
        System.out.println(n / 100 + (n / 10) % 10 + n % 10);
        System.out.println(n / 100);
        System.out.println(n % 100 - n % 10);

        // Task 8
        n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        System.out.println(arr[0]);
        for (i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * -1 + (i % 2 == 0 ? 2 : -2);
            System.out.println(arr[i]);
        }

        // Task 9
        a = sc.nextDouble();
        System.out.println(f(a));
        System.out.println(f1(a));

        // Task 10
        n = sc.nextInt();
        int b = n % 10;
        int c = n % 100;
        String suffix = (b == 1 && c != 11) ? "год" :
                        (b >= 2 && b <= 4 && (c < 12 || c > 14)) ? "года" : "лет";
        System.out.println(n + " " + suffix);
    }

	    
	public static double f(double a) {
	        if (a <= 0) return 0;
	        else if (a <= 1) return a;
	        else return Math.pow(a, 4);
	    }

    public static double f1(double a) {
	    if (a <= 0) return 0;
	        else if (a <= 1) return a * a - a;
	        else return a * a - Math.sin(Math.PI * a * a);
	}
}