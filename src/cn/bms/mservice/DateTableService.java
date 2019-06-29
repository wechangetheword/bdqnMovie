package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.DateTable;
import cn.bms.dao.DateTableDao;

@Service
public class DateTableService {

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
