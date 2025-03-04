import java.util.Arrays;
public class P27 {
    public static void main(String[] args){
        
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
    
            int[] arr3 = new int[arr1.length + arr2.length];
    
            System.arraycopy(arr1, 0, arr3, 0, arr1.length);
            System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    
            System.out.println("Concatenated Array: " + Arrays.toString(arr3));
        
    }
    
}
