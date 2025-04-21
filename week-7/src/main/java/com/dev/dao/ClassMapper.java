package com.dev.dao;

import com.dev.scy.Classes;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassMapper {
    @Select("select * from c_class where id=#{id}")
    @Results({@Result(id = true, column = "id", property = "id"),
            @Result(column = "classname", property = "classname")
    })
    List<Classes> selectClassByStudentId(int id);
}

