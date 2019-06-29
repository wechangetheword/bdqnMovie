package cn.bms.service.impl;

import cn.bms.dao.HallTableDao;
import cn.bms.pojo.HallTable;
import cn.bms.service.HallTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("hallTableServiceimpl")
public class HallTableServiceimpl implements HallTableService {

    @Resource
    private HallTableDao hallTableDao;

    public int insert(HallTable pojo){
        return hallTableDao.insert(pojo);
    }

    public int insertList(List< HallTable> pojos){
        return hallTableDao.insertList(pojos);
    }

    public List<HallTable> select(HallTable pojo){
        return hallTableDao.select(pojo);
    }

    public int update(HallTable pojo){
        return hallTableDao.update(pojo);
    }

}
