import java.util.*;
public class minimumDifferenceBetweenHighestAndLowestKScores {

    public static int highestLowestDiff(int arr[],int k){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        if(n==1){
            return 0;
        }
        Arrays.sort(arr);
        for (int i = 0; i + k - 1 < n; i++) {
        int diff = arr[i + k - 1] - arr[i];
        min = Math.min(min, diff);
    }
    return min;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,9};
        System.out.println(highestLowestDiff(arr, 3));
    }
}