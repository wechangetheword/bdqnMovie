package cn.bms.service;

import cn.bms.pojo.UserTable;

import java.util.List;

public interface UserTableService {
    public int insert(UserTable pojo);

    public int insertList(List< UserTable> pojos);

    public List<UserTable> select(UserTable pojo);

    public int update(UserTable pojo);

}
