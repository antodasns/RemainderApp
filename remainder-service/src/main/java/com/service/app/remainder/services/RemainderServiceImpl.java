package com.service.app.remainder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.app.remainder.entity.Remainder;
import com.service.app.remainder.notificationproxy.NoficationProxy;
import com.service.app.remainder.repository.RemainderRepository;

@Service
public class RemainderServiceImpl implements RemainderService{
	
	@Autowired
	RemainderRepository remainderRepository;
	
	@Autowired
	NoficationProxy notificationProxy;

	@Override
	public Remainder saveRemainder(Remainder remainder) {
		
		Remainder rem=remainderRepository.save(remainder);
				
		notificationProxy.saveNotification(rem);
		
		return rem;
		
	}

	@Override
	public List<Remainder> getRemainder() {
	
		return remainderRepository.findAll();
		
	}

	@Override
	public void updateRemainder(String remId) {
		
		Remainder rem=remainderRepository.findById(Long.parseLong(remId)).get();

		rem.setNotified(true);
		
		remainderRepository.save(rem);
	}

}
