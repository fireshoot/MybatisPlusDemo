package com.mybatisplus.demo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @类描述
 * @time 2020/11/20  10:34
 * @author yangxin
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class SysUser {

    @TableId(value = "id")
    private Integer id;

    /**
    * 姓名
    */
    @TableId(value = "name")
    private String name;

    /**
    * 0-无效，1-有效
    */
    @TableId(value = "status")
    private Short status;

    /**
    * 密码
    */
    @TableId(value = "password")
    private String password;

    /**
    * 电话
    */
    @TableId(value = "phone_numer")
    private String phoneNumer;

    /**
    * 上一次重置密码时间
    */
    @TableId(value = "last_reset_password_time")
    private Date lastResetPasswordTime;

    /**
    * 创建时间
    */
    @TableId(value = "create_at")
    private Date createAt;

    /**
    * 更新时间
    */
    @TableId(value = "update_at")
    private Date updateAt;

    /**
    * 0-未删除，1-已删除
    */
    @TableId(value = "deleted")
    private Short deleted;
}