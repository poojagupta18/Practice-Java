package com.javapapers.jee;

public class AnimalTypeService {

	String animalType = "";
	
	public String getAnimalType(String animal)
	{
		if(animal.equals("Dog"))
		{
			animalType = "Domestic";
		}
		else if(animal.equals("Lion"))
		{
			animalType = "Wild";
		}
		else
		{
			animalType = "I dont know";
		}
		
		return animalType;
	}
}
