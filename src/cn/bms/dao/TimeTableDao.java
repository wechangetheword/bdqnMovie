package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.TimeTable;

public interface TimeTableDao {

    int insert(@Param("pojo") TimeTable pojo);

    int insertList(@Param("pojos") List< TimeTable> pojo);

    List<TimeTable> select(@Param("pojo") TimeTable pojo);

    int update(@Param("pojo") TimeTable pojo);

}
