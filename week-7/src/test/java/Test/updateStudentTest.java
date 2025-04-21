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

public class updateStudentTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void initialize() {
        String resources = "mybatis-config.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resources);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlMapper.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateStudentTest() {
        Student student = new Student();
        student.setId(4);
        student.setName("李雷");
        student.setAge(21);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int result = mapper.updateStudent(student);
        System.out.println("修改指定id的数据：");
        if (result > 0) {
            System.out.println("成功更新" + result + "条数据");
        } else {
            System.out.println("更新数据失败");
        }
        System.out.println(student);
    }

    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
    }
}
