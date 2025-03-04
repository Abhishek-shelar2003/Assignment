import java.util.Scanner;
public class Program05 {
    public static int recarea(int length,int width){
        return length*width;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int length=sc.nextInt();
        System.out.println("Enter the width");
        int width=sc.nextInt();
        int area=recarea(length,width);
        System.out.println("Area of Rectangle:"+area);


    }
    
}
