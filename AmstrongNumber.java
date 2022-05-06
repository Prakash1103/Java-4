package week1day4assignment;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int sum=0;
		int orginalNumber=a;
		while(a>0) {
			int rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
			
		}
if ( sum==orginalNumber) {
	System.out.println("amstrong number "+ sum );
}
else {
	System.out.println("NOT amstrong num  "+ sum);
}
	}

}
