package com.mybatisplus.demo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mybatisplus.demo.mapper.OrderChequeMapper;
import com.mybatisplus.demo.mapper.SysUserMapper;
import com.mybatisplus.demo.model.OrderCheque;
import com.mybatisplus.demo.model.SysUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangxin
 * @类描述
 * @time 2020/11/20  10:38
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private OrderChequeMapper orderChequeMapper;

    public List<SysUser> getUser(){
        Wrapper<SysUser> wrapper =  Wrappers.<SysUser>lambdaQuery()
                .eq(SysUser::getDeleted, 0);
        return sysUserMapper.selectList(wrapper);
    }

    public List<OrderCheque> getCheque(String orderNo) {
        Wrapper<OrderCheque> wrapper = Wrappers.<OrderCheque>lambdaQuery()
                .eq(OrderCheque::getIsDeleted, 0)
                .eq(OrderCheque::getOrderNo, orderNo)
                .orderByDesc(OrderCheque::getAddDt);
        return orderChequeMapper.selectList(wrapper);
    }

}
