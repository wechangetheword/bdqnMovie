package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.SeatTable;

public interface SeatTableDao {

    int insert(@Param("pojo") SeatTable pojo);

    int insertList(@Param("pojos") List< SeatTable> pojo);

    List<SeatTable> select(@Param("pojo") SeatTable pojo);

    int update(@Param("pojo") SeatTable pojo);

}
