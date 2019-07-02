package cn.bms.dao;

import cn.bms.pojo.OrderTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderTableDao {

    int insert(@Param("pojo") OrderTable pojo);

    int insertList(@Param("pojos") List<OrderTable> pojo);

    List<OrderTable> select(@Param("pojo") OrderTable pojo);

    int update(@Param("pojo") OrderTable pojo);

}
