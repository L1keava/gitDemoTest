import java.util.Scanner;

class changfangti{
    protected double length,width,height;
    void setLength(double length){
        this.length = length;
    }
    double getLength(){
        return length;
    }
    void setWidth(double width){
        this.width = width;
    }
    double getWidth(){
        return width;
    }
    void setHeight(double height){
        this.height = height;
    }
    double getHeight(){
        return height;
    }
    double tj(){
        return length*width*height;
    }
    void get(){
        System.out.println("长方体的长：" + getLength() + " 宽：" + getWidth() + " 高：" + getHeight()
         + " 体积：" + tj());
    }
}
public class scy26_zy04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        changfangti cft = new changfangti();
        System.out.println("请输入长方体的 长 宽 高：");
        cft.setLength(scanner.nextDouble());
        cft.setHeight(scanner.nextDouble());
        cft.setWidth(scanner.nextDouble());
        cft.get();
    }
}
