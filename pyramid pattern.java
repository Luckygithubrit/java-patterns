import java.util.*;
class Main {
    public static void main(String[] args) {
        //outer loop -> rows
//inner loop->symbol
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        System.out.println("enter the symbol");
        char b=sc.next().charAt(0);
        // int num=1;
        for(int i=1;i<=a;i++){
            for(int j=a;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(b+" ");
            }
            System.out.println();
            
        }
       
        

    }
}