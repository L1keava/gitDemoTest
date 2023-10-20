public class scy26_zy20 {
    public static void main(String[] args) {
        int num, ge, shi, bai;
        for (num = 100; num <= 999; num++) {
            ge = num % 10;
            shi = num / 10 % 10;
            bai = num / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == num) {
                System.out.println(num + "是水仙花数");
            }
        }
    }
}