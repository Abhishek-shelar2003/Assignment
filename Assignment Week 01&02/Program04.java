import java.util.Scanner;
public class Program04 {
    public static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.print("Number 1 "+num1+"Number 2 "+num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=sc.nextInt();
     
        System.out.println("Enter the number 2");
        int num2=sc.nextInt();
        swap(num1, num2);    
    }    
}
