import java.util.Random;
import java.util.Scanner;

public class prosArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组元素个数：");
        int s = scanner.nextInt();
        int[] num = new int[s];
        Random random = new Random();
        for (int i = 0; i < s; i++) {
            num[i] = random.nextInt(100);
        }
        System.out.println("生成的数组内容为：");
        for (int i = 0; i < s; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("排序后的数组内容为：");
        sortArray(num);
        for (int i = 0; i < s; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void sortArray(int[] num) {
        int arrayLength = num.length;
        for (int r = 0; r < arrayLength; r++) {
            for (int i = r + 1; i < arrayLength; i++) {
                if (num[r] < num[i]) {
                    int temp = num[r];
                    num[r] = num[i];
                    num[i] = temp;
                }
            }
        }
    }
}
