public class N_ofthepower_p_ex71 {
public static void main(String[] args) {
	
	int P1=getPow(3,5);
	
	System.out.println(getPow(4,2));
	System.out.println(P1);
}
static int getPow(int n,int p)
{
	int pw=1;
while(p>0);
	{
		pw=pw*n;
		p--;
	}
	return pw;
}
}

