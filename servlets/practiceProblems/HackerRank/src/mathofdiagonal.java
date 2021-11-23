import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void staircase(int n) {
 
        for(int i = 1; i <=n;i++){
            for(int j =i; j<=n; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=1;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        
    }
  
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        staircase(n);
    }
}