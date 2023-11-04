import java.util.Scanner;

public class scy26_zy01 {
    static Scanner scanner = new Scanner(System.in);
    public static String[] arg = new String[1];
    public static double[] scy_score = new double[10];
    public static boolean found = false;

    public static void main(String[] args) {
        double target;

        System.out.println("""
                数组应用Demo 功能如下\s
                 1、成绩录入           2、成绩输出       3、计算总成绩和平均成绩\s
                 4、输出最高分和最低分   5、查询输入的成绩  6、删除输入的成绩
                 7、成绩降序排序""");
        System.out.println("请输入你的选择：");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                //成绩录入
                arrayInput(scy_score);
                main(arg);
                break;
            case 2:
                //成绩输出
                printArray(scy_score, scy_score.length);
                main(arg);
                break;
            case 3:
                //计算总成绩和平均成绩
                arraySumAvg(scy_score);
                main(arg);
                break;
            case 4:
                //输出最高分和最低分
                arrayMaxMin(scy_score);
                main(arg);
                break;
            case 5:
                //查询输入的成绩
                System.out.println("请输入要查询的成绩");
                target = scanner.nextDouble();
                searchForIndex(scy_score, target);
                main(arg);
                break;
            case 6:
                //删除输入的成绩
                System.out.println("请输入你要删除的数：");
                target = scanner.nextDouble();
                arrayRemove(scy_score, target);
                main(arg);
                break;
            case 7:
                //成绩降序排序
                sortByDescending(scy_score);
                main(arg);
                break;
            default:
                System.out.println("错误选项，请正确输入！");
                main(arg);
        }
    }

    public static void arrayInput(double[] array) {
        //数组输入
        System.out.println("请输入10个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.println("输入完成！");
        printArray(array, array.length);
    }

    public static void sortByDescending(double[] array) {
        //数组选择排序降序
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("降序排序完成：结果为：");
        printArray(array, array.length);
    }

    public static void printArray(double[] array, int index) {
        //输出数组
        System.out.println();
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static double arraySum(double[] array) {
        //数组元素求和
        double sum = 0;
        for (double j : array) {
            sum += j;
        }
        return sum;
    }

    public static void arraySumAvg(double[] array) {
        //数组元素求平均值
        System.out.println("总分为：" + arraySum(array) + "\n平均分为：" + arraySum(array) / array.length);
    }

    public static void arrayRemove(double[] array, double target) {
        //数组删除元素
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                printArray(array, array.length - 1);
                break;
            }
        }
        if (!found) {
            System.out.println("未找到 " + target);
        }
    }

    public static void arrayMaxMin(double[] array) {
        double[] copy = new double[10];
        System.arraycopy(array, 0, copy, 0, array.length);
        sortByDescending(copy);
        double max = copy[0];
        double min = copy[array.length - 1];
        System.out.println("最高分为：" + max + "\n最低分为：" + min);
    }

    public static void searchForIndex(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                System.out.println("你要查询的数在数组中位于第 " + (i + 1) + " 个元素\n它的下标为 " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("未找到" + target);
        }
    }
}
