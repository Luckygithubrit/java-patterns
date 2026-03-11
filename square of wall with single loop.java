// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        System.out.println("enter the character:");
        char b=sc.next().charAt(0);
        for(int i=1;i<=a*a;i++){
            System.out.print(b+" ");
            if(i%a==0){
                System.out.println();
            }
            
        }
        
    }
}