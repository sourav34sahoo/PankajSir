package com.interfaceConcept;
interface Property
{
	public void addProperty(String name,String imageUrl,String NoOfBeds);
	public void deletePropertyById();
	public void updatePropertyDetails();
	public void viewPropertyDetails();
}

public class InterfaceImplementation implements Property{
	@Override
	public void addProperty(String name, String imageUrl, String NoOfBeds) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void deletePropertyById() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void updatePropertyDetails() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void viewPropertyDetails() {
		// TODO Auto-generated method stub	
	}
}
