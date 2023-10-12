
public class answer5 {
    public static void main (String[] args){
        // 编程实现：某学生三门课成绩分别是86.5,75.5和90分，计算平均成绩并输出；
        double score1=86.5; //成绩赋值
        double score2=75.5;
        double score3=90;
        System.out.println("平均成绩为："+getAverage(score1,score2,score3));
    }

    public static double getAverage(double n1, double n2, double n3){
        double result;
        result = (n1+n2+n3) / 3;
        return (int) result;
    }
}
