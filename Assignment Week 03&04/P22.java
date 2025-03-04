public class P22 {
    public static void main(String[] args){
        int mini;
        int arr[]={6,5,8,6,5,5,6,2,1,0};
        for(int i=0;i<arr.length-1;i++){
            mini=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
