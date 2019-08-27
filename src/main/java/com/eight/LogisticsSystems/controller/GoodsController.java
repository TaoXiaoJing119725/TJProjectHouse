package com.eight.LogisticsSystems.controller;

import com.eight.LogisticsSystems.common.MyProperties;
import com.eight.LogisticsSystems.domain.Goods;
import com.eight.LogisticsSystems.service.GoodsService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GoodsController {
    @Resource(name="goodsServiceImpl")
    GoodsService goodsService;
    @Resource(name= "myProperties")
    MyProperties myProperties;
    @RequestMapping("selectById")
    public Goods selectById(Goods goods){

        return goodsService.selectByPrimaryKey(goods.getId());
    }
    @RequestMapping("selectall")
    public List<Goods> selectAll(int page){
        PageHelper.startPage(page,myProperties.getPagesize());
        return goodsService.selectAll();
    }
}
