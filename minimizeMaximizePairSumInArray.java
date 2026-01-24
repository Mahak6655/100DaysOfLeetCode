package leetcode;
import java.util.*;
public class minimizeMaximizePairSumInArray {

    public static int pairSum(int arr[]){
        Arrays.sort(arr);
        int max = 0;

        int smallest = 0;
        int largest = arr.length-1;
        while (smallest<largest) {
            int sum = arr[smallest]+arr[largest];
            max = Math.max(max, sum);
            break;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 8, 1, 9, 2};
        System.out.println(pairSum(arr));
    }
    
}