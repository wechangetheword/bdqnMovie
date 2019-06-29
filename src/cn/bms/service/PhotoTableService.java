package cn.bms.service;

import cn.bms.pojo.PhotoTable;

import java.util.List;

public interface PhotoTableService {
    public int insert(PhotoTable pojo);

    public int insertList(List< PhotoTable> pojos);

    public List<PhotoTable> select(PhotoTable pojo);

    public int update(PhotoTable pojo);

}
