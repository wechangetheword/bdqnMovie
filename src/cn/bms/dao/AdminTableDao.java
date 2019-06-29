package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.AdminTable;

public interface AdminTableDao {

    int insert(@Param("pojo") AdminTable pojo);

    int insertList(@Param("pojos") List< AdminTable> pojo);

    List<AdminTable> select(@Param("pojo") AdminTable pojo);

    int update(@Param("pojo") AdminTable pojo);

}
