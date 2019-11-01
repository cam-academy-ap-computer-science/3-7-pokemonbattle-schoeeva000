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
public class PokemonBattle {

	public static void main(String[] args) {
		
	}
	
	public static void battlestart() {
		
	}

}
