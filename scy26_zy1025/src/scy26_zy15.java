public class scy26_zy15 {
    public static void main(String[] args) {
        for (int round = 1; round <= 9; round++) {
            for (int i = 1; i <= round; i++) {
                System.out.print(i + " * " + round + " = " + round * i + " ");
            }
            System.out.println();
        }
    }
}