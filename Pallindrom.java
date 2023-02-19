package aj;

/*public class Pallindrom {

	public static void main(String[] args)
	{
		int n = 0, r,sum=0,cube,temp ;    
		  
		  
		  temp=n;    
		  while(n>0)
		  {    
		   r=n%10;
		   cube = r*r*r;
		   sum=sum+cube;
		   n=n/10;    
		  }    
		  if(n==sum)    
		   System.out.println("Amstrong number ");    
		  else    
		   System.out.println("not");    
		}  
	

}*/import java.util.Scanner; public class Pallindrom
{
	public static void main(String[] args) 
	{ 
		int n, r, temp,cube, temp1,sum;
		System.out.println("Ënter 3 Digit Number"); 
		Scanner scanner = new Scanner(System.in); 
		n = scanner.nextInt(); scanner.close(); 
		sum = n;
	    while(n>0) 
		{ 
			r = n % 10;
			cube=r*r*r;
			sum = sum +cube;
			n=n/10;
		} 
		if(sum == n) System.out.println(n+ " is an Armstrong number"); 
		else System.out.println(n + " is not an Armstrong number"); 
		}
	}
