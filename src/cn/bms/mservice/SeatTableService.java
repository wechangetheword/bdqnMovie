package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.SeatTable;
import cn.bms.dao.SeatTableDao;

@Service
public class SeatTableService {

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
