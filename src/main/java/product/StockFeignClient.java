package product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service-with-eureka-cluster")
public interface StockFeignClient {
    @RequestMapping("/api/v1/stocks/{productNumber}")
    long getProductStock(@PathVariable String productNumber);
}
