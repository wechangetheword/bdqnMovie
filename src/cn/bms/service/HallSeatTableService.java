package cn.bms.service;

import cn.bms.pojo.HallSeatTable;

import java.util.List;

public interface HallSeatTableService {
    public int insert(HallSeatTable pojo);
    public int insertList(List< HallSeatTable> pojos);

    public List<HallSeatTable> select(HallSeatTable pojo);

    public int update(HallSeatTable pojo);

}
