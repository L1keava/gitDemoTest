public class nineNineDemo {
    public static void main(String[] args) {
        System.out.println("九九乘法表");
        int round = 1;
        while (round <= 9) {
            for (int i = 1; i <= round; i++) {
                System.out.print(i + "*" + round + " = " + round * i + " ");
            }
            round++;
            System.out.println();
        }
    }
}
