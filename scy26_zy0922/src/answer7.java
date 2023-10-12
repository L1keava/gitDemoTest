public class answer7 {
    public static void main (String[] args){
        //已知三角形的三边长a,b,c都是4，编程实现三角形的的周长和面积。
        int a,b,c,s;
        a=4;
        b=4;
        c=4;
        System.out.println("三角形的周长为："+perimeter(a,b,c));
        System.out.println("三角形的面积为："+ area(a,b,c));
    }
    public static int perimeter(double lenth1, double lenth2, double lenth3){
        //计算周长
        double result;
        result = lenth1+lenth2+lenth3;
        return (int) result;
    }

    public static double area(double a,double b,double c){
        //计算面积
        double s = (a+b+c)/2;
        double result;
        result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return result;
    }
}
