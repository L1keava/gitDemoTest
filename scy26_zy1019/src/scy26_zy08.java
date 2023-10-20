public class scy26_zy08 {
    public static void main(String[] args) {
        int num = 100, ge, shi, bai;
        while (num <= 999) {
            ge = num % 10;
            shi = num / 10 % 10;
            bai = num / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == num) {
                System.out.println(num + " 是水仙花数");
            }
            num++;
        }
    }
}