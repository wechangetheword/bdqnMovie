package cn.bms.service.impl;

import cn.bms.dao.MovieTableDao;
import cn.bms.pojo.MovieTable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("movieTableServiceimpl")
public class MovieTableServiceimpl {

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
