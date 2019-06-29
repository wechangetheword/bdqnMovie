package cn.bms.service;

import cn.bms.pojo.TimeTable;

import java.util.List;

public interface TimeTableService {
    public int insert(TimeTable pojo);

    public int insertList(List<TimeTable> pojos);

    public List<TimeTable> select(TimeTable pojo);

    public int update(TimeTable pojo);

}
