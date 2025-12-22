package com.tns.interfacedemo;
interface aparna{
	void display();
	
}

public class Interface {

	 public static void main(String[] args) {
	        aparna a = new aparna() {
	            public void display() {
	                System.out.println("Display method implemented");
	            }
	        };
	        a.display();
	    }
	}