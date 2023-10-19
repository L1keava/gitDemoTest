public class primeNumControl {
    public static void main(String[] args) {
        //10到100所有质数
        int num = 0;
        while (num <= 100) {
            if (isPrime(num)) {
                System.out.println(num + "是素数");
            }
            num++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
