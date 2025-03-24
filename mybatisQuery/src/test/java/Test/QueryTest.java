package Test;
import com.dev.scy.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class QueryTest {
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
    public void findByName(){
        Student find_conditions = new Student();
        find_conditions.setName("小");
        List<Student> result = sqlSession.selectList("mapper.StudentMap.findByName",find_conditions);
        System.out.println("根据姓名模糊查找：");
        for (Student student : result){
            System.out.println(student);
        }
        findByZy();
    }
    public void findByZy(){
        Student find_conditions = new Student();
        find_conditions.setName("");
        find_conditions.setStuzy("C");
        List<Student> result = sqlSession.selectList("mapper.StudentMap.findByZy",find_conditions);
        System.out.println("根据专业查找：");
        for (Student student : result){
            System.out.println(student);
        }
        findByPhone();
    }
    public void findByPhone(){
        Student find_conditions = new Student();
        find_conditions.setName("");
        find_conditions.setStuzy("");
        find_conditions.setPhone("12321");
        List<Student> result = sqlSession.selectList("mapper.StudentMap.findByPhone",find_conditions);
        System.out.println("根据手机号查找：");
        for (Student student : result){
            System.out.println(student);
        }
        findByLt();
    }
    public void findByLt(){
        Student find_conditions = new Student();
        find_conditions.setId(5);
        List<Student> result = sqlSession.selectList("mapper.StudentMap.findByLt",find_conditions);
        System.out.println("查找id小于5：");
        for (Student student : result){
            System.out.println(student);
        }
        findById();
    }
    public void findById(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.addAll(Arrays.asList(3, 4, 5));
        List<Student> students = sqlSession.selectList("mapper.StudentMap.findById", ids);
        System.out.println("根据条件查询：");
        if (students != null && !students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("没有找到符合条件的学生。");
        }
    }
    
    @After
    public void destroy(){
        sqlSession.commit();
        sqlSession.close();
    }
}
