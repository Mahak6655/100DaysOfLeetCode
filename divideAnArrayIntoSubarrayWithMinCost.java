public class divideAnArrayIntoSubarrayWithMinCost {

    public static int minimumCost(int arr[]){
        int n = arr.length;
        int cost=0;
        if(n==3){
            return cost+=arr[0]+arr[1]+arr[2];
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i] < min2){
                min2 = arr[i];
            }
        }
        return cost+=arr[0]+min1+min2;
    }
    public static void main(String[] args) {
        int arr[] = {10,3,1,1};
        System.out.println(minimumCost(arr));
    }
}
