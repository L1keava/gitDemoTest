import java.util.Random;

public class arraySortDemo {
    public static void main(String[] args) {
        //随机生成7个数 并且按照升序排序
        int[] num = new int[7];
        Random random = new Random();
        for (int i = 0; i <= num.length - 1; i++) {
            num[i] = random.nextInt(30);
        }
        System.out.print("排序前：");
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.print(num[i] + "   ");
        }
        for (int r = 0; r <= num.length - 1; r++) {
            for (int i = r; i <= num.length - 1; i++) {
                if (num[r] > num[i]) {
                    int t = num[r];
                    num[r] = num[i];
                    num[i] = t;
                }
            }
        }
        System.out.println();
        System.out.print("排序后：");
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.print(num[i] + "   ");
        }
    }

}

