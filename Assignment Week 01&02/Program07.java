import java.util.Scanner;
public class Program07 {
    public static int find_ascii(char a)
    {
        return (int)a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char c=sc.next().charAt(0);
        System.out.println(find_ascii(c));
    }
}
