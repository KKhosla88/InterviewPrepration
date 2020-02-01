package ArrayStringsAssingment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSubstring {

//    public static String largestSubstring(String str){
//        int start = 0;
//        int end = 0;
//        int count = 1;
//        int finalCount = 0;
//        HashMap<Integer,String> chHm = new HashMap<>();
//        HashMap<Character, Integer> regulator = new HashMap<>();
//        String ans = str.charAt(0) + "";
//        regulator.put(str.charAt(0),1);
//        chHm.put(1,ans);
//
//        while(end < str.length() - 1){
//            if(str.charAt(end) != str.charAt(end+1)){
//               if(str.charAt(end + 1) != str.charAt(start)) {
//                   if(!regulator.containsKey(str.charAt(end + 1))){
//                   end++;
//                   ans = ans + str.charAt(end);
//
//                   if(regulator.containsKey(str.charAt(end))) {
//                       regulator.put(str.charAt(end), regulator.get(str.charAt(end) + 1));
//                   }
//                   else{
//                       regulator.put(str.charAt(end),1);
//                   }
//
//                   count++;
//                   }
//                   else{
//                       end++;
//                       start = end;
//                       count = 1;
//                       ans = str.charAt(end + 1) + "";
//                   }
//               }
//               else if(str.charAt(end + 1) == str.charAt(start)){
//                   if(!regulator.containsKey(str.charAt(end + 1))){
//                       end++;
//                       start++;
//                       ans = ans + str.charAt(end);
//                       charRemoveAt(ans, 0);
//                       regulator.put(str.charAt(end), 1);
//                       if (regulator.get(str.charAt(start - 1)) == 1) {
//                           regulator.remove(str.charAt(start - 1));
//                       } else {
//                           regulator.put(str.charAt(start - 1), regulator.get(str.charAt(start - 1) - 1));
//                       }
//                   }
//                   else{
//                       end++;
//                       start = end;
//                       count = 1;
//                       ans = str.charAt(end + 1) + "";
//                   }
//               }
//               if(count > finalCount){
//                   finalCount = count;
//                   if(chHm.isEmpty()){
//                       chHm.put(finalCount,ans);
//                   }
//                   else {
//                       chHm.clear();
//                       chHm.put(finalCount,ans);
//                   }
//               }
//
//            }
//        }
//        return chHm.get(finalCount);
//    }
//    public static int findLength(String str) {
//        int windowStart = 0, maxLength = 0;
//        HashMap<Character, Integer> charIndexMap = new HashMap<>();
//        // try to extend the range [windowStart, windowEnd]
//        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
//            char rightChar = str.charAt(windowEnd);
//            // if the map already contains the 'rightChar', shrink the window from the beginning so that
//            // we have only one occurrence of 'rightChar'
//            if (charIndexMap.containsKey(rightChar)) {
//                // this is tricky; in the current window, we will not have any 'rightChar' after its previous index
//                // and if 'windowStart' is already ahead of the last index of 'rightChar', we'll keep 'windowStart'
//                windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
//            }
//            charIndexMap.put(str.charAt(windowEnd), windowEnd); // insert the 'rightChar' into the map
//            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
//        }
//
//        return maxLength;
//    }

    public static String largestSubstring(String str){
        String s="";
        int osi=0;
        int ose=0;
        int l=Integer.MIN_VALUE;

        int j;
        for(int i=0;i<str.length();i++){
            HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
            j=i;
            while(j<str.length()){
                if(hashMap.containsKey(str.charAt(j))){
                    break;
                }else{

                    hashMap.put(str.charAt(j),0);
                    j++;
                }
            }
            if(l<hashMap.size()){
                osi= i;
                ose= j;
                l=hashMap.size();
            }


        }

        for(int i=osi;i<ose;i++){
            s+=str.charAt(i);
        }
        return s;
    }






    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(largestSubstring(str));
    }
}
