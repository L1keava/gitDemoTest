import java.math.BigInteger;
//阶乘测试
public class factorialDemo {
    public static void main(String[] args) {
        System.out.println(factorial(45));
    }
    public static BigInteger factorial(long times){
        long i = 0;
        BigInteger bigNum = new BigInteger("1");
        while (i < times){
            i = i + 1;
            bigNum= bigNum.multiply(BigInteger.valueOf(i));
        }
        return bigNum;
    }
}