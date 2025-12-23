package com.tns.multipleinheritance;
interface aparna{
	void display();
}
interface ishu{
	void show();
	
}
class Human implements aparna,ishu{
	@Override
	public void display() {
		System.out.println("aparna is a good girl");
	}

    @Override
    public void show() {
	System.out.println("Ishu is also a good girl");
}
}

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		
    Human h=new Human();
    h.display();
    h.show();

		
	}

}
