import java.util.Scanner;

public class class_main_armStrong73 {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();//1634
		boolean rs = IsArmStrong(x);
		if (rs == true)
			System.out.println("is a arm Strong number:");
		else
			System.out.println("is not a arm Strong Number:");

	}

	static boolean IsArmStrong(int n) {
		int sum = 0, t = n;
		int dc = CountDigit(n);
		do {
			int r = n % 10;
			sum = sum + getpow(r, dc);
			n = n / 10;

		} while (n != 0);
		return sum == t;
	}

	static int CountDigit(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;
		} while (a != 0);
		return count;
	}

	static int getpow(int n, int p) {
		int pow = 1;
		while (p > 0) {
			pow = pow * n;
			p--;
		}
		return pow;

	}
}
