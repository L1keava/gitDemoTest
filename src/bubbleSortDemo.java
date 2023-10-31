import java.util.Random;

public class bubbleSortDemo {
    public static void main(String[] args) {
        //冒泡排序 降序
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = random.nextInt(100);
        }
        System.out.println("排序前的数：");
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i - 1] + " ");
        }
        System.out.println();
        System.out.println("排序后的数：");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i - 1] + " ");
        }
    }
}
