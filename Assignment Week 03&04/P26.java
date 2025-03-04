//Findout Highest and Second Heighest Number in an arr
public class P26 {
    public static int high(int[] arr){
        int high=arr[0];
        for(int i=0;i<arr.length;i++){
            if(high<arr[i]){
                high=arr[i];
            }
        }
        return high;
    }
    public static int shigh(int[] arr){
        int high=arr[0];
        int shigh1=-1;
        for(int i=0;i<arr.length;i++){
            if(high<arr[i]){
                shigh1=high;
                high=arr[i];
            }

        }
        return shigh1;
        
    }
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60,710};
        System.out.println(high(arr));
        System.out.println(shigh(arr));

    }
    
}
