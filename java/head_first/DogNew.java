public class DogNew{
	String name;
	
	public static void main(String[] args){
		// make a DogNew object and access it
		DogNew dog1 = new DogNew();
		dog1.bark();
		dog1.name = "Bart";

		// now make a DogNew array
		DogNew[] myDogs = new DogNew[3];
		
		// and put some dogs in it
		myDogs[0] = new DogNew();
		myDogs[1] = new DogNew();
		myDogs[2] = dog1;

		// now access the Dogs using the array references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		int x = 0;
		while(x < myDogs.length){
			myDogs[x].bark();
			x = x + 1;
		}
	}
			
	public void bark(){
		System.out.println(name + " says Ruff!");
	}
	
	public void eat(){}
	
	public void chaseCat(){}
}
