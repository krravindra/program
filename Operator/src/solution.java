import java.util.Scanner;
public class solution {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter the value:");
	int big=0;
			do {
				int d=n%10;
				if(d>big)
					big=d;
					n=n/10;
			}while(n!=0);
			System.out.println(big);
}
}



