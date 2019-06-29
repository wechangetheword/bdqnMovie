package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.CinemaTable;

public interface CinemaTableDao {

    int insert(@Param("pojo") CinemaTable pojo);

    int insertList(@Param("pojos") List< CinemaTable> pojo);

    List<CinemaTable> select(@Param("pojo") CinemaTable pojo);

    int update(@Param("pojo") CinemaTable pojo);

}
