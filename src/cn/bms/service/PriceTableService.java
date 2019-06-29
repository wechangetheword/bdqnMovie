package cn.bms.service;

import cn.bms.pojo.PriceTable;

import java.util.List;

public interface PriceTableService {
    public int insert(PriceTable pojo);

    public int insertList(List< PriceTable> pojos);

    public List<PriceTable> select(PriceTable pojo);

    public int update(PriceTable pojo);


}
