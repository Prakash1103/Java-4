package week1day4assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		  int sum = 0;
		   while(a>0) {
			   int digit=a%10;
			   sum=sum+digit;
			   a=a/10;
			   }
		   System.out.println("sum of digits: " + sum);
		}

	}


