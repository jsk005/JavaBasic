public class InsertSorting {
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.printf("[" + a[i] + "]");
        }
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        int[] a = { 90, 34, 78, 12, 56 };
        int ins, cmp, temp;

        // 정렬 전의 배열 내용을 표시
        System.out.printf("정렬 전의 배열\n");
        printArray(a);
        System.out.printf("\n");

        // 삽입 정렬로 오름차순 정렬
        for(ins = 1; ins < a.length; ins++){
            temp = a[ins];
            for(cmp = ins -1; cmp >= 0; cmp--){
                if(a[cmp] > temp){
                    a[cmp + 1] = a[cmp];
                } else {
                    break;
                }
            }
            a[cmp + 1] = temp;
        }

        // 정렬 후의 배열 내용을 표시
        System.out.printf("정렬 후 배열\n");
        printArray(a);
    }
}
