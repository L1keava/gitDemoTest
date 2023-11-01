import java.util.Scanner;

public class scy26_zy05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int index = 0, max = array[0];
        System.out.println("请输入10个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                index = i;
                max = array[i];
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\n最大数是：" + max + "下标为：" + index);
    }
}
