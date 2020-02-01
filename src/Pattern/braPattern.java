package Pattern;
import java.util.Scanner;

public class braPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n;i++){
            for (int j = 1; j <= n*2;j++){
                if(j <= n){
                    if (j - i > 0){
                        System.out.print(" ");
                    }

                    else {
                        System.out.print(j);
                    }
                }
                else{
                    if (n*2 - j + 1 - i <= 0 ){
                        System.out.print(n*2 - j + 1);
                    }

                    else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println();
        }
    }
}
