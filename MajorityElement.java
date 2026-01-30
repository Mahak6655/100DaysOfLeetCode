public class MajorityElement {

    //Brute Force Approach - O(n^2)
    // Approach :-Using Nested Loops :
    // The idea is to find the element that appears more than half the time in the array. If we find such an element, we return it;

    // 1. Make a variable majority and set it to -1.
    // 2. Traverse through each element of the array.
    // 3. Count how many times the current element appears.
    // 4. Check if its count is more than [n/2].
    // 5. Return the element if found; else, return -1.
    public static int majorityElement1(int arr[]){
        int majority =-1;
        int n = arr.length;

        //Loop through each element to check its frequency
        for(int i=0;i<n;i++){
            int count =1; //Count starts at 1 (include current element)

            //Count occurrences of nums[i] in the rest of the array
            for(int j=i+1;j<n;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }

            // If count exceeds n/2, it's a majority element
            if(count>n/2){
                majority = arr[i];
            }
        }
        return majority;
    } 


    //Best Approach :-Using Boyer-Moore Voting Algorithm :
    //Moore’s Voting Algorithm works by canceling out different elements against each other. Since the majority element appears more than half the time, it survives this cancellation and becomes the final candidate. We then verify if it's truly the majority element or not.

    //1. Make the first element (nums[0]) the majority candidate, and its count = 1.
    //2. Iterate over the Array to Find a Possible Candidate Iterate the array:
        //*Increase the count of the candidate and the current element match
        //* If it doesn’t match, decrease the count
        //*If the count becomes zero, update the current element as the new candidate and reset the count to 1.
    // 3. Check if the Candidate is Majority element or not
        //*After identifying a candidate, traverse the array and count its frequency.
        //*Return it as the majority if it occurs more than n/2 times.

        public static int majorityElemnt2(int arr[]){
        int freq =0;
        int ans =0;

        for(int i=0;i<arr.length;i++){
            if(freq == 0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        System.out.println(majorityElemnt2(nums));
    }
}
