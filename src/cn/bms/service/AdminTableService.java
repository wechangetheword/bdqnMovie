package cn.bms.service;

import cn.bms.dao.AdminTableDao;
import cn.bms.pojo.AdminTable;

import java.util.List;

public interface AdminTableService {

    public int insert(AdminTable pojo);

    public int insertList(List< AdminTable> pojos);

    public List<AdminTable> select(AdminTable pojo);

    public int update(AdminTable pojo);
}
