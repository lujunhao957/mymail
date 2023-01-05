package com.lujunhao.mymail.product;

import com.lujunhao.mymail.product.entity.BrandEntity;
import com.lujunhao.mymail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MymailProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("heise");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
