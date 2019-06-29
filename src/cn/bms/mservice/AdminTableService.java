package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.AdminTable;
import cn.bms.dao.AdminTableDao;

@Service
public class AdminTableService {

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
