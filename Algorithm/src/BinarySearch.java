import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // 배열이 오름차순으로 정렬되어 있다.
        int[] a = {32,38,45,53,61,77,82,91,98,105};
        int x, pos, left, right, middle;

        System.out.print("x = ");
        x = scn.nextInt();  // 찾을 값을 입력한다.
        pos = -1;
        left = 0;
        right = a.length -1;
        scn.close();

        System.out.printf(
                "반복 실행 전 : pos = %d, middle = ?, left = %d, right = %d\n",
                pos,left,right);

        while (pos == -1 && left <= right){
            middle = (left + right) / 2;
            if(a[middle] == x ){
                pos = middle;
            } else if(a[middle] > x){
                right = middle -1 ;
            } else {
                left = middle + 1;
            }
            System.out.printf(
                    "반복 실행 중 : pos = %d, a[middle] = %d, middle = %d, left = %d, right = %d\n",
                    pos,a[middle],middle,left,right);
        }

        System.out.printf("pos = %d\n", pos);
    }
}
