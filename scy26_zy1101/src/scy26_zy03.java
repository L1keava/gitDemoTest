import java.util.Scanner;

public class scy26_zy03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("请输入10个数字：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("\n数组元素和为：" + sum);
    }
}
