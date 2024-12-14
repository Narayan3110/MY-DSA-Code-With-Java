//Problem 1832 
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
        
    }
}
class Solution {
    public boolean checkIfPangram(String sentence)
    {
       Set<Character> Alphabet = new HashSet<>(); //Collection for storing Characters

       for(char c : sentence.toCharArray()){   //Converting String to Character Array and then to Character
        if(c >= 'a' && c <='z'){   
            
            Alphabet.add(c);   //Adding char to set 
        }
        
       }return Alphabet.size() == 26 ; //return true if charachter present in set are 26 
    }
}