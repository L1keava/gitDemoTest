public class answer3 {
    public static void main (String[] args){
        //编程实现输入两个整数3,5分别送入，a,b变量中，交换a,b变量的值交换，并输出a,b的值。
        int a,b,temp;
        a=3;
        b=5;
        temp=b; //利用中间变量temp进行交换
        b=a;
        a=temp;
        System.out.println("交换后的a:"+a);
        System.out.println("交换后的b:"+b);
    }
}
