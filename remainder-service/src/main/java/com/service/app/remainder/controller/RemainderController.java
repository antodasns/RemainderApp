package com.service.app.remainder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.app.remainder.entity.Remainder;
import com.service.app.remainder.services.RemainderService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/remainderservice/api")
public class RemainderController {
	
	@Autowired
	RemainderService remainderService;
	
	@PostMapping("/saveRemainder")
	public void saveRemainder(@RequestBody Remainder remainder) { 
		
		remainderService.saveRemainder(remainder); 
		 
	}
	
	@GetMapping("/getRemainder")
	public List<Remainder> getRemainder() { 
		
		 return remainderService.getRemainder(); 
		
	}
	
	@GetMapping("/updateRemainder/{remId}")
	public void getRemainder(@PathVariable("remId") String remId) { 
		
		  remainderService.updateRemainder(remId); 
		
	}

}
