package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.HallTable;

public interface HallTableDao {

    int insert(@Param("pojo") HallTable pojo);

    int insertList(@Param("pojos") List< HallTable> pojo);

    List<HallTable> select(@Param("pojo") HallTable pojo);

    int update(@Param("pojo") HallTable pojo);

}
