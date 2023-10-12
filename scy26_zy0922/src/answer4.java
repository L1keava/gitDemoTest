
public class answer4 {
    public static void main(String[] args){
        //编写程序，将5829中的千位、百位、十位、个位分别拆出并输出。
        String inputStr = "5829";
        int strLength;
        strLength = inputStr.length(); //取数值位数
        String[] num = new String[strLength + 1];
        for (int i = strLength ;i > 0;--i)
        {
            num[i] = inputStr.substring(i-1,i);
        }
        for (int t = 1; t <=strLength;++t)
        {
            System.out.println("第"+t+"位数字"+num[t]);
        }
    }
}
