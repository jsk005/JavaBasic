public class InsertionSort {
    public static void printArray(int[] a){
        for(int i : a){
            System.out.print("[" + i + "]");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] a = {95, 24, 68, 16, 53, 81};

        // 정렬 전의 배열 내용을 표시
        System.out.print("정렬 전 배열\n");
        printArray(a);
        System.out.print("\n");

        int[] aa = arr(a);
        // 정렬 후의 배열 내용 표시
        System.out.print("정렬 후 배열(오름차순)\n");
        printArray(aa);

        System.out.print("\n");

        int[] bb = crr(a);
        // 정렬 후의 배열 내용 표시
        System.out.print("정렬 후 배열(내림차순)\n");
        printArray(bb);
    }

    public static int[] arr (int[] a){
        int i, prev, temp;
        // 삽입 정렬(오름차순)
        // 삽입 정렬이란 2번째 원소부터 n번째 원소까지 차례로
        // 해당 원소가 위치할 인덱스에 원소를 삽입하는 방식을 사용하는 정렬 방식
        for(i = 1; i < a.length; i++){
            temp = a[i];
            System.out.printf("a[%d]=%d(key) :: ",i, a[i]);
            for(prev = i -1; prev >= 0; prev--){
                if(a[prev] > temp){ // 이전 원소의 배열값이 key(temp)값보다 더 크면
                    a[prev + 1] = a[prev]; // 자리 바꿈
                    System.out.printf(
                            "i=%d, j=%d, temp=%d(key), a[%d]=%d",
                            i,prev,temp,prev+1,a[prev+1]
                    );
                } else {
                    break;
                }
                System.out.print("\n");
            }
            a[prev + 1] = temp;
            System.out.printf("i=%d, j=%d, a[%d]=%d\n",i, prev, prev+1, temp);
            printArray(a);
        }
        return a;
    }

    public static int[] brr (int[] a){
        int i, prev, temp;
        // 삽입 정렬(내림차순)
        for(i = 1; i < a.length; i++){
            temp = a[i];
            for(prev = i -1; prev >= 0 && a[prev] < temp; prev--){
                a[prev + 1] = a[prev];
            }
            a[prev + 1] = temp;
        }
        return a;
    }

    public static int[] crr (int[] a){
        int i, prev, temp;
        // 삽입 정렬(내림차순)
        for(i = 1; i < a.length; i++){
            temp = a[i]; // 현재 선택된 원소의 값을 임시 변수에 저장해준다.
            prev = i - 1; // 현재 원소를 기준으로 이전 원소를 탐색하기 위한 index 변수
            // 현재 선택된 원소가 이전 원소보다 큰 경우까지만 반복. 단, 0번째 원소까지만 비교
            while (prev >= 0 && a[prev] < temp){
                a[prev + 1] = a[prev];
                prev--;
            }
            // 탐색이 종료된 지점에 현재 선택되었던 변수의 값을 삽입해준다
            a[prev + 1] = temp;
        }
        return a;
    }
}
