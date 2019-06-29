package cn.bms.mservice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.bms.pojo.PriceTable;
import cn.bms.dao.PriceTableDao;

@Service
public class PriceTableService {

    @Resource
    private PriceTableDao priceTableDao;

    public int insert(PriceTable pojo){
        return priceTableDao.insert(pojo);
    }

    public int insertList(List< PriceTable> pojos){
        return priceTableDao.insertList(pojos);
    }

    public List<PriceTable> select(PriceTable pojo){
        return priceTableDao.select(pojo);
    }

    public int update(PriceTable pojo){
        return priceTableDao.update(pojo);
    }

}
