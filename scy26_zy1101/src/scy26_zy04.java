import java.util.Scanner;

public class scy26_zy04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int target;
        System.out.println("请输入9个从小到大排序的整数：");
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("请输入一个整数：");
        target = scanner.nextInt();
        for (int i = 1; i < array.length - 1; i++) {
            if (target > array[i] && target < array[i + 1]) {
                for (int j = array.length - 1; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[i + 1] = target;
                break;
            } else if (target > array[array.length - 2]) {
                array[array.length - 1] = target;
                break;
            } else if (target < array[0]) {
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = target;
                break;
            }
        }
        System.out.println("插入后的数组元素：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
