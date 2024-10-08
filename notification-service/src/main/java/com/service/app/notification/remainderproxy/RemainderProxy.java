package com.service.app.notification.remainderproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="remainder",url="http://localhost:8001/remainder/api")
@FeignClient(name="remainder")
public interface RemainderProxy {
	
	@GetMapping("/remainderservice/api/updateRemainder/{remId}")
	public void saveNotification(@PathVariable("remId") String remId);

}
