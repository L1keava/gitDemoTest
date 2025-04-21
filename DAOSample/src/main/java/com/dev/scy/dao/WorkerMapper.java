package com.dev.scy.dao;

import com.dev.scy.Worker;
import org.apache.ibatis.annotations.Select;


public interface WorkerMapper {
    @Select("select * from tb_worker where id = ${id}")
    Worker selectWorker(int id);
}
