import java.util.Scanner;

public class Euclid {
    // 유클리드 호제법 : 두 정수의 최대공약수(모두를 나눌 수 있는 최대값)를 구하는 알고리즘
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;

        a = scn.nextInt();
        b = scn.nextInt();
        scn.close();

        System.out.printf("%d\n", gcd(a,b));
        System.out.printf("%d\n", GCD(a,b));
    }

    static int GCD(int a, int b) {
        int i = 0;
        while (a != b) { // 두 값이 같지 않을 때까지 계속한다.
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
            System.out.println("반복횟수 : " + i);
            i++;
        }
        return a;
    }

    static int gcd(int a, int b) { //최대공약수
        int i = 0;
        while(b != 0) {
            int r = a % b; // 숫자를 나눈 나머지를 계산
            a = b;
            System.out.println(i +"번째 : r = "+ r + ", a = " + a);
            b = r; // 나머지가 0이 될 때까지 계속한다.
            i++;
        }
        return a;
    }
}


