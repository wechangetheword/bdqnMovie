package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.OrderTable;
import cn.bms.dao.OrderTableDao;

@Service
public class OrderTableService {

    @Resource
    private OrderTableDao orderTableDao;

    public int insert(OrderTable pojo){
        return orderTableDao.insert(pojo);
    }

    public int insertList(List< OrderTable> pojos){
        return orderTableDao.insertList(pojos);
    }

    public List<OrderTable> select(OrderTable pojo){
        return orderTableDao.select(pojo);
    }

    public int update(OrderTable pojo){
        return orderTableDao.update(pojo);
    }

}
