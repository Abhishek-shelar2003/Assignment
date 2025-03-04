import java.util.Scanner;
public class P34{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the Number N");
        int N=sc.nextInt();
        System.out.println("Enter the Value of D");
        int D=sc.nextInt();
        while(N>0){
            int digit=N%10;
            if(digit==D){
                count++;
            }
            N=N/10;
        }
        System.out.println("Number of digit present in the Number is:"+count);
        }
}