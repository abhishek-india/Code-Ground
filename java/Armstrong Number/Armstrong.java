import java.util.*;
class Armstrong
{
	  
  public static void main(String[] args)  
  {  
  	Scanner sc= new Scanner(System.in);
    int sum=0,a,temp;  
    System.out.println("Enter a number");
    int n=sc.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    sum=sum+(a*a*a);  
    }  
    if(temp==sum)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  