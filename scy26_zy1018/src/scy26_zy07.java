import java.util.Scanner;
public class scy26_zy07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score >=0 && score <=100){
            switch ((int)(score/10)){
                case 10, 9:
                    System.out.println("等级A");break;
                case 8:
                    System.out.println("等级B");break;
                case 7:
                    System.out.println("等级C");break;
                case 6:
                    System.out.println("等级D");break;
                default:
                    System.out.println("不及格！");
            }
        }else {
            System.out.println("成绩输入错误！");
        }
    }
}
