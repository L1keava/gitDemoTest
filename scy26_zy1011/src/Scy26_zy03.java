import java.util.Scanner;
public class Scy26_zy03 {
    public static void main(String[] args){
        int score1,score2,score3,average;
        System.out.println("请输入三门成绩 用空格隔开：");
        Scanner scanner = new Scanner(System.in);
        score1=scanner.nextInt();
        score2=scanner.nextInt();
        score3=scanner.nextInt();
        average = (score1+score2+score3) / 3;
        System.out.println("平均分是：" + average);

    }
}
