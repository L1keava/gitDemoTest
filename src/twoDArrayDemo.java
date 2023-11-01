public class twoDArrayDemo {
    public static void main(String[] args) {
        int[][] arr1 = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[1].length; j++) {
                System.out.print("num[" + i + "][" + j + "] = " + arr1[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr2 = new int[4][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[1].length; j++) {
                arr2[i][j] = arr1[j][i];
            }
        }
        System.out.println("数组每行最大值为：");
        arrMax(arr1);
        System.out.println("数组每列最大值为：");
        arrMax(arr2);
    }

    public static void arrMax(int[][] num) {
        int[] max = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            max[i] = num[i][0];
            for (int j = 0; j < num[1].length; j++) {
                if (num[i][j] > max[i]) {
                    max[i] = num[i][j];
                }
            }
            System.out.print(max[i] + " ");
        }
        System.out.println();
    }
}
