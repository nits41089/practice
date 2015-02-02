class Dog {
	int size;
	String breed;
	String name;

	void bark(){
		System.out.println("Ruff! Ruff!");
	}
}

class DogTestDrive{
	public static void main (String[] args){
		Dog d = new Dog(); // creating a Dog object
		d.size = 40;       // using the dot operator to set the size of the Dog
		d.bark();          // calling its bark() method
	}
}
