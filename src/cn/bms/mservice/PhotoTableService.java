package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.PhotoTable;
import cn.bms.dao.PhotoTableDao;

@Service
public class PhotoTableService {

    @Resource
    private PhotoTableDao photoTableDao;

    public int insert(PhotoTable pojo){
        return photoTableDao.insert(pojo);
    }

    public int insertList(List< PhotoTable> pojos){
        return photoTableDao.insertList(pojos);
    }

    public List<PhotoTable> select(PhotoTable pojo){
        return photoTableDao.select(pojo);
    }

    public int update(PhotoTable pojo){
        return photoTableDao.update(pojo);
    }

}
