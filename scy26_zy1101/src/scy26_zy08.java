import java.util.Scanner;

public class scy26_zy08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("请输入10个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("请输入要删除的整数：");
        int target = scanner.nextInt();
        for (int i = 1; i < array.length; i++) {
            if (array[i] == target) {
                for (int index = i; index < array.length - 1; index++) {
                    array[i] = array[i + 1];
                }
                break;
            }
        }
        System.out.println("删除后的数组元素为：");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
