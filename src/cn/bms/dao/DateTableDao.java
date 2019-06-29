package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.DateTable;

public interface DateTableDao {

    int insert(@Param("pojo") DateTable pojo);

    int insertList(@Param("pojos") List< DateTable> pojo);

    List<DateTable> select(@Param("pojo") DateTable pojo);

    int update(@Param("pojo") DateTable pojo);

}
