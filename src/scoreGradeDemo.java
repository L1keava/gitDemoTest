import java.util.Scanner;
public class scoreGradeDemo {
    public static void main(String[] args){
        float score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：（0-100）");
        score = scanner.nextFloat();
        //解法1 ： if结构法
        if (score >= 90){
            System.out.println("优");
        } else if (score>= 80) {
            System.out.println("良");
        } else if (score >= 70) {
            System.out.println("中");
        } else if (score >= 60) {
            System.out.println("及格");
        }else{
            System.out.println("不及格！继续努力");
        }

        //解法2： switch分支法
        switch ((int)score/10){
            case 10:
                System.out.println("满分！");
                break;
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }
}
