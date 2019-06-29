package cn.bms.service;

import cn.bms.pojo.SeatTable;

import java.util.List;

public interface SeatTableService {
    public int insert(SeatTable pojo);

    public int insertList(List< SeatTable> pojos);

    public List<SeatTable> select(SeatTable pojo);

    public int update(SeatTable pojo);

}
