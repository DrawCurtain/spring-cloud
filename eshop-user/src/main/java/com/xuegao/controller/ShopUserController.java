package com.xuegao.controller;


import com.xuegao.entity.ShopUser;
import com.xuegao.service.IShopUserService;
import com.xuegao.springcloud.common.core.domain.CommonResult;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}

