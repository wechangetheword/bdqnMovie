package cn.bms.service.impl;

import cn.bms.dao.OrderTableDao;
import cn.bms.pojo.OrderTable;
import cn.bms.service.OrderTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderTableServiceimpl")
public class OrderTableServiceimpl implements OrderTableService {

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
