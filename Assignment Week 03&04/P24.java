public class P24 {
    public static void main(String[] args){
        int arr1[][]={{1,2,3},{4,5,6}};
        int arr2[][]={{10,20,30},{40,50,60}};
        int arr3[][]=new int[2][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<=arr2.length;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<=arr3.length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    
}
