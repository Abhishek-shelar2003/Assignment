import java.util.Scanner;
class Circumference{
    public double circumference(int r1){
        return 2*3.14*r1;
    }
}
class Area{
    public double area(int r2){
        return 3.14*r2*r2;
    }
}
public class Program06 {
    public static void main(String[] args) {
        Circumference c1=new Circumference();
        Area a=new Area();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        int radius=sc.nextInt();

        System.out.println(c1.circumference(radius));
        System.out.println(a.area(radius));
    }
    
}
