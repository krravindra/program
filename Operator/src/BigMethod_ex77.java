import java.util.Scanner;

public class BigMethod_ex77 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	//bigMethod m=new bigMethod();
	int z=big(n);
	System.out.println(z);
}
static int big(int a)
{
	int d=a%10;
	do {
		int r=a%10;
		if(d<r)
			d=r;
		a=a/10;
	}while(a!=0);
	return d;
}
}
