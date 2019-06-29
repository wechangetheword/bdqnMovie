package cn.bms.service.impl;

import cn.bms.dao.CinemaTableDao;
import cn.bms.pojo.CinemaTable;
import cn.bms.service.CinemaTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cinemaTableServiceimpl")
public class CinemaTableServiceimpl implements CinemaTableService {

    @Resource
    private CinemaTableDao cinemaTableDao;

    public int insert(CinemaTable pojo){
        return cinemaTableDao.insert(pojo);
    }

    public int insertList(List< CinemaTable> pojos){
        return cinemaTableDao.insertList(pojos);
    }

    public List<CinemaTable> select(CinemaTable pojo){
        return cinemaTableDao.select(pojo);
    }

    public int update(CinemaTable pojo){
        return cinemaTableDao.update(pojo);
    }

}
