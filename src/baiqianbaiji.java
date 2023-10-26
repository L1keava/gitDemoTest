public class baiqianbaiji {
    public static void main(String[] args) {
        //公鸡5文钱一只，母鸡3文钱一只，小鸡1文钱三只，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。
        //凭记忆重做的 忘记了公鸡0只的情况...
        int xjnum, gjnum, mjnum;
        for (gjnum = 0; gjnum <= 20; gjnum++) {
            for (mjnum = 1; mjnum <= 34; mjnum++) {
                xjnum = (100 - (gjnum * 5) - (mjnum * 3)) * 3;
                if (xjnum + gjnum + mjnum == 100) {
                    System.out.println("小鸡：" + xjnum + "公鸡：" + gjnum + "母鸡：" + mjnum);
                }
            }
        }
    }
}
