import java.util.Scanner;
public class narcissisticNum {
    public static void main(String[] args){
        int num,g,s,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数字：");
        num = scanner.nextInt(); //水仙数 153
        if (num <1000 && num >= 100 ){
            g=num%10;s=(num/10)%10;b=num/100;
            if (g*g*g+s*s*s+b*b*b == num){
                System.out.println(num + "是水仙花数");
            }else{
                System.out.println(num + "不是水仙花数");
            }
        }else{
            System.out.println("输入错误，请输入三位数字。");
        }
    }

}
