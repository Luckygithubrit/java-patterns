import java.util.*;
class Lucky {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        System.out.println("enter the symbol");
        char b=sc.next().charAt(0);
     
        for(int i=1;i<=a;i++){
            
            for(int j=a;j>i;j--){// print column number
						
                System.out.print(" ");//upper pyramid
                
            }
            for(int k=1;k<=i;k++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        for(int i=a-1;i>=1;i--){
            
            for(int j=a;j>i;j--){// print column number
                System.out.print(" ");//lower pyramid
                
            }
            for(int k=1;k<=i;k++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
       
        

    }
}