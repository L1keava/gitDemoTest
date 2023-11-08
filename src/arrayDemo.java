import java.util.Random;
import java.util.Scanner;

public class arrayDemo {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static String[] arg = new String[1];
    public static int[] array = new int[10];
    public static int[] array2 = new int[10];
    public static int[] insArray = new int[11];
    public static int target;

    public static void main(String[] args) {

        System.out.println("""
                数组应用Demo 功能如下\s
                 1、为数组生成随机数  2、为数组输入数值    3、数组冒泡排序\s
                 4、数组选择排序     5、输出数组         6、数组元素求和
                 7、数组元素求平均值  8、数组删除元素     9、数组插入元素
                 10、数组颠倒输出    11、数组复制元素    12、结束程序""");
        System.out.println("请输入你的选择：");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("请输入随机数最大值；");
                int bounds = scanner.nextInt();
                arrayGenRandom(array, bounds);
                break;
            case 2:
                arrayInput(array);
                break;
            case 3:
                bubbleSort(array);
                break;
            case 4:
                selectionSort(array);
                break;
            case 5:
                printArray(array);
                break;
            case 6:
                System.out.println("数组元素和为：" + arraySum(array));
                break;
            case 7:
                System.out.println("数组元素平均值为：" + arrayAvg(array));
                break;
            case 8:
                System.out.println("请输入想要删除的数：");
                target = scanner.nextInt();
                arrayRemove(array, target);
                break;
            case 9:
                arrayInsert(array);
                break;
            case 10:
                arrayReverse(array);
                break;
            case 11:
                arrayCopy(array, array2);
                break;
            case 12:
                end();
                break;
            default:
                System.out.println("错误选项，请正确输入！");
                main(arg);
        }
    }

    public static void arrayGenRandom(int[] array, int bounds) {
        //数组元素生成随机数
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bounds);
        }
        System.out.println("成功生成随机数！");
        main(arg);
    }

    public static void arrayInput(int[] array) {
        //数组输入
        System.out.println("请输入10个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("输入完成！");
        main(arg);
    }

    public static void bubbleSort(int[] array) {
        //数组冒泡排序
        System.out.println("请选择排序方式： \n 1、升序\n 2、降序");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length - 1 - i; j++) {
                        if (array[j] > array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length - 1 - i; j++) {
                        if (array[j] < array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                break;
        }
        printArray(array);
        main(arg);
    }

    public static void selectionSort(int[] array) {
        //数组选择排序
        System.out.println("请选择排序方式： \n 1、升序\n 2、降序");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    for (int j = i; j < array.length; j++) {
                        if (array[i] > array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < array.length; i++) {
                    for (int j = i; j < array.length; j++) {
                        if (array[i] < array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
                break;
        }
        printArray(array);
        main(arg);
    }

    public static void printArray(int[] array) {
        //输出数组
        for (int j : array) {
            System.out.print(j + "  ");
        }
        System.out.println();
        main(arg);
    }

    public static int arraySum(int[] array) {
        //数组元素求和
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static double arrayAvg(int[] array) {
        //数组元素求平均值
        return (double) arraySum(array) / array.length;
    }

    public static void arrayRemove(int[] array, int target) {
        //数组删除元素
        for (int i  = 0;i<array.length;i++){
            if (array[i] == target){
                for (int j = i;j<array.length-1;j++){
                    array[i] = array[j];
                }
            }
        }
        System.out.println("删除完成。");
        printArray(array);
    }

    public static void arrayInsert(int[] array) {
        //数组插入元素
    }

    public static void arrayReverse(int[] array) {
        //数组颠倒输出
    }

    public static void arrayCopy(int[] origin, int[] copy) {
        //数组复制元素
        System.arraycopy(origin, 0, copy, 0, array.length);
        /*
        也可以是：
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
         */
        System.out.println("已复制到array2:");
        printArray(array2);
    }

    public static void end() {
        System.out.println("程序即将退出。");
    }
}
