public class Peak {
    
    
}
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int first = 0 ;
        int last = arr.length - 1 ;
        
        while(first < last){
            int middle = (first + last) / 2 ;

            if(arr[middle] > arr[middle + 1]){
                last = middle ;
            }else{
                first = middle + 1 ; 
            }

        }return first ;
        
    }
}

//Second Apporach 
class Solution2 {
    public int peakIndexInMountainArray(int[] arr) {
        
        int max = 0 ;
        int indexval = 0 ; 
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max= arr[i];
                indexval = i ;
            }
        }return indexval ;
    }
}