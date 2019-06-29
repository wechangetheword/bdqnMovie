package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.HallTable;
import cn.bms.dao.HallTableDao;

@Service
public class HallTableService {

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
