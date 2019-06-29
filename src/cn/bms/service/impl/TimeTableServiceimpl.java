package cn.bms.service.impl;

import cn.bms.dao.TimeTableDao;
import cn.bms.pojo.TimeTable;
import cn.bms.service.TimeTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("timeTableServiceimpl")
public class TimeTableServiceimpl implements TimeTableService {

    @Resource
    private TimeTableDao timeTableDao;

    public int insert(TimeTable pojo){
        return timeTableDao.insert(pojo);
    }

    public int insertList(List< TimeTable> pojos){
        return timeTableDao.insertList(pojos);
    }

    public List<TimeTable> select(TimeTable pojo){
        return timeTableDao.select(pojo);
    }

    public int update(TimeTable pojo){
        return timeTableDao.update(pojo);
    }

}
