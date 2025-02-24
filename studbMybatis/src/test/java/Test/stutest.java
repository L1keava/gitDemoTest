package Test;

import com.mybatis.studb.Stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class stutest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    @Before
    public void init() {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlMapper.openSession();
        } catch (IOException e) {e.printStackTrace();}
        
    }
    @Test
    public void findAllStudentTest() {
        List<Stu> list = sqlSession.selectList("com.mybatis.mapper.StuResultMap.findAllStudent");
        for (Stu stu : list){
            System.out.println(stu);
        }
    }
    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
    }
    
}
