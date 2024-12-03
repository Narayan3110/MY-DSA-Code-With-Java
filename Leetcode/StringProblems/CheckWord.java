
//Problem check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence
//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/?envType=daily-question&envId=2024-12-03


class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        
        String[] split = sentence.split(" ");
        
        for(int i = 0 ; i < split.length ; i++){
            if(split[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}