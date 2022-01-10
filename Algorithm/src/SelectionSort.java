public class SelectionSort {
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print("[" + a[i] + "]");
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

        System.out.println("************************");
        int[] b = {95, 24, 68, 16, 53, 81};
        int[] bb = brr(b);
        // 정렬 후의 배열 내용 표시
        System.out.print("정렬 후 배열(내림차순)\n");
        printArray(bb);

    }

    private static int[] arr(int[] a) {
        // 선택 정렬(오름차순)
        int i, var, min, temp;
        for (i = 0; i < a.length -1 ; i++) {
            min = i;
            for (var = i + 1; var < a.length; var++) {
                // 맨 앞의 수를 하나씩 증가시키면서 값 비교하여 조건 비교 및 교체
                System.out.printf("i=%d, var=%d :: ",i, var);
                if (a[var] < a[i]) {
                    // 기준 값(i index)과 변동값(var index)을 비교하여
                    // 기준값(a[i])이 더 크면 맞바꿈
                    min = var;
                    temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                    System.out.printf(
                            "min=%d, temp=%d, a[%d]=%d, a[%d]=%d",
                            min,temp, i, a[i], min, a[min]
                    );
                }
                System.out.print("\n");
                printArray(a);
            }
        }
        return a;
    }

    private static int[] brr(int[] a) {
        // 선택 정렬(내림차순)
        int i, var, max, temp;
        for (i = 0; i < a.length -1 ; i++) {
            max = i;
            for (var = i + 1; var < a.length; var++) {
                // 맨 앞의 수를 하나씩 증가시키면서 값 비교하여 조건 비교 및 교체
                System.out.printf("i=%d, var=%d :: ",i, var);
                if (a[var] > a[i]) { // 배열 앞의 값이 더 크면
                    max = var;
                    temp = a[i];
                    a[i] = a[max];
                    a[max] = temp;
                    System.out.printf(
                            "max=%d, temp=%d, a[%d]=%d, a[%d]=%d",
                            max,temp, i, a[i], max, a[max]
                    );
                }
                System.out.print("\n");
                printArray(a);
            }
        }
        return a;
    }

}
