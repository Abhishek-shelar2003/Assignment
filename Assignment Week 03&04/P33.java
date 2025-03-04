import java.util.Arrays;

public class P33 {
    public static void main(String[] args) {
        int arr[]={10,5,6,2,4,8,6,5,2,3,3,0};
        int count=0;
        for(int num:arr){
            if(num%2==0){
                count++;
            }
        }
        int arr2[]=new int[count];
        int j=0;
        for (int num : arr) {
            if (num % 2 == 0) {
                arr2[j++] = num;
            }
        }
        System.out.println("Even Numbers Array: " + Arrays.toString(arr2));
    }
    
}
