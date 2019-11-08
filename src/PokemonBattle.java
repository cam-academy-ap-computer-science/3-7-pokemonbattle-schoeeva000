/* PSUDOCODE
 * 
 * MAIN
 * call battleStart, save the pokemon name return as a string
 * call damage, passing in the name and saving the damage from the return
 * 
 * 
 * BATTLESTART
 * Output an intro and prompt for the pokemon's name
 * prompt for the rest of the stats and save them in variables
 * call damage, passing in the name and saving the damage from the return
 * 
 * DAMAGE
 * take in the stats from battlestart to use in the equation
 * Modifier = STAB * math.random(between 0.85 and 1.0)
 * Damage = (((2*level+10)/250 + (attack/defense)*base + 2)*modifier
 * return the damage value
 * call tableStats, passing in all the stats
 * 
 * TABLESTATS
 * print out stats, having taken the new hp value
 * 
 */

import java.util.*;

public class PokemonBattle {

	public static void main(String[] args) {
		Scanner userJunk = new Scanner(System.in);

		String name = battlestart(userJunk);
		damage(name, userJunk);			//CHANGE back from double if only requires int
		//I would normally call statsTable() from here, but I don't know how to
		//return multiple parameters from damage.  Instead, I am calling it from damage,
		// and passing in the stat parameters directly.
	}
	
	public static String battlestart(Scanner userJunk) {
		System.out.println("Welcome to Pokemon Battle! Type \"yes\" to continue...\n");
		String useless = userJunk.nextLine(); 											//this part is really useless, just a way to separate the intro from the rest
		
		System.out.println("What is the name of your pokemon?");
		String name = userJunk.nextLine();												//get the name and store it
		
		System.out.println("\nBy the high earthworm activity under the nearby oak trees,\n" + name +" senses that another trainer is issuing a challenge!\n");
		System.out.println("Zebstrika appears next to " + name + " in a clumn of blue smoke!\n");
		System.out.println("Will you try to negotiate or take him on?");
		useless = userJunk.nextLine();													// also useless, just for fun!

		System.out.println("\nShutting out all other thoughts, " + name + " takes out his \nwhite glove and smacks Zebstrika in the face! The battle is on!\n\n");
		
		System.out.println("Zebstrika used a solid punch to knock out a molar!");
		System.out.println("");
		
		return name;
	}
	
	public static void damage(String name, Scanner userJunk) {
		
		//collect the stats for the pokemon
		System.out.println("Trainer, what are " + name + "'s stats?");
		System.out.print("Level: ");
		int level = userJunk.nextInt();
		System.out.print("Attack: ");
		int attack = userJunk.nextInt();
		System.out.print("Defense: ");
		int defense = userJunk.nextInt();
		System.out.print("Base: ");
		int base = userJunk.nextInt();
		System.out.print("STAB: ");
		int stab = userJunk.nextInt();
		System.out.print("HP: ");
		int hp = userJunk.nextInt();
		
		double modifier = 0.85 + (Math.random() * 0.15);		//do calculations
		double damage = (((2 * level + 10) / (250)) + ((attack) / (defense)) * base + 2) * modifier;
		
		System.out.println("\n" + name + " sustained " + (int) damage + " points of damage from the lost molar!"); // print damage and resulting hp
		System.out.println("HP, after damage, is " + (int)(hp - damage) + "\n"); // I am casting these values to ints to keep it simple
		
		statsTable(name, hp - damage, level, attack, defense, base, stab);
	}
	
	public static void statsTable(String name, double newhp, int level, int attack, int defense, int base, int stab) {
		System.out.println("* Name		---+---		" + name);
		System.out.println("* Level		---+---		" + level);
		System.out.println("* ------------------------------------------");
		System.out.println("* HP		---+---		" + (int)newhp);
		System.out.println("* Attack	---+---		" + attack);
		System.out.println("* Defense	---+---		" + defense);
		System.out.println("* SP. ATK	---+---		121");	//I don't know what these values are,
		System.out.println("* SP. DEF	---+---		81");	//so I am just using the ones in the example
		System.out.println("* Speed		---+---		107");  //Also, this value was never asked for, using the default
		
	}

}
