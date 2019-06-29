package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.PhotoTable;

public interface PhotoTableDao {

    int insert(@Param("pojo") PhotoTable pojo);

    int insertList(@Param("pojos") List< PhotoTable> pojo);

    List<PhotoTable> select(@Param("pojo") PhotoTable pojo);

    int update(@Param("pojo") PhotoTable pojo);

}
