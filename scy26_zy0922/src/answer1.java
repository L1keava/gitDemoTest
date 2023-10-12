public class answer1 {
    public static void main(String[] args){
        //已知长方形的长、宽分别是2.5和4.3，编程实现长方形的的周长和面积。
        double rectangleLength,rectangleWidth,perimeter,square;
        rectangleLength = 2.5;
        rectangleWidth = 4.3;
        perimeter = (rectangleLength+rectangleWidth) *2; //周长=(长 + 宽) * 2
        square =  rectangleLength * rectangleWidth; //面积 = 长 * 宽
        System.out.println("已知长方形的长、宽分别是2.5和4.3");
        System.out.println("周长为：" + perimeter);
        System.out.print("面积为：" + square);
    }
}
