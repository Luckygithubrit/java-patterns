import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value: ");
	    int a=sc.nextInt();
	    System.out.println("enter the charcter: ");
	    char b=sc.next().charAt(0);
	    System.out.println("the pattern is: ");
	    
	    
	    for(int i=1;i<=a;i++){
	        for(int j=i;j<=a;j++){
	            System.out.print(" ");//decreasing trianle with spaces
	        }
	        
	        for(int j=1;j<=i-1;j++){
	            System.out.print(b);//increasing triangle with stars
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print(b);
	        }
	       
	       
	        
	        
	        System.out.println();
	    }
	    
	    
	    
		
	}
}