import java.util.Scanner;
public class mainptr21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of N:");
		int n = sc.nextInt();
		for (int i = n; i >= n; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.println("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
