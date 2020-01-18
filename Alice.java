
public class Alice extends Player implements action{
	public String name;
	public int health = 10;
	public int age;
	public int str;
	public int bullets;
	public Alice() {
		System.out.println("Created Alice!");
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}

	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		System.out.println("The age is "+this.age+"");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String toString() {
		return "Character : Alice\nPlayer's name: "+this.name+"\nPlayer's Age: "+this.age+"\nPlayer's strength is "+this.str+"\nNumber of Bullets: "+this.bullets+"\nPlayer's health : "+this.health;
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("BOOM BOOM!!! "+this.name+" THAT IS ALICE IS SHOOTING:");
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return this.str;
	}

	@Override
	public void setBullets(int bullets) {
		// TODO Auto-generated method stub
		this.bullets = bullets;
	}

	@Override
	public void revive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return health;
	}
	
}
