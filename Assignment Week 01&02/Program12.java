public class Program12 {
    public static int checkPalimdrom(int n){
        int dup=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            rev=(rev*10)+digit;
        }
        if(rev==dup){
            return 1;

        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPalimdrom(12));
    }
}
