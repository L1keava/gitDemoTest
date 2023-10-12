/**
@author Yi
 */
public class hundredMoney {
    public static void main(String[] args) {
        //公鸡5文钱一只，母鸡3文钱一只，小鸡1文钱三只，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。
        int gjnum, mjnum, xjnum;
        for (gjnum = 0; gjnum <= 20; gjnum++) {
            for (mjnum = 1; mjnum <= 34; mjnum++) {
                xjnum = 3 * (100 % ((gjnum * 5) + (mjnum * 3)));
                if ((gjnum * 5) + (mjnum * 3) + (xjnum / 3) == 100 & (gjnum + xjnum + mjnum == 100)) {
                    System.out.println("公鸡数量：" + gjnum + "母鸡数量：" + mjnum + "小鸡数量：" + xjnum);
                }
            }
        }
    }
}
