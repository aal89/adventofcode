package adventofcode;

import java.util.ArrayList;

import adventofcode.day1.Basement;
import adventofcode.day1.Floors;
import adventofcode.day2.WrappingPaper;

/**
 * A launcher class for all the exercises given in the advent of code.
 * @author Alexx
 *
 */
public class AdventOfCode {
	
	private ArrayList<Exercise> exercises = new ArrayList<Exercise>();
	
	public AdventOfCode() {
		//add each exercise to the list
		exercises.add(new Floors());
		exercises.add(new Basement());
		exercises.add(new WrappingPaper());
		
		//and launch every single one
		for(Exercise e : exercises) {
			e.execute();
		}
		
	}
	
	public static void main(String[] args) {
		new AdventOfCode();
	}

}
