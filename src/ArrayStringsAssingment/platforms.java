package ArrayStringsAssingment;

import java.util.Scanner;

public class platforms {
    public static int countStations(int []arrival,int departure[]){
       int windowStart = arrival[0];
       int windowEnd = departure[0];
       int count = 1;
       for(int i = 1 ; i < arrival.length ; i++){
           if(arrival[i] > windowEnd ){
               windowEnd = departure[i];
               windowStart = arrival[i];
           }
           else if(arrival[i] <= windowStart && windowEnd <= departure[i]){
               count++;
               windowStart = arrival[i];
               windowEnd= departure[i];
           }
           else if(arrival[i] >= windowStart && windowEnd >= departure[i]){
               count++;

           }
           else if(arrival[i] > windowStart && departure[i] > windowEnd && arrival[i] < windowEnd){
               count++;
               windowEnd = departure[i];
           }
       }

        return count;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTrains = scanner.nextInt();
        int arrival[] = new int[noOfTrains];
        int departure[] = new int[noOfTrains];

        for(int i = 0 ; i < noOfTrains;i++){
            arrival[i] = scanner.nextInt();
        }

        for(int i = 0 ; i < noOfTrains;i++){
            departure[i] = scanner.nextInt();
        }
        System.out.println(countStations(arrival,departure));

    }




}
