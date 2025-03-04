import java.util.Scanner;
public class P28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cnt=0;
        System.out.println("Enter the Number");
        int N=sc.nextInt();
        while(N>0){
            
            int digit=N%10;
            cnt++;
            N=N/10;
        }
        System.out.println(cnt);
    }
    
}
