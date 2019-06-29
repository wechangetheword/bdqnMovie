package cn.bms.service.impl;

import cn.bms.dao.DateTableDao;
import cn.bms.pojo.DateTable;
import cn.bms.service.DateTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("dateTableServiceimpl")
public class DateTableServiceimpl implements DateTableService {

    @Resource
    private DateTableDao dateTableDao;

    public int insert(DateTable pojo){
        return dateTableDao.insert(pojo);
    }

    public int insertList(List< DateTable> pojos){
        return dateTableDao.insertList(pojos);
    }

    public List<DateTable> select(DateTable pojo){
        return dateTableDao.select(pojo);
    }

    public int update(DateTable pojo){
        return dateTableDao.update(pojo);
    }

}
