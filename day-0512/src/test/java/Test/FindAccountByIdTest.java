package Test;

import com.scy.Account;
import com.scy.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FindAccountByIdTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        List<Account> accounts = accountDao.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }
}
