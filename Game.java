import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		Character[] gamePlayers = new Character[3];
		gamePlayers[0] = new Bob();
		gamePlayers[1] = new Alice();
		gamePlayers[2] = new EvilTom();
		for(Character t:gamePlayers) {
			if(t instanceof Player && flag == false) {
				System.out.println("Would you like to be "+t.getClass().getName()+"?");
				String answer = input.nextLine();
				switch(answer) {
				case "y":
					System.out.println("You are now "+t.getClass().getName()+"! Please enter the following details to your character!");
					System.out.println("What is your name?");
					String name = input.nextLine();
					((Player) t).setName(name);
					System.out.println("How old are you?");
					int age = input.nextInt();
					((Player) t).setAge(age);
					System.out.println("How many bullets do you want to have?");
					int bullets = input.nextInt();
					((Player) t).setBullets(bullets);
					flag = true;
					break;
				}
				}
			}
		do {
			for(Character i:gamePlayers) {
				if(i instanceof Player) {
					System.out.println("Hello "+i.getClass().getName()+"!"+" Here is your status \n"+i.toString());
					System.out.println("What would you like to do?");
					System.out.println("1)shoot\n2)reload\n3)sleep");
			    	System.out.print("Enter an integer: ");
			    	int number = input.nextInt();
			    	switch(number) {
			    	case 1:
				    		System.out.println("Hi "+((Player) i).getName()+" Who would you like to shoot at?");
				    		for(Character j:gamePlayers) {
				    			System.out.println(j.toString());
				    		}
					    	int attackChoice = input.nextInt();
					    	switch(attackChoice) {
					    		case 1:
					    			if(i instanceof Alice) {
					    				((Alice) i).fire();
					    				System.out.println("BOB");
					    				
					    			}
					    			else if(i instanceof Bob) {
					    				((Bob) i).fire();
					    				System.out.println("himselfy");
					    			}
					    			break;
					    		case 2:
					    			if(i instanceof Alice) {
					    				((Alice) i).fire();
					    				System.out.println("herself");
					    			}
					    			else if(i instanceof Bob) {
					    				((Bob) i).fire();
					    				System.out.println("Alice");
					    				
					    			}
					    			
					    			break;
					    		case 3:
					    			((EvilTom)i).health--;
					    			break;
					    	}
				    		break;
			    		}
			    	}
				}
			}while(flag);
	}

}