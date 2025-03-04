import java.util.Scanner;

public class Program03 {
    public static long pow(int base,int exponent){
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;

        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        int base=sc.nextInt();

        System.out.println("Enter the Exponent");
        int exponent=sc.nextInt();

        long result=pow(base,exponent);
        System.out.println(result);

    }    
}
