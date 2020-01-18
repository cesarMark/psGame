
public class Bob extends Player implements action{
	public String name;
	public int age;
	public int str;
	public int bullets;
	public int health = 10;
	public Bob() {
		// TODO Auto-generated constructor stub
		System.out.println("Created Bob!");
	}
	public void setStrength(int str) {
		this.str = str;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return str;
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
		return "Character : Bob\nPlayer's name: "+this.name+"\nPlayer's Age: "+this.age+"\nPlayer's health is "+this.health+"\nPlayer's strength is "+this.str+"\nNumber of bullets "+this.bullets;
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("BOOM BOOM!!! "+this.name+" ,THAT IS BOB IS SHOOTING:");
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
