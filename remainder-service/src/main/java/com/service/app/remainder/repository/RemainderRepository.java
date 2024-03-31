package com.service.app.remainder.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.app.remainder.entity.Remainder;

@Repository
public interface RemainderRepository extends JpaRepository<Remainder, Long>{

}
