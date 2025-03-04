import java.util.HashMap;

public class P23 {
    public static String twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i]; // Take the current element
            int more = target - a; // Find the required pair

            if (map.containsKey(more)) {
                return "YES"; // Pair found
            }

            map.put(a, i); // Store element and its index
        }
        
        return "NO"; // No pair found
    }

    public static void main(String[] args) {
        int arr[] = {52, 3, 6, 5, 1, 2, 5, 6};
        int target =3;
        
        System.out.println(twoSum(arr, target));
    }
}
