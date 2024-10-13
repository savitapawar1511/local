package com.technosignia.OwnerService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.technosignia.OwnerService.entity.Owner;
import com.technosignia.OwnerService.repository.OwnerRepository;
import com.technosignia.OwnerService.vo.OwnerPropertyTemplate;
import com.technosignia.OwnerService.vo.Property;

    @Service
    public class OwnerService {
    	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	OwnerRepository ownerRopository;

	public Owner createOwnerDetails(Owner owner) {
		
		return ownerRopository.save(owner);
	}

	public List<Owner> findAllOwnerDetails() {
		
		return ownerRopository.findAll();
	}

	public OwnerPropertyTemplate findOwnerPropertyDetailsById(Long id) {
		 
		OwnerPropertyTemplate ownerProp = new OwnerPropertyTemplate();
		
	 Owner owner = ownerRopository.findById(id).get();
		
		List<Property> properties = restTemplate.getForObject("http://localhost:8083/property"+id,List.class);
		
		ownerProp.setOwner(owner);
		 
		ownerProp.setProperties(properties);
		
		return ownerProp;
	}

	public String deleteOwnerDetailsById(Long id) {
		Optional<Owner>opowner = ownerRopository.findById(id);
		if(opowner.isPresent()) {
			ownerRopository.deleteById(id);	
		return "Record delete Successfully";
	   }
	    return "Record not found";
	}
	
	public Owner updateOwnerDetailsById(Owner owner, Long id) {
		Owner dbOwner = null;
		Optional<Owner>optowner = ownerRopository.findById(id);
		if(optowner.isPresent()) 
			dbOwner = optowner.get();
		
		if(owner.getName()!=null)
			dbOwner.setName(owner.getName());
			
		if(owner.getEmail()!=null)
			dbOwner.setEmail(owner.getEmail());  
		
		if(owner.getContact()!=null)
			dbOwner.setContact(owner.getContact());
		
		if(owner.getAddress()!=null)
			dbOwner.setAddress(owner.getAddress());
		
		return ownerRopository.save(dbOwner);
	}


}
