package Recurssion.two.Lecture;

import java.util.Scanner;

public class KeypadCombinations {
    public static String[] select(int n)
    {
        if(n==2)
        {
            String a[]={"a","b","c"};
            return a;
        }
        else if(n==3)
        {
            String a[]={"d","e","f"};
            return a;
        }
        else if(n==4)
        {
            String a[]={"g","h","i"};
            return a;
        }
        else if(n==5)
        {
            String a[]={"j","k","l"};
            return a;
        }
        else if(n==6)
        {
            String a[]={"m","n","o"};
            return a;
        }
        else if(n==7)
        {
            String a[]={"p","q","r","s"};
            return a;
        }
        else if(n==8)
        {
            String a[]={"t","u","v"};
            return a;
        }
        else if(n==9)
        {
            String a[]={"w","x","y","z"};
            return a;
        }
        else
        {
            String a[]={""};
            return a;
        }
    }
    public static void printKeypad(int input, String output)
    {
        if(input == 0)
        {
            System.out.println(output);
            return;
        }
        int x=input/10;
        int y=input%10;
        String z[]=select(y);

        // we choose to include the first character
        for(int i=0;i<z.length;i++)
            printKeypad(x,z[i]+output);

    }
    public static void printKeypad(int input)
    {
        printKeypad(input, "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printKeypad(num);
    }
}
