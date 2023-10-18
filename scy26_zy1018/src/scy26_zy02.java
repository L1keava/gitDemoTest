import java.util.Scanner;
public class scy26_zy02 {
    public static void main(String[] args){
        int num1,num2,num3,num4,max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入四个整数：");
        num1 = scanner.nextInt();
        num2 =  scanner.nextInt();
        num3 = scanner.nextInt();
        num4 =  scanner.nextInt();
        max = getMax(getMax(num1,num2),getMax(num3,num4));
        System.out.println("最大数是：" + max);
    }
    public static int getMax(int num1,int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }
}
