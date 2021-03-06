package com.fileserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pojo.Dog;

public class FileOpeartion {

	public FileOpeartion()
	{
		
	}
	
	public void serialiazeObject(Dog dog) throws IOException
	{
		FileOutputStream file = new FileOutputStream("DogObject.txt");
		ObjectOutputStream out = new ObjectOutputStream(file); 
         
         // Method for serialization of object 
         out.writeObject(dog); 
           
         out.close(); 
         file.close(); 
           
         System.out.println("Object has been serialized"); 
	}
	
	public void deserizedObject() throws IOException, ClassNotFoundException
	{
		FileInputStream file = new FileInputStream("DogObject.txt");
		 ObjectInputStream in = new ObjectInputStream(file); 
         
         // Method for deserialization of object 
         Dog dog1 = (Dog)in.readObject(); 
           
         in.close(); 
         file.close(); 
           
         System.out.println("Object has been deserialized "); 
         
         System.out.println("Name = " + dog1.getName()); 
         System.out.println("Age = " + dog1.getAge()); 
         System.out.println("Price = " + dog1.getPrice());
         System.out.println("Height = " + dog1.getHeight());

	}
}
