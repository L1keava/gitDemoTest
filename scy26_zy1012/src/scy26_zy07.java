import java.util.Scanner;
public class scy26_zy07 {
    public static void main(String[] args){
        double mj,a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的三个边：");
        a=scanner.nextInt();b=scanner.nextInt();c=scanner.nextInt();
        if (isTriangle(a,b,c)){
            mj = Math.sqrt((a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
            System.out.println("面积为：" + mj);
        }else {
            System.out.println("不能构成三角形");
        }
    }
    public static boolean isTriangle(double length1,double length2,double length3){
        if (length1+length2 > length3 ){
            return true;
        }else {
            return false;
        }
    }
}
