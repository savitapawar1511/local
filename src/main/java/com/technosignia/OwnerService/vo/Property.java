package com.technosignia.OwnerService.vo;

import org.springframework.stereotype.Component;

      @Component
     public class Property {
    	  
    	  Long id;
    	  
    	  String name;
    	  
    	  String configuration;
    	  
    	  String address;
    	  
    	  Double sellprice;
    	  
    	  Double rentalPrice;
    	  
    	  String furnishingStatus;
    	  
    	  Long propertyAge;
    	  
    	  Long ownerId;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getConfiguration() {
			return configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Double getSellprice() {
			return sellprice;
		}

		public void setSellprice(Double sellprice) {
			this.sellprice = sellprice;
		}

		public Double getRentalPrice() {
			return rentalPrice;
		}

		public void setRentalPrice(Double rentalPrice) {
			this.rentalPrice = rentalPrice;
		}

		public String getFurnishingStatus() {
			return furnishingStatus;
		}

		public void setFurnishingStatus(String furnishingStatus) {
			this.furnishingStatus = furnishingStatus;
		}

		public Long getPropertyAge() {
			return propertyAge;
		}

		public void setPropertyAge(Long propertyAge) {
			this.propertyAge = propertyAge;
		}

		public Long getOwnerId() {
			return ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}
    	  
    	  
	
	

}
