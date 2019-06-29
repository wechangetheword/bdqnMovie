package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.HallSeatTable;
import cn.bms.dao.HallSeatTableDao;

@Service
public class HallSeatTableService {

    @Resource
    private HallSeatTableDao hallSeatTableDao;

    public int insert(HallSeatTable pojo){
        return hallSeatTableDao.insert(pojo);
    }

    public int insertList(List< HallSeatTable> pojos){
        return hallSeatTableDao.insertList(pojos);
    }

    public List<HallSeatTable> select(HallSeatTable pojo){
        return hallSeatTableDao.select(pojo);
    }

    public int update(HallSeatTable pojo){
        return hallSeatTableDao.update(pojo);
    }

}
