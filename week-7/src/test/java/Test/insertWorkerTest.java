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

public class insertWorkerTest {
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
    public void insertWorkerTest() {
        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("赵六");
        worker.setAge(36);
        worker.setSex("女");
        worker.setWorker_id("1004");
        WorkerMapper mapper = sqlSession.getMapper(WorkerMapper.class);
        int result = mapper.insertWorker(worker);
        if (result > 0) {
            System.out.println("成功插入" + result + "条数据");
        } else {
            System.out.println("插入数据失败");
        }
        System.out.println(worker);
    }

    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
    }
}
