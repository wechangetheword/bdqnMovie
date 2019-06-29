package cn.bms.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.bms.pojo.UserTable;

public interface UserTableDao {

    int insert(@Param("pojo") UserTable pojo);

    int insertList(@Param("pojos") List< UserTable> pojo);

    List<UserTable> select(@Param("pojo") UserTable pojo);

    int update(@Param("pojo") UserTable pojo);

}
