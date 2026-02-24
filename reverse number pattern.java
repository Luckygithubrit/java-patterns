import java.util.*;
class Main {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        // System.out.println("enter the symbol");
        // char b=sc.next().charAt(0);
        // int num=1;
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
            
        }
       
        

    }
}

