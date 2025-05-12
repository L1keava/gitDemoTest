package Test;

import com.scy.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeleteAccount {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        int num = accountDao.deleteAccount(1);
        if (num > 0) {
            System.out.println("成功删除了" + num + "条数据");
        } else {
            System.out.println("删除失败");
        }
    }
}
