package Recurssion.two.Assingment;
import java.util.HashMap;
import java.util.Scanner;

public class Flags {
    public static int dpFlags(int n){
        if(n==1 || n==2)
        {
            System.out.println(2);
            return 0;
        }
        long dp[][] = new long[n+1][5];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=3;j++)
                dp[i][j]=0;
        }

        // red=0,bluer(blue which come after red )=1,blue(blue which come after w)=2 white=3;
        dp[1][0]=1;// 1st s band can only red or white
        dp[1][3]=1;
        for(int i=2;i<n;i++)
        {
            dp[i][0]=dp[i-1][2]+dp[i-1][3];// for red
            dp[i][1]=dp[i-1][0];// for blue after red
            dp[i][2]=dp[i-1][3];// for blue after white
            dp[i][3]=dp[i-1][0]+dp[i-1][1];// for white
        }

        dp[n][0]=dp[n-1][2]+dp[n-1][3];// last band can be red and white only
        dp[n][3]=dp[n-1][1]+dp[n-1][0];

        System.out.println(dp[n][0]+dp[n][3]);
        return 0;
    }
    public static int flags(int n){
        return flags(n,'w','b') + flags(n,'r','b');
    }
    public static int flags(int n,char prev,char prevPrev){
       return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(flags(n));

    }
}
