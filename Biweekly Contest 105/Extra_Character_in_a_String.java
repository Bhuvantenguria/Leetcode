import java.util.*;
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> hash = new HashSet<>();
 
        for (String a : dictionary)
             hash.add(a);

        int counter = s.length();
 
        int[] arr_counter = new int[counter + 1]; 
        for (int i = 1; i <= counter; i++) 
        {
            arr_counter[i] = arr_counter[i - 1] + 1; 

            for (int j = i; j >= 1; j--)
            {
                String res = s.substring(j - 1, i);  

                if (hash.contains(res)) 
                {  
                    arr_counter[i] = Math.min(arr_counter[i], arr_counter[j - 1]); 
                }
            }
        }

        return arr_counter[counter];
    }
}