public class scy26_zy05 {
    public static void main(String[] args) {
        System.out.println("张三2020年薪资收入为 87659，应交税为：" + money(87659));
        System.out.println("张三2020年薪资收入为 87659，应交税为：" + money(169520));
    }

    public static double money(double salary) {
        double result = 0;
        if (salary <= 60000) {
            return 0;
        } else if (salary > 60000 && salary <= 96000) {
            result = (salary - 60000) * 0.03;
        } else if (salary > 96000 && salary <= 204000) {
            result = (salary - 60000) * 0.1;
        }
        return result;
    }

}
