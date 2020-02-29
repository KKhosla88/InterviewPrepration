import java.util.Scanner;

class fibonacci {
   private static int power(int m , int n){
       if (n == 1){
           return m;
       }
       return m * power(m,n-1);
   }
   private static void print(int n){
       if (n == 1){
           System.out.print(n + " ");
           return;
       }
       System.out.print(n + " ");
       print(n - 1);
   }
   private static int count(int n){
       if (n == 0){
           return 0;
       }
       int small = count(n/10);
       return small + 1;
   }
   private static int number(String str,int ans){
       if (str.length() == 1){
           ans = ans + str.charAt(0) - 48;
           return ans;
       }
       int smallAns = number(str.substring(1),ans);
       return str.charAt(0)*(int)(Math.pow(10,str.substring(1).length() + 1)) - 48 + smallAns;
   }
   private static String replace(String str , char c,char x){
       if(str.length() == 1) {
           if (str.charAt(0) == c){
               String small = "";
               return small + x;
           }
           else
           return str;
       }
       String small = replace(str.substring(1) , c, x);
       if (str.charAt(0) == c){
           return x + small;
       }
       else {
           return str.charAt(0) + small;
       }
   }
   private static String removeRecursively(String str){
       if (str.length() == 2){
           if (str.charAt(0) == str.charAt(1)){

               return "" + str.charAt(0);
           }
           else
           return str;
       }
       String small = removeRecursively(str.substring(1));
       if (str.charAt(0) == str.charAt(1)){
           return small;
       }
       else {
           return str.charAt(0) + small;
       }
   }
   private static boolean check(int[] input){
       if (input.length == 1){
           return true;
       }
       int[] smallAns = new int[input.length - 1];
       for (int i = 0 ; i < input.length - 1 ; i++){
           smallAns[i] = input[i];
       }
       if (check(smallAns)){
           return true;
       }
       else {
           return false;
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
