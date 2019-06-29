package cn.bms.service.impl;

import cn.bms.dao.SeatTableDao;
import cn.bms.pojo.SeatTable;
import cn.bms.service.SeatTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("seatTableServiceimpl")
public class SeatTableServiceimpl implements SeatTableService {

    @Resource
    private SeatTableDao seatTableDao;

    public int insert(SeatTable pojo){
        return seatTableDao.insert(pojo);
    }

    public int insertList(List< SeatTable> pojos){
        return seatTableDao.insertList(pojos);
    }

    public List<SeatTable> select(SeatTable pojo){
        return seatTableDao.select(pojo);
    }

    public int update(SeatTable pojo){
        return seatTableDao.update(pojo);
    }

}
