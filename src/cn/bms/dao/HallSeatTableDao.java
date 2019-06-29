package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.HallSeatTable;

public interface HallSeatTableDao {

    int insert(@Param("pojo") HallSeatTable pojo);

    int insertList(@Param("pojos") List< HallSeatTable> pojo);

    List<HallSeatTable> select(@Param("pojo") HallSeatTable pojo);

    int update(@Param("pojo") HallSeatTable pojo);

}
