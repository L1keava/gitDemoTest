import java.util.Scanner;

public class scy26_zy10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个整数：");
        int[] array = new int[10];
        int index;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("请输入要查找的整数：");
        int target = scanner.nextInt();
        for (index = 0; index < array.length; index++) {
            if (target == array[index]) {
                System.out.println("此数在数组中的下标为" + index);
                break;
            }
        }
        if (index == 10) {
            System.out.println("查找失败");
        }
    }
}
