import java.util.*;
class Main{
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        System.out.println("enter the symbol");
        char b=sc.next().charAt(0);
     
        for(int i=1;i<=a;i++){
            
            
            for(int j=1;j<=a;j++){
                if(i==a || j==1 || j==i){
                    System.out.print(b + " ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        
       
        

    }
}