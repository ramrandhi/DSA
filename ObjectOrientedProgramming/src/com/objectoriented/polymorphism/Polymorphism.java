package com.objectoriented.polymorphism;

public class Polymorphism {
	
	/*
	 		polymorphism -> poly means many, morphism means forms.
	 		
	 		two types
	 		
	 		1. compile time / static polymorphism (Achieved via method over loading)
	 		ex: same name but types, arguments, return types, ordering can be different.
	 		
	 		
	 		2.run time / dynamic ploymorphism (achieved throuth method over riding)
	 		ex: the body of the method changes but the method and return type keeps intact
	 		
	 		DYNAMIC METHOD DISPATCH:
	 		Ex: when jvm calls a overridden method at run time what method to run, ratherthan in compile time is called dynamic method dispatch.
	 		
	 		 => how java knows which method to call where reference object is of type parent and object is created for child class.
	 		 
	 		 ex: Box box = new BoxMatch();
	 		 		box.size();
	 		 
	 		 here box that is main class tells about the where it can have access and the BoxMatch tells about the from class 
	 		 you need to take the method from. also know as upcasting.
	 		 
	 		 
	 		 IMPORTANT: Here we need have size() method in both in Box class and in BoxMatch class as accessing mathod the parent
	 		 class looks for the method first in parent class and look for any method overrides and looks that method in child class.
	 */

}
