public class BubbleSort {
    public static void printArray(int[] a){
//        for(int i = 0; i < a.length; i++){
//            System.out.print("[" + a[i] + "]");
//        }
        for(int i: a){
            System.out.print("["+i+"]");
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

        int[] bb = brr(a);
        // 정렬 후의 배열 내용 표시
        System.out.print("정렬 후 배열(내림차순)\n");
        printArray(bb);

    }

    private static int[] arr(int[] a) {
        // 버블 정렬(오름차순)
        int i, j, temp;
        for (i = 0; i < a.length -1 ; i++) {
            for (j = 0; j < a.length - i -1; j++) {
                // 맨 뒤가 큰 수가 되도록 이동하고, 맨 뒷수를 하나씩 줄이기
                System.out.printf("i=%d, j=%d :: ",i, j);
                if (a[j] > a[j+1]) { // 배열 앞의 값이 더 크면
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    System.out.printf(
                            "j=%d, temp=%d, a[%d]=%d, a[%d]=%d",
                            j,temp, j, a[j], j+1, a[j+1]
                    );
                }
                System.out.print("\n");
                printArray(a);
            }
        }
        return a;
    }

    private static int[] brr(int[] a) {
        // 버블 정렬(내림차순)
        int i, j, temp;
        for (i = 0; i < a.length -1 ; i++) {
            for (j = 0; j < a.length - i -1; j++) {
//                System.out.printf("i=%d, j=%d :: ",i, j);
                if (a[j] < a[j+1]) { // 배열 앞의 값이 더 작으면
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
//                    System.out.printf(
//                            "j=%d, temp=%d, a[%d]=%d, a[%d]=%d",
//                            j,temp, j, a[j], j+1, a[j+1]
//                    );
                }
//                System.out.print("\n");
//                printArray(a);
            }
        }
        return a;
    }

}
