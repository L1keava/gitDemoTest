public class answer8 {
    public static void main (String[] args){
        //输出学生成绩信息
        String  str1 = "石长壹",str2 = "云计算2302",str3 = "男";
        double num1 = 87,num2 = 87,num3 = 85.5,num4 = 89,average,maxNum,minNum;
        boolean scholarShip=false,exam=false;
        average = getAverage(num1,num2,num3,num4);
        maxNum = getMax(num1,num2,num3,num4);
        minNum = getMin(num1,num2,num3,num4);
        double[] score = {87,87,85.5,89};
        for (int i=0; i<=3; ++i){
            if (score[i] < 60){ //如果有任意一科成绩低于60，则需要补考
                exam = true;
            }
        }
        for (int i=0; i<=3; ++i) {
            if (score[i] > 80) {
                scholarShip = true;
            } else {
                scholarShip = false; //如果有任意一科成绩低于80，则取消奖学金评定资格
            }
        }
        System.out.println("姓名    班级       性别   ps   Java  英语   体育   平均分 最高分  最低分  奖学金  补考");
        System.out.println(str1+"  " + str2+"  " + str3 + "    "+ num1 + "  "+num2 + "  " + num3
                + "  " + num4 + "  "+average + "  " +maxNum + "  " + minNum + "   " + scholarShip
                + "  " + exam);
    }

    public static double getAverage(double n1, double n2, double n3,double n4){
        double result;
        result = (n1+n2+n3+n4) / 4;
        return (int) result;
    }

    public static double getMax(double n1,double n2,double n3,double n4){
        //取最大值
        if(Math.max(n1,n2) > Math.max(n3,n4)){
            return  Math.max(n1,n2);
        }else{
            return Math.max(n3,n4);
        }
    }

    public static double getMin(double n1, double n2,double n3 ,double n4){
        //取最小值
        if (Math.min(n1,n2)< Math.min(n3,n4)){
            return  Math.min(n1,n2);
        }else {
            return Math.min(n3,n4);
        }
    }
}
