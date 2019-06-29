package cn.bms.service.impl;

import cn.bms.dao.PhotoTableDao;
import cn.bms.pojo.PhotoTable;
import cn.bms.service.PhotoTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("photoTableServiceimpl")
public class PhotoTableServiceimpl implements PhotoTableService {

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
