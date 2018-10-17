public class PairInSortedRotatedArray {

    static boolean findPair(int arr[],int n, int key){
        int i=0;
        for(i = 0 ;i < n-1; i++){
//            if(arr[i]>arr[i-1]){
//                break;
//            }
            System.out.println("hi");
        }
        int l = (i+1)%n;
        int r = i;

        while(l!=r){
            if(arr[l]+arr[r]==key)
                return true;
            if(arr[l]+arr[r]<key)
                l=(l+1)%n;
            else
                r=(n+r-1)%n;
        }
        return false;


    }

    public static void main(String[] args) {
        int arr[]=new int[]{3,4,5,6,1,2};
        int len=arr.length;
        if(findPair(arr,len,10))
            System.out.println("yes");

    }
}
