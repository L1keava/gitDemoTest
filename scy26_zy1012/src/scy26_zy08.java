import java.util.Scanner;

public class scy26_zy08 {
    public static void main(String[] args){
        int num1,num2,num3,max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数字：");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        max = getMax(getMax(num1,num2),num3);
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
