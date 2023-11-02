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
        for (int r = 0; r < arr.length; r++) {
            for (int j = 0; j < arr.length - 1-r; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i - 1] + " ");
        }
    }
}
