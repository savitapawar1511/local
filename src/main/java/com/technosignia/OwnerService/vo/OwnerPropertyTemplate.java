package com.technosignia.OwnerService.vo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.technosignia.OwnerService.entity.Owner;

@Component
public class OwnerPropertyTemplate {
	
	   Owner owner;
	   
	   List<Property> properties;
	   
	   public Owner getOwner() {
		   return owner;
	   }
	   
	   public void setOwner(Owner owner) {
		   
		   this.owner = owner;
	   }
	   public List<Property> getProperties(){
          return properties;
	   }
	   
	   public void setProperties(List<Property> properties){
	          this.properties = properties;
		   }
   }

	   
	   
	   
	   