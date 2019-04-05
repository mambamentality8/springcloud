package com.example.order_service.fallbcak;

import com.example.order_service.service.ProductClient;
import org.springframework.stereotype.Component;

/**
 * 针对商品服务，错降级处理
 */
@Component
public class ProductClientFallback implements ProductClient {

    @Override
    public String findById(int id) {
        //在此处返回兜底数据
        System.out.println("feign 调用product-service findbyid 异常");
        //异常在此处报警去通知运维人员(针对调用的服务细粒度控制)
        return null;
    }

}
