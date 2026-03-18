import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number:");
	    int a=sc.nextInt();
	    System.out.println("enter the character:");
	    char ch=sc.next().charAt(0);
	   //char num='A';
	    for(int i=1;i<=a;i++){
	       // char num='A';
	        for(int j=1;j<=i;j++){
	            System.out.print(ch+" ");
	        }
	        for(int j=1;j<=2*(a-i);j++){
	            System.out.print("  ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print(ch+" ");
	        }
	        
	        System.out.println();
	    }
	   
	   

	}
}