package com.cxxx.store.product;

import com.cxxx.store.product.entity.BrandEntity;
import com.cxxx.store.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreProductApplicationTests {


    @Autowired
    BrandService brandService;
    @Test
   public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("ps5");
        brandEntity.setLogo("sony");
        brandService.save(brandEntity);
        System.out.println("保存成功");
        new ArrayList<>().forEach((i)->{
            System.out.println();
        });
    }

}
