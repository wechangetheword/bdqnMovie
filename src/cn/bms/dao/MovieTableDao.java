package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.MovieTable;

public interface MovieTableDao {

    int insert(@Param("pojo") MovieTable pojo);

    int insertList(@Param("pojos") List< MovieTable> pojo);

    List<MovieTable> select(@Param("pojo") MovieTable pojo);

    int update(@Param("pojo") MovieTable pojo);

}
