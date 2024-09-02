package com.oops.statics;

public class MainBox {

	public static void main(String[] args) {
        Box box = new MatchBox();
        Box.description(); // due to static method it directly references the methods inside the class
        
        Box matchBox = new MatchBox();
        Box.description(); // due to static method it directly references the methods inside the class
    }

}
