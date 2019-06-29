package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.MovieTable;
import cn.bms.dao.MovieTableDao;

@Service
public class MovieTableService {

    @Resource
    private MovieTableDao movieTableDao;

    public int insert(MovieTable pojo){
        return movieTableDao.insert(pojo);
    }

    public int insertList(List< MovieTable> pojos){
        return movieTableDao.insertList(pojos);
    }

    public List<MovieTable> select(MovieTable pojo){
        return movieTableDao.select(pojo);
    }

    public int update(MovieTable pojo){
        return movieTableDao.update(pojo);
    }

}
