import java.util.Scanner;

public class Mainptr18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of N:");
		int k = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(k % 2 + " ");
				k++;
			}
			System.out.println();
		}
	}

}
