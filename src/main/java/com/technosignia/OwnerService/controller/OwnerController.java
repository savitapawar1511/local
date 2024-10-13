package com.technosignia.OwnerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.OwnerService.entity.Owner;
import com.technosignia.OwnerService.service.OwnerService;
import com.technosignia.OwnerService.vo.OwnerPropertyTemplate;

      @RestController
      public class OwnerController {
    	  
	  @Autowired
	   OwnerService ownerService;
	  
	  @PostMapping("/owner")
	  public Owner createOwnerDetails(@RequestBody Owner owner) {
		 return  ownerService.createOwnerDetails(owner);
	  }
	  
	  @GetMapping("/owner")
	  public List<Owner> getAllOwnerDetails(){
		  return ownerService.findAllOwnerDetails();
	  }
      
	  @GetMapping("/owner/{id}")
	  public OwnerPropertyTemplate findOwnerPropertyDetailsById(@PathVariable Long id) {
		  return ownerService.findOwnerPropertyDetailsById(id);  
	  }
	  
	  @DeleteMapping("/owner/{id}")
	  public String deleteOwnerDetailsById(@PathVariable Long id) {
		  return ownerService.deleteOwnerDetailsById(id);
	  }
	  
	  @PutMapping("/owner")
	  public Owner updateOwnerDetailsById(@RequestBody Owner owner, @RequestParam Long id) {
		  return ownerService.updateOwnerDetailsById(owner,id);
	  }

}
      
      
      
      