public class globalVarDemo {
    static int a, b;

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4};
        changeArr(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }
        a = 3;
        b = 4;
        changeVar();
        System.out.println();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void changeVar() {
        a = a + 3;
        b = b + 1;
    }

    public static void changeArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i]++;
        }
    }
}
