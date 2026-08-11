package com.nit.methodOverriding;

class Bird
{
	public void  move() {
		System.out.println("Bird moves.");
	}
}
class Parrot extends Bird{
	@Override
	public void move()
	{
		System.out.println("Parrot Flies");
	}
}
class Eagle extends Bird{
	@Override
	public void move()
	{
		System.out.println("Eagle Soars");
	}
}
class Penguin extends Bird{
	@Override
	public void move()
	{
		System.out.println("Penguin Waddles");
	}
}
public class BirdMovement {

	public static void main(String[] args) {
		
		Parrot parrot = new Parrot();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		
		parrot.move();
		eagle.move();
		penguin.move();
		
		Bird[] bird = {new Parrot(),new Eagle(),new Penguin()};
		for(Bird b:bird)
		{
			b.move();
		}
	}

}
