package com.eight.LogisticsSystems.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.eight.LogisticsSystems.domain.Goods;
import com.eight.LogisticsSystems.mapper.GoodsMapper;
import com.eight.LogisticsSystems.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public Goods selectByPrimaryKey(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }
}
