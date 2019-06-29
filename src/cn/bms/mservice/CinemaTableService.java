package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.CinemaTable;
import cn.bms.dao.CinemaTableDao;

@Service
public class CinemaTableService {

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
