package com.cxxx.store.ware.controller;

import java.util.Arrays;
import java.util.Map;

import com.cxxx.store.ware.entity.WareInfoEntity;
import com.cxxx.store.ware.feign.WareFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cxxx.store.ware.entity.PurchaseEntity;
import com.cxxx.store.ware.service.PurchaseService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.common.utils.R;



/**
 * 采购信息
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 17:28:31
 */
@RestController
@RequestMapping("ware/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @Autowired
     WareFeignService wareFeignService;


    @RequestMapping("test")
    public  R test(){

        R testmp = wareFeignService.testmp();
        return R.ok().put("ok",testmp);

    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = purchaseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PurchaseEntity purchase = purchaseService.getById(id);

        return R.ok().put("purchase", purchase);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PurchaseEntity purchase){
		purchaseService.save(purchase);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PurchaseEntity purchase){
		purchaseService.updateById(purchase);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		purchaseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
