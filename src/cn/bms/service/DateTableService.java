package cn.bms.service;

import cn.bms.pojo.DateTable;

import java.util.List;

public interface DateTableService {
    public int insert(DateTable pojo);

    public int insertList(List< DateTable> pojos);

    public List<DateTable> select(DateTable pojo);

    public int update(DateTable pojo);
}
