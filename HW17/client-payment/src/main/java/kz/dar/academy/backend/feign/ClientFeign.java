package kz.dar.academy.backend.feign;

import kz.dar.academy.backend.model.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("client-core-api")
public interface ClientFeign {
    @GetMapping("/client/{clientId}")
    ClientResponse getClientById(@PathVariable String clientId);
}
