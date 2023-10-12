import java.util.Scanner;

public class scy26_zy09 {
    public static void main(String[] args){
        int num1,num2,num3,num4,max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数字：");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        max = getMax(getMax(num1,num2),getMax(num3,num4));
        System.out.println(max);
    }
    public static int getMax(int x,int y){
        if ( x > y){
            return x;
        }else {
            return y;
        }
    }
}
