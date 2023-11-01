import java.util.Scanner;

public class scy26_zy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int loser = 0;
        System.out.println("请输入10个成绩：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 60) {
                loser++;
            }
        }
        System.out.println("不及格人数为：" + loser);
    }
}
