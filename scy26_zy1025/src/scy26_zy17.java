public class scy26_zy17 {
    public static void main(String[] args) {
        int var = -1;
        for (int round = 1; round <= 4; round++) {
            prtSpace(4 - round);
            System.out.print("*");
            if (round != 1) {
                prtSpace(var);
                System.out.print("*");
            }
            System.out.println();
            var += 2;
        }
        var = 3;
        for (int round = 3; round > 0; round--) {
            prtSpace(4 - round);
            System.out.print("*");
            if (round != 1) {
                prtSpace(var);
                System.out.print("*");
            }
            System.out.println();
            var -= 2;
        }
    }

    public static void prtSpace(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print(" ");
        }
    }
}