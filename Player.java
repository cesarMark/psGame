
public abstract class Player extends Character {
	public Player() {
		System.out.println("Created a new Player");
	}
	public abstract void setAge(int age);
	public abstract void setBullets(int bullets);
	public abstract void getAge();
	public abstract void setName(String name);
	public abstract String getName();

}
