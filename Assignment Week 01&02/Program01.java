public class Program01{
    public int addnumber(int a,int b){
        return a+b;
    }
    public String addBinary(String a,String b){
        int number1=Integer.parseInt(a,2);
        int number2=Integer.parseInt(b,2);
        int sum=number1+number2;
        return Integer.toBinaryString(sum);

    }
    public int addCharacter(char a,char b){
        return a+b;
    }
    public static void main(String[] args){
        Program01 p=new Program01();
            
            int num1 = 5, num2 = 10;
            System.out.println("Sum of two numbers: " + p.addnumber(num1, num2));
    

            String bin1 = "1010", bin2 = "1101"; 
            System.out.println("Sum of two binary numbers: " + p.addBinary(bin1, bin2));
    
            
            char ch1 = 'A', ch2 = 'B'; 
            System.out.println("Sum of two characters: " + p.addCharacter(ch1, ch2));
    }
}