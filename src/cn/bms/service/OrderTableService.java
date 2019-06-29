package cn.bms.service;

import cn.bms.pojo.OrderTable;

import java.util.List;

public interface OrderTableService {
    public int insert(OrderTable pojo);

    public int insertList(List< OrderTable> pojos);

    public List<OrderTable> select(OrderTable pojo);

    public int update(OrderTable pojo);

}
