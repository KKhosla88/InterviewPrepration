package Recurssion.two.Lecture;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr,int start,int end){
        if (start == end){
            return;
        }
        mergeSort(arr,start,(start+end)/2);
        mergeSort(arr,(start+end)/2+1,end);
        merge(arr,start,(start+end)/2,end);

    }
    public static void merge(int[] input,int start,int mid,int end)
    {
        int size1=mid-start+1;
        int size2=end-mid;
        int[] temp1=new int[size1];
        int[] temp2=new int[size2];
        for( int i=0 ; i<size1 ; ++i)
        {
            temp1[i]= input[ start + i];
        }
        for( int i=0 ; i<size2 ; ++i )
        {
            temp2[i] = input[mid + 1 + i];
        }
        int i=0,j=0,k=start;
        while(i<size1&&j<size2)
        {
            if(temp1[i]<=temp2[j])
            {
                input[k]=temp1[i];
                i++;
            }
            else
            {
                input[k]=temp2[j];
                j++;
            }
            k++;
        }
        while(i<size1)
        {
            input[k]=temp1[i];
            i++;
            k++;
        }
        while(j<size2)
        {
            input[k]=temp2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
