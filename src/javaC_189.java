import java.math.BigInteger;
public class javaC_189 {
    public static void main(String[] args){
        BigInteger result = BigInteger.valueOf(0);
        for (long i=1;i<=20230408;i++){
            result = result.add(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
