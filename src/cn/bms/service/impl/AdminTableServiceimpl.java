package cn.bms.service.impl;

import cn.bms.dao.AdminTableDao;
import cn.bms.pojo.AdminTable;
import cn.bms.service.AdminTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminTableServiceimpl")
public class AdminTableServiceimpl implements AdminTableService {

    @Resource
    private AdminTableDao adminTableDao;

    public int insert(AdminTable pojo){
        return adminTableDao.insert(pojo);
    }

    public int insertList(List< AdminTable> pojos){
        return adminTableDao.insertList(pojos);
    }

    public List<AdminTable> select(AdminTable pojo){
        return adminTableDao.select(pojo);
    }

    public int update(AdminTable pojo){
        return adminTableDao.update(pojo);
    }

}
