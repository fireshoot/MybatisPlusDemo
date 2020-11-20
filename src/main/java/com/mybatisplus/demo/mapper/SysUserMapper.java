package com.mybatisplus.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.demo.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yangxin
 * @类描述
 * @time 2020/11/20  10:34
 */
@Mapper
@DS("my")
public interface SysUserMapper extends BaseMapper<SysUser> {

}