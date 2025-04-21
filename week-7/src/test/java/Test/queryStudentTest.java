package Test;

import com.dev.dao.StudentMapper;
import com.dev.scy.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class queryStudentTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void initialize() {
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
    public void selectStudentByIdTest() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println("查询指定id的学生：");
        Student student = mapper.queryStudent(1);
        System.out.println(student);
        System.out.println("一对多查询：");
        Student student1 = mapper.selectStudentById(1);
        System.out.println(student1.toString());
    }

    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
    }

}
