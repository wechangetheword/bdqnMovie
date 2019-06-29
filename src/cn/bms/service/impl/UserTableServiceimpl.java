package cn.bms.service.impl;

import cn.bms.dao.UserTableDao;
import cn.bms.pojo.UserTable;
import cn.bms.service.UserTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userTableServiceimpl")
public class UserTableServiceimpl implements UserTableService {

    @Resource
    private UserTableDao userTableDao;

    public int insert(UserTable pojo){
        return userTableDao.insert(pojo);
    }

    public int insertList(List< UserTable> pojos){
        return userTableDao.insertList(pojos);
    }

    public List<UserTable> select(UserTable pojo){
        return userTableDao.select(pojo);
    }

    public int update(UserTable pojo){
        return userTableDao.update(pojo);
    }

}
