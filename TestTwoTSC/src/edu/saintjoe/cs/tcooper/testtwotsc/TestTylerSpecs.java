package edu.saintjoe.cs.tcooper.testtwotsc;

public class TestTylerSpecs {

	public static void main(String[] args) {
		TylerSpecs Tyler1 = new TylerSpecs();//create new object
		Tyler1.name = "Jimmy";//set objects name is Jimmy
		Tyler1.setName("Tyler");//change Jimmy to Tyler
		Tyler1.weight = 155;//set Tyler's weight to 155
		Tyler1.setWeight(165);//Tyler went to the gym and gained muscle cause he's a boss
		
		System.out.println(Tyler1.name + "'s weight is " + Tyler1.weight + " pounds!");
	}

}
