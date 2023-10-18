import java.util.Scanner;
public class scy26_zy05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x,y;
        x = scanner.nextInt();
        if (x>0){
            y=3*x+5;
        } else{
            if (x==0) {
                y=3*x;
            }else {
                y=3*x-5;
            }
        }
        System.out.println(y);
    }
}
