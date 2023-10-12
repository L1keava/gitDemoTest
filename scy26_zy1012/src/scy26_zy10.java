public class scy26_zy10 {
    public static void main(String[] args){
        int num1=2,num2=6,num3=-2,max,min,mid;
        min = getMin(getMin(num1,num2),num3);max = getMax(getMax(num1,num2),num3);
        if (num1 > min && num1 < max){
            mid = num1;
        } else if (num2 > min && num2 < max) {
            mid = num2;
        } else{
            mid = num3;
        }
        num1 = min;num2 = mid;num3 = max;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
    public static int getMin(int x,int y){
        if ( x < y){
            return x;
        }else {
            return y;
        }
    }
    public static int getMax(int x,int y){
        if ( x > y){
            return x;
        }else {
            return y;
        }
    }
}
