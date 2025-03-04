import java.util.Scanner;
public class Program18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks of the student");
        int marks=sc.nextInt();

        if(marks>90 && marks<=100){
            System.out.println("Distinction");

        }
        else if(marks>80 && marks<=90){
            System.out.println("First Class");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Second Class");
        }
        else if(marks>40 && marks<=70){
            System.out.println("pass Class");
        }
        else{
        System.out.println("Fail");
        }
    }
    
}
