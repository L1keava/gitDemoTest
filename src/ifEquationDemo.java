import java.util.Scanner;
public class ifEquationDemo {
    /*
    试用if计算此方程
    b=2*a+1 (a>0)
    b=2*a-1 (a<0)
    b=2*a   (a=0)
     */
    public static void main(String[] args){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个未知数：");
        a = scanner.nextInt();
        if (a>=0){
            if (a>0){
                b=2*a+1;
            }else {
                b=2*a;
            }
        }else {
            b=2*a-1;
        }
        System.out.println("运算后的b为：" + b);
    }
}
