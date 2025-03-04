import java.util.Scanner;
public class Program02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the principal Amount");
        double principal=sc.nextDouble();

        System.out.println("Enter the rate of interest");
        double rate=sc.nextDouble();

        System.out.println("Enter the number of year rate of interest compounteded per year(n)");
        int n=sc.nextInt();

        System.out.println("Enter the time in a year");
        Double t=sc.nextDouble();

        double amount=principal*Math.pow(1+(rate/100)/n, n*t);
        double compoundInterest=amount-principal;

        System.out.println("Final Amount"+amount);
        System.out.println("Compound interest"+compoundInterest);
    }
    
}
