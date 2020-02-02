package Recurssion.two.Lecture;

import java.util.Scanner;

public class Keypad {
    public static String[] keypad(int n)
    {
        if(n==0||n==1)
        {
            String a[]={""};
            return a;
        }
        else if(n==2)
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
        int b=n;
        n=n/10;
        String smallAns[] = keypad(n);
        int a=b%10;
        String z[]=keypad(a);
        String ans[] = new String[smallAns.length*z.length];

        int k = 0;
        for(int i = 0; i < z.length; i++)
        {
            for(int j = 0; j < smallAns.length; j++)
            {
                ans[k] = smallAns[j]+z[i];
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] str = keypad(num);

        for (int i = 0 ; i < str.length ; i++){
            System.out.println(str[i]);
        }
    }
}
