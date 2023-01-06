package com.lujunhao.mymail.member.feign;

import com.lujunhao.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mymail-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();

}
