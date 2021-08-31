package com.xuegao.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xuegao.entity.ShopUser;
import com.xuegao.service.IShopUserService;
import com.xuegao.springcloud.common.core.domain.CommonResult;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author xuegang
 * @since 2021-08-20
 */
@RestController
@RequestMapping("/shop-user")
public class ShopUserController {
    @Autowired
    private IShopUserService shopUserService;

    @PostMapping("/user/add")
    public CommonResult addUser(@RequestBody ShopUser shopUser) {
        this.shopUserService.save(shopUser);
        return CommonResult.ok();
    }

    @GetMapping("/user/getUser/{id}")
    public CommonResult getUserById(@PathVariable("id") String  id) {
        ShopUser shopUser = this.shopUserService.getById(Integer.parseInt(id));
        return CommonResult.ok(shopUser);
    }

    @XxlJob("hello")
    private void HelloWorld(){
        System.out.println("Hello world");
    }

    @GetMapping("/user/getUser")
    public CommonResult getUser() {
//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.between("count",0,20);
        List<ShopUser> shopUsers = this.shopUserService.list();
        return CommonResult.ok(shopUsers);
    }

    @GetMapping("/user/delUser/{id}")
    public CommonResult deleteById(@PathVariable("id") String id){
        boolean b = shopUserService.removeById(id);
        if (b){
            return CommonResult.ok();
        }
        return CommonResult.error("删除错误");
    }

}

