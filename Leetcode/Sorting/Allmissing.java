// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
public class Allmissing {

    public static void main(String[] args) 
    {
        
    }
}
class Solution {
     List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        // Cyclic Sort
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }

        // Storing the missing numbers
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }

        }
        return ans;
    }

    // swap method
    static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}