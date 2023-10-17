public class primeNumberDemo {
    public static void main(String[] args){
        for (int i = 2 ; i <= 200;i++){
            if (isPrime(i)){
                System.out.println(i + "是素数");
            }
        }
    }
    public static boolean isPrime(int num){
        /*当num只能被1和其本身整除时，num为素数
        因此 此处循环条件判断时不能有1和其本身
        如果被1和其本身除外的数整除了
        此数不为素数 因此返回false
        */
        for (int i = 2;i<=num-1;i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
