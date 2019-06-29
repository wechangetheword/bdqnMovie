package cn.bms.service.impl;

import cn.bms.dao.HallSeatTableDao;
import cn.bms.pojo.HallSeatTable;
import cn.bms.service.HallSeatTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("hallSeatTableServiceimpl")
public class HallSeatTableServiceimpl implements HallSeatTableService {

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
