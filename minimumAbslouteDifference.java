import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumAbslouteDifference {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        //find minimum difference
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,(arr[i]-arr[i-1]));
        }

        // Collect pairs with minimum difference
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1]) == min){
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,1,3};


        //Output: [[1,2],[2,3],[3,4]]
        //Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

    }
}
