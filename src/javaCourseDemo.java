public class javaCourseDemo {
    public static void main(String[] args) {
//        float score;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入学生的成绩（100分制）：");
//        score = scanner.nextFloat();
//        if (score == 100){
//            System.out.println("满分");
//        } else if (score > 100) {
//            System.out.println("错误成绩！请重新输入");
//        } else if (score > 85) {
//            System.out.println("优秀");
//        } else if (score >= 60) {
//            System.out.println("及格");
//        } else if (score < 60) {
//            System.out.println("未及格，继续努力。");
//        }else {
//            System.out.println("输入异常！");
//        }

//        for (int i = 1;i <=10;++i){
//            System.out.println("书恒走的第 "+ i + " 天，想他");
//        }
//        int a  = 0;
//        while (a < 10){
//            a++;
//            System.out.println("书恒走的第 "+ a + " 天，想他");
//        }

        //逢七过
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
