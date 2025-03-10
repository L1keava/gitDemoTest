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
    public void findCustomerByNameAndJobs(){
        Customer find_conditions = new Customer();
        find_conditions.setUsername("jack");
        find_conditions.setJobs("teacher");
        List<Customer> result = sqlSession.selectList("mapper.CustomerMap.findByNameAndJobs",find_conditions);
        System.out.println("查找客户：");
        for (Customer customer : result){
            System.out.println(customer);   
        }
    }
    @After
    public void destroy(){
        sqlSession.commit();
        sqlSession.close();
    }
}
