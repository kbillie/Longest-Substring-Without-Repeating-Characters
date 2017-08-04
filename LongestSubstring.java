/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubstring;

/**
 *
 * @author kailabillie
 */
public class LongestSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    
      public static int lengthOfLongestSubstring(String s) {
        
        char [] str = s.toCharArray();
        
        String substring = "";
        
        for (int i = 0; i<str.length; i++) {
            while ((!(substring.contains(str[i]+""))) && s.contains(substring) ) {
                substring += str[i];
            }
        }
        
        System.out.println(substring);
        return substring.length();
    }
    
}
