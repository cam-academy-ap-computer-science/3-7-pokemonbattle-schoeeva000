/* PSUDOCODE
 * 
 * MAIN
 * call battleStart, save the pokemon name return as a string
 * call damage, passing in the name and saving the damage from the return
 * call tableStats, passing in hp - damage
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
		battlestart();
	}
	
	public static void battlestart() {
		Scanner userJunk = new Scanner(System.in);
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
	}

}
