public class answer10 {
    public static void main (String[] args){
        //已知三个整数分别是2、6、-2，编程找出三个数的最小数和最大数。
        int num1,num2,num3,max,min;
        num1 = 2;
        num2 = 6;
        num3 = -2;
        max = getMax(num1,num2,num3);
        min = getmin(num1,num2,num3);
        System.out.println("最大数是："+ max + "最小数是：" + min);


    }
    public static int getMax(int n1,int n2,int n3){
        int result;
        result = Math.max(Math.max(n1,n2),n3);
        return result;
    }
    public static int getmin(int n1,int n2,int n3){
        int result;
        result = Math.min(Math.min(n1,n2),n3);
        return result;
    }
}
