package com.technosignia.OwnerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technosignia.OwnerService.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

	

}
