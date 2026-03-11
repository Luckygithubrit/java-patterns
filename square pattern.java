import java.util.*;

public class Solution {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        System.out.println("enter the symbol");
        char b='*';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1||i==a||j==1||j==a){
                    System.out.print(b +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}