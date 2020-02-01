package ArrayStringsAssingment;
import java.util.Scanner;

public class Sort012 {
    public static void sort012(int[] arr){
      int i = 0;
      int k = 0;
      int temp;
      while(i < arr.length - 1){
//          if(i < arr.length - 1) {
              if (arr[i] != 0 ) {
                  i++;
                  k++;
              } else if (arr[i] == 0) {
                  i++;
              }
              if (i != k && arr[i] != arr[k] && arr[k] == 0) {
                  temp = arr[i];
                  arr[i] = arr[k];
                  arr[k] = temp;
                  k++;
              } else {

              }
//          }
//          else {
//              if (i != k && arr[i] != arr[k] && arr[k] == 0) {
//                  temp = arr[i];
//                  arr[i] = arr[k];
//                  arr[k] = temp;
//                  k++;
//              } else {
//
//              }
//          }
      }
      for(int j = 0 ; j < arr.length;j++){
          System.out.print(arr[j] + " ");
      }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;  i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        sort012(arr);
    }
}
