import java.util.Scanner;

class bank {
    private String bankName, account, password;
    private double balance;

    public bank(String bankName, String account, String password, double balance) {
        this.bankName = bankName;
        this.account = account;
        this.password = password;
        this.balance = balance;
    }

    void get() {
        System.out.println("银行名称：" + bankName + " 账户名："
                + account + " 账户密码：" + password + " 余额：" + balance);
    }

    void ck(double balance) {
        if (balance > 0) {
            this.balance = this.balance + balance;
            System.out.println("存款成功！当前可用余额为：" + this.balance);
        } else {
            System.out.println("存款金额输入错误");
        }
    }

    void qk(double balance) {
        if (this.balance >= balance) {
            this.balance = this.balance - balance;
            System.out.println("取款成功！当前可用余额为：" + this.balance);
        } else {
            System.out.println("可用余额不足！你当前余额为：" + this.balance);
        }
    }
}

public class scy26_zy08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入银行名称 账户名 账户密码 余额");
        bank bank = new bank(scanner.next(), scanner.next(), scanner.next(), scanner.nextDouble());
        bank.get();
        System.out.println("请输入存款额度：");
        bank.ck(scanner.nextDouble());
        System.out.println("请输入取款额度：");
        bank.qk(scanner.nextDouble());
    }
}
