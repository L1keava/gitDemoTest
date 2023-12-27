import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class xx_3386 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        param[] paramArr = new param[999];
        String input = scan.next();
        if (input.startsWith("PUT")){
            //PUT MODE
            String mode,msgName,msg;
            int prior;
            System.out.println("此时的input内容为：" + input);
            input = input.replace("PUT ","");

            mode = "PUT";
            msgName = input.substring(0,input.indexOf(" ")+1);
            input = input.replace(msgName+" ","");
            msg = input.substring(0,input.indexOf(" ")+1);

            prior = Integer.valueOf(input.replace(msg+" ",""));
            paramArr[0] = new param(mode,msgName,msg,prior);
            System.out.println(paramArr[0].toString());
        }else if (input.startsWith("GET")){
            //GET MODE


        }
        scan.close();
    }
}
class param{
    String mode;
    String msgName;
    String msg;
    int priority;
    public param(String mode,String msgName,String msg,int priority){
        this.mode = mode;
        this.msgName = msgName;
        this.msg = msg;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "模式：" + mode +"消息名称：" + msgName +"消息内容：" + msg +"消息队列：" + priority;
    }
}