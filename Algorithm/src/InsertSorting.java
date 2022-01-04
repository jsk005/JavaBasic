public class InsertSorting {
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print("[" + a[i] + "]");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] a = {90, 34, 78, 12, 56};
        int ins, cmp, temp;

        // 정렬 전의 배열 내용을 표시
        System.out.print("정렬 전 배열\n");
        printArray(a);
        System.out.print("\n");

        int[] aa = arr(a);
        // 정렬 후의 배열 내용 표시
        System.out.print("정렬 후 배열\n");
        printArray(aa);

        System.out.print("\n");

        int[] bb = brr(a);
        // 정렬 후의 배열 내용 표시
        System.out.print("정렬 후 배열\n");
        printArray(bb);
    }

    public static int[] arr (int[] a){
        int ins, cmp, temp;
        // 삽입 정렬로 오름차순 정렬
        for(ins = 1; ins < a.length; ins++){
            temp = a[ins];
            for(cmp = ins -1; cmp >= 0; cmp--){
                if(a[cmp] > temp){
                    a[cmp + 1] = a[cmp]; // 자리 바꿈
                    System.out.printf(
                            "ins=%d, cmp=%d, temp=%d, a[%d]=%d, a[%d]=%d",
                            ins,cmp,temp,cmp,a[cmp],cmp+1,a[cmp+1]
                    );
                } else {
                    break;
                }
                System.out.print("\n");
            }
            a[cmp + 1] = temp;
            System.out.printf("cmp=%d, Temp=%d, a[%d]=%d\n",cmp, temp, cmp+1, temp);
        }
        return a;
    }

    public static int[] brr (int[] a){
        int ins, cmp, temp;
        // 삽입 정렬로 내림차순 정렬
        for(ins = 1; ins < a.length; ins++){
            temp = a[ins];
            for(cmp = ins -1; cmp >= 0 && a[cmp] < temp; cmp--){
                a[cmp + 1] = a[cmp];
            }
            a[cmp + 1] = temp;
        }
        return a;
    }
}
