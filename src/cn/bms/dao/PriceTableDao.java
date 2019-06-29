package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.PriceTable;

public interface PriceTableDao {

    int insert(@Param("pojo") PriceTable pojo);

    int insertList(@Param("pojos") List< PriceTable> pojo);

    List<PriceTable> select(@Param("pojo") PriceTable pojo);

    int update(@Param("pojo") PriceTable pojo);

}
