public class answer6 {
    public static void main (String[] args){
        //编写程序，把560分钟换算成用小时和分钟表示，并输出结果。
        int hours,minutes,totalMins;
        totalMins = 560; //在此为需要换算的分钟赋值
        hours = totalMins / 60;
        minutes = Math.floorMod(totalMins,60); //取余数作为剩余的分钟
        System.out.println("换算前："+totalMins+" 分钟");
        System.out.println("换算后："+hours+" 小时 " + minutes + " 分钟");
    }
}
