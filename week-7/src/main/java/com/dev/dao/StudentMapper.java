package com.dev.dao;

import com.dev.scy.Student;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.*;

public interface StudentMapper {
    @Select("select * from c_student where id=#{id} ")


    @Results({@Result(id = true, column = "id", property = "id"),
            @Result(column = "number", property = "number"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "cid", property = "cid"),
            @Result(column = "id",property = "classlist",
                    many = @Many(select =
                         "com.dev.dao.ClassMapper.selectClassByStudentId"))})
    Student selectStudentById(int id);
    @Select("select * from c_student where id=#{id} ")
    @Results({@Result(id = true, column = "id", property = "id"),
            @Result(column = "number", property = "number"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "cid", property = "cid")})
    Student queryStudent(int id);
    @Update("update c_student set name=#{name},age=#{age} where id = #{id}")
            int updateStudent(Student student);
}

