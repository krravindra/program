import java.util.Scanner;

public class Mainpttr19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of N:");
		int k = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + n - j;

			}
			System.out.println();
		}
	}
}
