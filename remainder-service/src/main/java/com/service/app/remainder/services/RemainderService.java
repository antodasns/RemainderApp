package com.service.app.remainder.services;

import java.util.List;

import com.service.app.remainder.entity.Remainder;

public interface RemainderService {
	
	public Remainder saveRemainder(Remainder remainder);

	public List<Remainder> getRemainder();

	public void updateRemainder(String remId);

}
