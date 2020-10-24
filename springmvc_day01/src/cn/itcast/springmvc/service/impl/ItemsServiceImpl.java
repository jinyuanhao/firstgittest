package cn.itcast.springmvc.service.impl;

import cn.itcast.springmvc.mapper.ItemsMapper;
import cn.itcast.springmvc.pojo.Items;
import cn.itcast.springmvc.pojo.ItemsExample;
import cn.itcast.springmvc.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> getItemsList() {

        ItemsExample example = new ItemsExample();
        List<Items> list = itemsMapper.selectByExampleWithBLOBs(example);

        return list;
    }
}
