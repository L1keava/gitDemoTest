public class scy26_zy16 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int a = 1; a <= 4 - i; a++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= num; a++) {
                System.out.print("*");
            }
            System.out.println();
            num += 2;
        }
    }
}