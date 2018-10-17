public class RotateUsingReversalAlgorithm {

    static void leftRotate(int arr[],int d){
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr, d ,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int arr[],int start,int end){
            int temp;
            while(start<end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
    }

    static void printArray(int arr[],int n){
        for(int i = 0;i < n ;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] =  new int[]{1,2,3,4,5,6,7};
        leftRotate(arr,3);
        printArray(arr,arr.length);
    }
}
