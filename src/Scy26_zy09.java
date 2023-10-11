import java.util.Scanner;
public class Scy26_zy09 {
    public static void main (String[] args) {
        String xm,xb,bj;
        double ps,java,english,pe,max,min,average;
        boolean reward=false,exam=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名 班级 性别（以空格隔开）：");
        xm = scanner.next();
        bj = scanner.next();
        xb = scanner.next();
        System.out.println("请输入PS JAVA 英语 体育 成绩 （以空格隔开）：");
        ps = scanner.nextDouble();
        java=scanner.nextDouble();
        english=scanner.nextDouble();
        pe=scanner.nextDouble();
        average=(ps+java+english+pe)/4;
        max = getMax(getMax(ps,java),getMax(english,pe));
        min = getMin(getMin(ps,java),getMin(english,pe));
        if (ps > 60 && java > 60 && english > 60 && pe > 60){
            reward = true;
        }else {
            exam=true;
        }
        System.out.println("姓名    班级       性别   ps   Java  英语   体育   平均分   最高分  最低分  奖学金  补考");
        System.out.println(xm+"  " + bj+"  " + xb + "    "+ ps + "  "+java + "  " + english
                + "  " + pe + "  "+average + "  " +max + "  " + min + "   " + reward
                + "  " + exam);
    }
    public static double getMax(double num1,double num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
    public static double getMin(double num1,double num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
