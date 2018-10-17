public class MaxSumOnRotations {
    public static void main(String[] args) {
        int arr[] = new int[]{10,1,2,3,4,5,6,7,8,9};
        int sum = maxSum(arr);
        System.out.println(sum);

    }

    static int maxSum(int arr[]){
        int arrSum = 0;
        int curValue = 0;
        for(int i = 0;i < arr.length; i++){
            arrSum += arr[i];
            curValue +=(i*arr[i]);
        }

        int maxValue = curValue;
        for (int j=1; j<arr.length; j++)
        {
            curValue = curValue + arrSum-arr.length*arr[arr.length-j];
            if (curValue > maxValue)
                maxValue = curValue;
        }
        return maxValue;
    }
}
