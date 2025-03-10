package Test;
import com.dev.scy.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import java.io.IOException;
import java.io.Reader;
import java.util.List;


public class CustomerTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    
    @Before
    public void initialize(){
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlMapper.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void findByNameAndJobs(){
        Customer find_conditions = new Customer();
        find_conditions.setUsername("jack");
        find_conditions.setJobs("teacher");
        List<Customer> result = sqlSession.selectList("mapper.CustomerMap.findByNameAndJobs",find_conditions);
        System.out.println("根据姓名和职业查找：");
        for (Customer customer : result){
            System.out.println(customer);   
        }
        findByNameOrJobs();
    }
    public void findByNameOrJobs(){
        Customer find_conditions = new Customer();
        find_conditions.setUsername("tom");
        find_conditions.setJobs("teacher");
        List<Customer> result = sqlSession.selectList("mapper.CustomerMap.findByNameOrJobs",find_conditions);
        System.out.println("根据姓名或职业查找：");
        for (Customer customer : result){
            System.out.println(customer);
        }
        findByWhere();
    }
    public void findByWhere(){
        Customer find_conditions = new Customer();
        find_conditions.setUsername("jack");
        find_conditions.setJobs("teacher");
        List<Customer> result = sqlSession.selectList("mapper.CustomerMap.findByWhere",find_conditions);
        System.out.println("使用Where标签查找：");
        for (Customer customer : result){
            System.out.println(customer);
        }
        findByTrim();
    }
    public void findByTrim(){
        Customer find_conditions = new Customer();
        find_conditions.setUsername("tom");
        find_conditions.setJobs("worker");
        List<Customer> result = sqlSession.selectList("mapper.CustomerMap.findByWhere",find_conditions);
        System.out.println("使用Trim查找：");
        for (Customer customer : result){
            System.out.println(customer);
        }
        updateBySet();
    }
    public void updateBySet(){
        Customer update = new Customer();
        update.setId(3);
        update.setPhone("155555555555");
        int rows = sqlSession.update("mapper.CustomerMap.updateBySet",update);
        if (rows > 0){
            System.out.println("修改了" + rows + "条数据。");
        }else {
            System.out.println("0条记录被修改。");
        }
    }
    @After
    public void destroy(){
        sqlSession.commit();
        sqlSession.close();
    }
}
