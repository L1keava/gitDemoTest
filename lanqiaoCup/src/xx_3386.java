import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class xx_3386 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        param[] paramArr = new param[61234];
        String input = scan.nextLine();
        if (input.startsWith("PUT")) {
            //PUT MODE
            String mode = "PUT", msgName;
            int msg, prior;
            input = input.replace("PUT ", "");
            msgName = input.substring(0, input.indexOf(" "));
            input = input.replace(msgName + " ", "");
            msg = Integer.parseInt(input.substring(0, input.indexOf(" ")));
            input = input.replace(msg + " ", "");
            prior = Integer.parseInt(input);
            paramArr[0] = new param(mode, msgName, msg, prior);
            System.out.println(paramArr[0]);
        } else if (input.startsWith("GET")) {
            //GET MODE


        }
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
    }

    @Override
    public String toString() {
        return "模式：" + mode + "\n消息名称：" + msgName + "\n消息内容：" + msg + "\n消息队列：" + priority;
    }
}