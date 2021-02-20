package homework2;

import java.util.Scanner;

public class homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int a = 10 - m;
        int b = 10 - n;

        if(Math.abs(a)>Math.abs(b)){
            System.out.println(n);
        } else{
            System.out.println(m);
        }
    }
}
