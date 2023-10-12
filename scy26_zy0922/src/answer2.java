public class answer2 {
    public static void main (String[] args){
        //已知圆的半径为4，编程实现圆的周长和面积。
        double radius,perimeter,square;
        radius = 4;
        perimeter = Math.PI *(radius * 2) ; //周长=圆周率 * 直径
        square = Math.PI * (radius * radius); //面积 = 圆周率 * 半径的平方
        System.out.println("已知圆的半径为4");
        System.out.println("周长为：" + perimeter);
        System.out.print("面积为：" + square);
    }
}
