package cn.bms.service;

import cn.bms.pojo.MovieTable;

import java.util.List;

public interface MovieTableService {
    public int insert(MovieTable pojo);

    public int insertList(List< MovieTable> pojos);

    public List<MovieTable> select(MovieTable pojo);

    public int update(MovieTable pojo);

}
