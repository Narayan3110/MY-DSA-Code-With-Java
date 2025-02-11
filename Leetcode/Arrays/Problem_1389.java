import java.util.ArrayList;

public class Problem_1389 {

    //https://leetcode.com/problems/create-target-array-in-the-given-order/
    
    //create-target-array-in-the-given-order
    
    }

    //First Approach
    // Created a Array added the element And Repeating 1st step (X wrong Approach)

    //My Approach 2nd
    //
    //  1) Take ArrayList to store the value
    //	2) ArrayList because we can add Elements at specific position
    //	3) Store it in new or existing Array 
    
    class Solution {
    
        public int[] createTargetArray(int[] nums, int[] index) {
    

            //Taking An ArrayList
            ArrayList<Integer> test = new ArrayList<>();
            //Adding Elements at Specific Position
            for (int i = 0; i < nums.length; i++) {  
                test.add(index[i], nums[i]);
            }
    
            //Converting ArrayList to Array
            for (int i = 0; i < test.size(); i++) {
                nums[i] = test.get(i);
            }

            return nums;
    
        }
    }
    