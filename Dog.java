package soal2;

public class Dog extends Animal {
	private String skills;
	
	public Dog(String name, String breed, String skills) {
		super(name, breed);
		this.skills = skills;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Memiliki kemampuan: " + skills);
	}
}