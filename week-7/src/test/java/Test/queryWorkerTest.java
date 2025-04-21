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

public class queryWorkerTest {
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
    public void findWorkerByIdTest() {
        WorkerMapper mapper = sqlSession.getMapper(WorkerMapper.class);
        Worker worker = mapper.selectWorker(1);
        System.out.println(worker.toString());
    }

    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
    }

}
