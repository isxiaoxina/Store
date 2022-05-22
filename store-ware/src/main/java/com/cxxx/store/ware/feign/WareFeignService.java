package com.cxxx.store.ware.feign;

import com.cxxx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("store-coupon")
public interface WareFeignService {
    /**
     * 意思就是调用这个
     * @return
     */
     @RequestMapping("/coupon/coupon/member/list")
    public R testmp();
}
