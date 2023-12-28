import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
class count{
    static int params = 0;
}
public class xx_3386 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        param[] paramArr = new param[6];
        String input = scan.nextLine() ;
        do {

                if (input.startsWith("PUT")) {
                    //PUT MODE
//                    System.out.println("进入PUT模式：");
                    String mode = "PUT", msgName;
                    int msg, prior;
                    input = input.replace("PUT ", "");
                    msgName = input.substring(0, input.indexOf(" "));
                    input = input.replace(msgName + " ", "");
                    msg = Integer.parseInt(input.substring(0, input.indexOf(" ")));
                    input = input.replace(msg + " ", "");
                    prior = Integer.parseInt(input);
                    paramArr[count.params] = new param(mode, msgName, msg, prior);
//                    System.out.println(paramArr[0]);
                } else if (input.startsWith("GET")) {
                    //GET MODE
//                    System.out.println("进入GET模式：");
                    if (count.params == 0) {
                        System.out.println("EMPTY QUEUE!");
                    } else {
//                        System.out.println("现在的params是：" + count.params);
                        System.out.println(paramArr[count.params-1]);
                        count.params--;
                    }
                }
            }while (input.startsWith("GET")|input.startsWith("PUT"));
        scan.close();
    }
}

class param {
    String mode;
    String msgName;
    int msg;
    int priority;

    public param(String mode, String msgName, int msg, int priority) {
        this.mode = mode;
        this.msgName = msgName;
        this.msg = msg;
        this.priority = priority;
        count.params++;
    }

    @Override
    public String toString() {
        return msgName +" " + msg;
    }
}