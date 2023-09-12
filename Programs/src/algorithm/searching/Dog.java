package algorithm.searching;

public class Dog extends Animal{
	
	public void run() {
		
		System.out.println("Dog is running");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog a=(Dog) new Animal();
		a.run();
		a.crawl();
		
		
		
	}

}
