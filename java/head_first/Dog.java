class Dog {
	int size;
	String name;

	void bark(){
		if(size > 60){
			System.out.println("Woof! Woof!");
		} else if(size > 14){
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}

class DogTestDrive{
	public static void main (String[] args){
		Dog one = new Dog(); // creating a Dog object
		one.size = 70;       // using the dot operator to set the size of the Dog
		Dog two = new Dog();
		two.size = 8;
		
		Dog three = new Dog();
		three.size = 35;
		
		one.bark();          // calling its bark() method
		two.bark();
		three.bark();
	}
}
