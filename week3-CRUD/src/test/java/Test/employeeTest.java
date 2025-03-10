package Test;


import com.dev.scy.Emp;
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

public class employeeTest {
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
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void findById() {
        // 查询ID为2的员工
        int target_id = 2;
        Emp target_emp = sqlSession.selectOne("mapper.EmployeeMap.findEmployeeById", target_id);
        System.out.println("查询编号为" + target_id + "的员工：\n" + target_emp);
        addEmp();
    }

    public void addEmp() {
        // 新增两条记录
        Emp new_emp_1 = new Emp();
        new_emp_1.setId(6);
        new_emp_1.setAge(30);
        new_emp_1.setName("喵");
        new_emp_1.setPosition("员工");
        sqlSession.insert("mapper.EmployeeMap.insertUser", new_emp_1);
        Emp new_emp_2 = new Emp();
        new_emp_2.setId(7);
        new_emp_2.setAge(26);
        new_emp_2.setName("汪");
        new_emp_2.setPosition("员工");
        sqlSession.insert("mapper.EmployeeMap.insertUser", new_emp_2);
        findAll();
        updateEmp();
    }

    public void findAll() {
        // 查询所有员工
        List<Emp> list = sqlSession.selectList("mapper.EmployeeMap.findAllEmployee");
        System.out.println("查询全部员工：");
        for (Emp emp_list : list) {
            System.out.println(emp_list);
        }
    }

    public void updateEmp() {
        //更新id=4的员工，名称为张三，年龄28
        System.out.println("更新ID为4的员工信息");
        sqlSession.update("mapper.EmployeeMap.updateUser", 4);
        deleteEmp();
    }

    public void deleteEmp() {
        System.out.println("删除ID为6的员工信息中");
        sqlSession.delete("mapper.EmployeeMap.deleteUser", 6);
        findAll();
    }

    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
    }
}
