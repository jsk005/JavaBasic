import java.util.Scanner;

public class SequentialSearch { // 선형검색
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = {72,68,92,88,53,41,84,97,55,39};
        int x, pos, i;

        System.out.print("x = ");
        x = scn.nextInt();
        pos = -1; // 요소의 인덱스로 사용할 수 없는 값.

        for(i = 0 ; i < a.length && pos == -1; i++){
            if(a[i] == x){
                pos = i; // 배열에 중복값이 있어도 i가 변경되기 때문에 최초 일치값을 반환
            }
            // 원하는 값이 발견되지 않을 때는 pos 는 -1 을 표시
        }
        
        System.out.printf("pos = %d\n", pos);
    }
}
