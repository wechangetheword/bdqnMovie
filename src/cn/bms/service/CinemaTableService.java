package cn.bms.service;

import cn.bms.pojo.CinemaTable;

import java.util.List;

public interface CinemaTableService {
    public int insert(CinemaTable pojo);
    public int insertList(List< CinemaTable> pojos);
    public List<CinemaTable> select(CinemaTable pojo);
    public int update(CinemaTable pojo);
}
