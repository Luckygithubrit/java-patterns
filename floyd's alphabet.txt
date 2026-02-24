import java.util.*;
class Main {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        // System.out.println("enter the symbol");
        // char b=sc.next().charAt(0);//single char variable continuos increment 
        char c='A';
        for(int i=1;i<=a;i++){
            // char c='A';
            for(int j=1;j<=i;j++){// print column number
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
       
        

    }
}