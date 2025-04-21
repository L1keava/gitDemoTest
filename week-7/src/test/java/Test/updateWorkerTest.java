package Test;

import com.dev.dao.WorkerMapper;
import com.dev.scy.Worker;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class updateWorkerTest {
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
    public void updateWorker() {
        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("李华");
        worker.setAge(28);
        WorkerMapper mapper = sqlSession.getMapper(WorkerMapper.class);
        int result = mapper.updateWorker(worker);
        if (result >= 0) {
            System.out.println("成功更新" + result + "条数据");
        } else {
            System.out.println("更新数据失败");
        }
        System.out.println(worker);

    }

    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
    }
}
