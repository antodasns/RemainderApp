package com.service.app.remainder.notificationproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.service.app.remainder.entity.Remainder;

//@FeignClient(name="notification",url="http://localhost:8002/notification/api")
@FeignClient(name="notification")
public interface NoficationProxy {
	
	@PostMapping("/notificationservice/api/saveNotification")
	public void saveNotification(@RequestBody Remainder rem);

}
