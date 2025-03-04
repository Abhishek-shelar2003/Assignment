public class Program20 {
    public static void main(String[] args){
        int sum=0;
        int[] arr={10,20,50,3,6,0,8,60,80,90,89,56,36};
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
        }
        double average=sum/arr.length;
        System.out.println(average);
    }
    
}
