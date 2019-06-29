package cn.bms.service;

import cn.bms.pojo.HallTable;

import java.util.List;

public interface HallTableService {
    public int insert(HallTable pojo);

    public int insertList(List< HallTable> pojos);

    public List<HallTable> select(HallTable pojo);

    public int update(HallTable pojo);

}
