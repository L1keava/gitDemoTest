import java.util.Scanner;

public class scy26_zy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4, t;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        if (num1 > num2) {
            t = num1;num1 = num2;num2 = t;
        }
        if (num1 > num3){
            t=num1;num1 = num3;num3 = t;
        }
        if (num1 > num4){
            t=num1;num1=num4;num4=t;
        }
        if (num2 > num3) {
            t = num2;num2 = num3;num3 = t;
        }
        if (num2 > num4){
            t=num2;num2 = num4;num4 = t;
        }
        if (num3 > num4) {
            t = num3;num3 = num4;num4 = t;
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);


    }

}

