package com.mybatisplus.demo.controller;

import com.mybatisplus.demo.model.OrderCheque;
import com.mybatisplus.demo.model.SysUser;
import com.mybatisplus.demo.service.SysUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangxin
 * @类描述
 * @time 2020/11/20  10:43
 */
@RestController
@RequestMapping("sys")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("userList")
    public List<SysUser> list(){
        return sysUserService.getUser();
    }

    @GetMapping("chequeList")
    public List<OrderCheque> chequeList(@RequestParam String orderNo){
        return sysUserService.getCheque(orderNo);
    }
}
