package lagartostore.order.feign;

import lagartostore.order.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "catalog-service", path = "/product")
public interface CatalogFeign {
    @GetMapping("/{Id}")
    public ResponseEntity<ProductDto> getById(@PathVariable (required = true) Integer id);
}