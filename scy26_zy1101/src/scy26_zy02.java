import java.util.Scanner;

public class scy26_zy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("请输入10个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int r = 0; r < array.length; r++) {
            for (int i = r; i < array.length; i++) {
                if (array[r] > array[i]) {
                    int temp = array[i];
                    array[i] = array[r];
                    array[r] = temp;
                }
            }
            System.out.print(array[r] + " ");
        }
    }
}
