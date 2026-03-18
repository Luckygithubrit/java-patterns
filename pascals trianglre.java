import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number:");
	    int a=sc.nextInt();
	   // System.out.println("enter the character:");
	   // char ch=sc.next().charAt(0);
	    for(int i=0;i<a;i++){
	        int num=1;
	        for(int j=0;j<a-i;j++){
	            System.out.print(" ");
	        }
	        for(int j=0;j<=i;j++){
	            System.out.print(num+" ");
	            num=num*(i-j)/(j+1);
	        }
	        
	        System.out.println();
	        
	    }
	   // char ch=sc.next().charAt(0);
	    
	        
	        
	        
	    
	   
	   

	}
}