package adventofcode.day3;

import java.util.ArrayList;

import adventofcode.Exercise;
import adventofcode.day3.utils.Vector2D;

public class Presents extends Exercise {
	
	//output set to one because santa also delivers a package on his starting position
	private int output = 0;
	
	private Vector2D currentPos;
	private ArrayList<Vector2D> visitedHouses;
	
	public Presents() {
		
		this.setInput("v>v<vvv<<vv^v<v>vv>v<<<^^^^^<<^<vv>^>v^>^>^>^>^><vvvv<^>^<<^><<<^vvvv>^>^><^v^><^<>^^>^vvv^<vv>>^>^^<>><>^>vvv>>^vv>^<><>^<v^>^>^><vv^vv^>><<^><<v>><>^<^>>vvv>v>>>v<<^<><^<v<>v>^^v^^^<^v^^>>><^>^>v<>^<>>^>^^v^><v<v>>><>v<v^v>^v<>>^><v>^<>v^>^<>^v^^^v^^>>vv<<^^><^<vvv>^>^^<^>>^^^^^v^<v>vv<>>v^v<^v^^<><^<^vv^><>><><>v>vvv^vv^^<<><<vvv><<^v^><v<>vvv^<^>vvvv^>^>>^v^<v^vv<^^v<>v>vv^<>><v<<<^v^<<><v<^<^<><^^^>^>>v>^>v^<>v><^<^<v^>^^vv<^^<>v^v^vv<>>>>v^v<>><^^v>vv^^>v^v>v<vv>>v>><v^v^v>vv>^^>^v><<vv^v^^vv<^v><^<<v<v^>vv^^^<v^>v>v^^^>><^^<v^<^>>v><vv<v^^>^^v>>v^^^<^^v>^v>><^<^<>>v<<^^vv>^^^v<^<^<v<v^^vv>^vv^>>v^><v>><<<>^vv^<^<>v^^<<<v<^>^><><v^^>>^^^<^vv<^^^>><^^v>^^v^<v^v^>^^<v>^<^v<^<<<<^<v^>v^<^^<>^^>^><<>>^v><>><^<v><^^^>>vv>^><vv>^^^^^v^vvv><><^<^>v>v^v^>^><><^<^><>v<<vv<^>><>^v^^v>^<<<>^v^>^<<v^vv<>v^<v^^vv><<v^<>>>^<v>vv>v>>>^<^>><vv<>>>>v<v>>>^v>v><>>vvv<^^><<^>^>v<^vvvv<v><vv<><^^^v^^^>v^v<>v<^^v>>><>v<v^>>v><v^>>^^<v<<<^<v<><^^v><<v^><<<<^vv<^<>^><vv<<<<^>>>^v>^v>vv>^v<>v>v<v><^>>v>>^>^><^<v^v^>^v<><><^^>^<vvvv^^<>^^^>vv^v^v>^v^^v^^v><v^<^<>><^<v>v>>vv<<v>>vvvv<vv><>>^v^>^>>v^v^<<<vv<><v<<>>>^v<<v>^^vv^><>v>^>v><<<<<<<^>^^v^<<^^>>vvv^<><>><>^^v<<vv><^^v<^^><vv>v^>>>v^v><v^v<^>v^><>v<<>v>^^v><<<<><^v^v>>^<>^<<>^<v<<>>v<<>><^<<<<^v>^<^v>v>vv<v<v<<>^>v<^<<>v^<vvvv^>v>><<v><v<>v>v>>v^vvv^^>>>v^<^<<^^<<<><v>v^<<v<<<>v<^^<><v<v^^<v>^>v>>v<>^>^^>>^v<<>v^^^>>>^vv<^v<v>^>v>^><>v^^<>^^v^^vv^<^>^<<>><<^>^v>>><<<vvvv><<><v<^v^v<vvv^<><<^<vv><v^v^v^>v>v^<vvv^><^><^<vv><>>v^>^^^<>><v^<^^^<>v<<v<^v>>>^>>v^><<>vvv><^>>v><v><>v>>^>v><<><<>^<>^^^vv><v^>v^^>>^>^<^v<v<^^<^vvvv>v<v>^>v^>^><^<vvvv><^><><<v<>v<v^><^<v^>^v^^<<<<^><^^<^><>>^v<<^<<^vv>v>>v<^<^vv>><v<vv>v<v<v>^v<>^>v<>^v<<<v>>^^v>>><vvv>v^>^v^v>^^^v<vvvv>><^>vvv^<vv^^vv><<<>v<>v>^<vvv^<^<v<v<^vv^^>>vv^<^^v^><^^^^^v<^<v<^>>>vv^v^>^<v>^<><v^<^v>>><^v^<<v<<v<>v>^v<v^v>>^^v<<v<v<<>>>vv>>^v>>^<<<<^><<<><^^>>v<>^vvvv>v^^^>^^^>^<vvvv><^^v<v<>v<^v^v<<v^^^v^<v<^v>v^^<>^>^<^v>vv<v^vv<^<<>v><<^><><^^v<<><^^><>^v>^<><<^<^^<<>vv<>^^<<^>><<<>>vvv>^>v^^v^><<^>v>^>^<^<<>v<^>vv^v^v<>vv<<v>vv<vv><^>v^<>^vv^v^<v<^>>>>v^v><^<><<>vv^<vvv^>>vvv^>v>>><^^vv<vvvv>v<^<^>>^^>^^vv>>><^v<>^v^<<>v^^^<v>^>>^<^<v>>^v<^^^<v>^v>^>>v<vv>>^<v^<<>>^>>><v>v^<<^<v>>^<<^^<>v<^v<^<>v^v>^^v<vvvv>^vv>vvv>v^<^>><v^^vv<<<^>vvvv<>>^^<>v^<><>v<^<>v<>^>v<>vv<v^v>>v<v<^<v^^v^vv^vvv><^^>v>><>>^<^^<>>^>^<v^>>vvv^v><v>>^>^>v><><<><vv^v>v<>^v<^vv^^^<>^^<<^^^v<>><v<^<^<^<^^><v^v<^>v^>vvvv>^^v^>^<v<^^^>>^<<vv^<><><^^^^<<>^<><v>vv^<><^>^^<>v^<>>>v><>vvvvv>v>v^^>^<<vvvv<>vv>>v<<^<>^^^v^<><>>^<<<v<v<>>>><><v>v<v<>>^>^^^^vv^^<<><^^<<vv<^<>v>vv<v<><<<^<<v<<<<>v<>>^<^>^>><v>v>><^^<>><<<><<><v^^v<<><^<^v<v^><^^v<<>><<<<^>v^<v>><v^><v<vvv>v^v^<v><<>>v<><<v>^<>><>>^><>v^v>v<<>v<>v^^><<>>>v<<>>>>^>v>><v<<>>>vv>v>^<^^^<>v<v>^<^^v^vvv^>vv>^<v><vvvv>^<<>vvv<<<vv>^^<^>^>>v>v<<<<<>^^vv^>>v>^<^<v^v^>^v>>v>^v<><>^<^>v>v<<<^^^v>^<<<>vvv^v^^>^>>^>v>v<>^^><>>v>^>v<<<^^^v^<v^vv>><><^<^<><vvv<v^>>^v>vv<^v<<^vv>v^<<v>v>v>^v^>^v<<^v^vv>v<v>^<<><v^>>v<>><v<<<^v<<>vvv^<vv<vvv<<>^vv^^v><^>v^vv<<v^<<^^^<^<>^^<<>v<><<v>^><>^<><<v<v^^>vv<>^<v<^<vvv>vv>v><^^v<>><^v^v><><>><v<v>vv<>>><v^^v<>><<^>>><^^^vvv<<<vv<<^v<<<>><<vv>>>>v<<<<<vv><><v>v^^<<^vv^<vv<>>vv>^<>^v^^<>^^^vv>v^^<v<><v>v<v>>^v<v<>>^<v^^><>v^^^>v^^v<vv><^>v^v^<>v>v<v<^^>>v<^^vv^v<^^^^vv<<><<^>>^^<<v^^<<^>v^>>^^^><^^>^v^v>^<<v<vv<<<v<^^^>^>>^v<>^<^>v>^>^v^<^^^<^vv<v><^^>>v<v>^>^v^>>>>^v>^^<<^<v^v<^<<v<<^><^^<v^<><v>v^<<v^^<><<>>><vv<<><>^<>>>v<<v^^^v^^<<<vv<<^<^<^vv^<><><<^^<^^>v^>^<v<>>v^v<><<v>^^v>^<^<vvv<v>v^v>>>^^<^<v^>^vv<<<v<<>^><><^<>v>>>v<v^<>v>><^^^v^^^v<^^<vv^^^>v>v<>>^^<><>v>^<v<>^>>>><>v>^v>^vv^v<vv<<^^>><v<>^>^^<v<^>^<vvv>><>^<<>>><<<><>^^<<<v<>v^>v>v<v>^^^>^>^v<<>v>vv>><<<v>^^<v><vv<<v^^>^>>^><^>v<^<^v>><^^>v<vv^^><><>^><<><>v^>v<><^^>><>^<^^v<^<<v>><v><<<^^<<v<^vv^v<>><>>>^>v<vvv^>^<><v^><^<<^vv<^v^v^v<>v^^v>v^<^>^vv^>>><<>v^vv^<>^v^><<v^v<v>v^<><>>v^v^><>v^vvv^^^<<^<<v<<v<^vv^>>v^v>^^<v<>><>v>>v^<>^>v>^>><<>v^v><^v>v>>><v<v><^<^^>vv<v><^>^<^>^^v><><v<^^v<<><^<<v^<v<<><^^vvv^v>^>^<>>vv>v^^v^^vv<^^>><v^^vv><^v>v^<<v<^v>vvv<>>^v><<>^v<<<>^><^vv><<^^<v^>v<<v>^vv<>^v>>>><<<<^^<^v>^<^^<^<^^>>^^v>^^^^v^^^<<>^^vv<<v^^><v>><^<<><>^>v<>>v^^^>^v^^v^<v^v>v>>>>>^v>^>^^<vvv^^<v^<<<v<<>v>><^^^v<<^^<v>>^<^<^><^<<v^v><<vv<^<>>v>v>^v<><<v>^>vv^v<v>v><^<v>><>^<vv<v^^^^v<^^>><<^^>v>v>^^^<>v>^v^^>vv^vv<^^>><>^>^<>v>><>^v<<v>v>^><^^^v^<vv><<^v^>v^>vv>v^<>v><vv><^v>v<><v^v^v<^v<>^v<v^<<><<v>>^v><v>^^<>vvv^>^<<v^>><^>><^<>^v<v<v<^vvv<><<^v^<v>><<<v>^<^<v>v>^vv^v>v<^^vv<<vvv^<v>><>vv^>v<<>v<vvvv>>v>^^>>><<<^>^vv>><v>^^^>v<^vv<>v<<<v<<<<v>>>>^<^^^^>v<^^<><v>v>v<v^>vv^>v>v<^>^v^<>v>>vvv>^^><^vvv>><>>>^<<^<v<>>>v^^><v<v>>^><>v<^^v^<<v><>^<>>><^v^v>>>^vvvv^<><<<v<^>>v>^v^<v<v<<^<<v^vv^v>v<v<>>v<v^<<<><v^>><^<<^>^^><v>v<^v^<^>v>^<<v>v^<>v^<>vv^<>^>^>v^>^vv<>^^<<>>v<>^v<><v^><><<<vv>v>v^>vv^><<<<v>^v<><>^^<vv>v^^v^^^<v<^^><v^v<>><v<vv>^<>>><vv<^v<<>>^><>>v<v^v^>>>v<<>v<<<<<<<^v<<^^^v<^v<>v^^<<<^<>>v^vv<v>^<^^<^^<<^>vv><^<^^v<<<^><^v<^><>v<vv^>^v^^>>><<vv^^v><^<<^<>>^>>^<<<<v^vv<>>>v>^v>><>v>>v>><>v>><^^><v>^^vv<^^<^>vv><<^>><<><v>^vvv><^v^>vvv^>>^<><^>^<<>>v^v>v<<>^>>^>v<^^<^<<>^^v<vvvvv^^^<^<>^^v>v<>^<^^<<v>v^^vvv^^v>^vv<v^>^<>v<^v^>^<v><v<<<^v<v<v^^<vvv>vv<<vv>v^<<v<^<vv><^>^><^^<^^<<v^^<v^v<v^^^^>^>vv^<>^<>^>^^<^v><<<^>vv^vv>v^v<>^^v^<^^^vvv^><v^<v^^<v<>v^<><>v>vv<^v^>>^v<^^vv>vv>^>><<<<v^^<^><>^><>>v<>>v>^v<^vv>^^>^<^<<v^>>v^v<^^v<vv<^<><^^>^^<>^^^<vv<v<<^^>^>^vv<^>><^<vvv^<>>vv^><v>v^>^vv>^>v^^<>>^v<>>v<^>^v>vv^<vv<^^>>^<v>>>>vvv>vv>^><^v<<<>^^v>v^v<^^^v^^>^><<^^>^<v>><^^^^^<v<vv<v<^<>^^<^v<^>>vv>>^v^vv<>><>^>>>^<v>^^^^><^<<<v<>^v<><vvv^<^^>vv^>>v<vvvv><v^v><^vv<^v<><vvv<vv>v<>^v^<<>>>>v^^>^vv<<vvv<^^><v><><<>v^v<^<^>><vv>^^><^>^><<><v<^v^><^<><>vv>>>>^><<^^^<^v^>^>^^>^<^><v><^^<^^<>><><v>><<<>^>^^v<>^<<<v>>vv>^>>^>^<>>vv<^^vv<>v<>^^>^v<v^^^^v<>^<v>v^v>^^^<v>v<<<^vv^><>^<v>>^^vv>v^<<^><>>vv^^^^^>v>>v<<<>^<vvv<<><><^v<^v<^>^<>^vvv>^>v><<<vv<>v>vv<v<<v>^<^^>v^v>^<^v^<<vvv^^<>^v<<^>^<><>^^<>>^^<^v^<^<v<><<^><v<>v^^>v^v^^^<^v<<^v>^>>^^^^^><<<vv^>>v^><v^^vv><>v^^<^v<^<v^^><<v>v^^^><^^^><<<<<>^<<^<>>v<<v^v^^v<<>^<vv>>><^^^<>>>>vvv>v<>>>v^v^v<^<<^>^<<>v>>^>^^><^><<^v^^<^<>v^v>vv<>>>>>>v<<><v^<v<>>^^>v<<<>^<<v><^><<^v>vv>>>><><>v^<^v><v^<<<<^v><^>v>>^^^v<^>>^>>v<<^<<>vvv>>^v<>>^v><<<^v^v<><v>^vvv<v<v>^^^<><vv^<<>vvv<v<^^v^^><v<^v<^v^<v<^>^^^>>v>^<v^>>^<><<><vv<>vv>^v^>>^<<v<^^v>v<v<vvv>><><<><vvvvv<^v<^>^^><>^<<>^v<<>>v^vv<<>^^v^v^v><^>v>v<^<<^<^>vv>^v<<^>^>>v^<<v^>v^^v^^<v^v>>><vv><<<>^v>><><v<vv<^>v<>><^v>^^v<<<<^v^vv<<<<><><^<^<^v><<^^v^<<<<<^^><^^>vv<v<^<v>v<^><><v<>vvv^<vv>v^>^>^^^v<<^<^^>vv<v^v^v>^vv^><^v^<<>v<^^>^vv<<>^<<><^>v^<<^<>v><><>v<<^^><^^^v>>v>^vv<v^>>^v^^<><<<<<^>^v^<^<^^>^vv<^>v^^v^<>v<><v>v^v>vvv><><<><>vv<vvv^v>^^>^^^<><^>^^^>v<vvvv<>vv<v<v^^>><>v<>>v^>v^^vv^>v>>><v<<<<v<^v>><^^>^v^v<v^v^^^vvv>>>vv<^>><<<^>><^<^>^<^>^>>v^<^<>^<^^<><vvv^^<>^<>>><<v>^<^<v<<><^<<^><^^>vv<>^^><v^v<vv<^<vvv<<^>v^>>v>>>v<<^vv^<><>>>^^<^v^>>^>>><<v<<^<vv><^<>^>>^v>>><^^^<<<vv<<v<v>^vv><><<>^^^<>^<vv^<^<<v>^^><vv>><>>>^>vv>^<^<>>^<^^><v>v^><v>vv><><>>><><<^^v<<^v<v>vv<><><<^v>^v<>^<^^^v^>^<^><^v>v>^v<>><^^v^^^^^<><v<>>vvv<v^^<>v>>>>^<<><^v>vv>>^^><<><><^^^<^<^<<^v>^^^><v>>>>><<v<v>v^^^<>>v<vv<^<>v^^^v<><^>v>><<><>v<^><<>>><>v>^<>>^>v^v<<<<>^<v^vv^>vv<<><v^vv<v<v<<>>>>>vv<><>^<^v>vv^<<v<^v^^<<^<<^^v^>>><<>^<>><^>>><v<>><<>^^>><<<^^^^^v>>^<<>>vvvv<^v<v^^<^>^vv<vv<>v<<<^><>>>>vv^<^v>v<^<>^v>>^<^^v^>>><>^^<^v>>v<<>vv<vvvv<>vv>^><>v^<>^<<^vv<v^^v<vvvv><^>>^v^>^^<<<^>>^^>^<^^<^<<<v^<^^v<<vv^<<^^^vv><v<vv^>v^^v<v>^^<^v<^>>><<>vv<<^><<v^v^^^v<vv>^>vv<^>>^<v<>vv>>>^>>><<v<^<>^<<<>>^<<>><^<<^^^>>v^^>v<<<>v>v>v<v<^>^<>>>^vvv><<^^<<><v<><^<v<vvv>v>>>>vv^^v<v<^<^><v>^v<<v<vv>>v>v<<<<><<>vv<><^^^<>>v<v<vvv><v^<vv^>>><v^^<>>>^^<><^<^v^><vv>>^^v>^<<v^>v>^^>^v^<v<^<v^v><>>v^^<^v^^<<>^^>v^^>><<<<^<^^v>^^v>v<<vv^^vv>^>v^<v<v><>vv>>^<v^v^<v<^>^v>v^^>vvvvv<v><<>vv>vvvvvv>>v>>^^^<v>vv^^><<v>>v^^^^v>vv>v<^v>>>>^>^><v^>^<v<vv>v>^>><v>><<>>^vv<vv^^<^^>>>>><><<^<v<><<v>^><^vv^v>>>>>v>^>^<vv>^v^>v<^v^<^<<vv<<>v<>>^vv<<>^v^v>><><<>>v^^<<>^^<v><>v<<^^<^^>^^>^<^><>>v<>>^^<^>><<<v<>>>^v^>v>v<<^^<<^>v<v^>>v^^v^^<<>^v>v><v^>v<^^>^<vv><vv^<>v<><^<<<vv<<v>v<^<<<<^^>v^v^^><<><^^^<v>v^^>>>vvv><>vv<>>^^v^v<<^>v^^v^>vv>^<<v<^<v^>^^<<v<^^>^v^^<^^v<<>>vv<^>>^><><>v>>v<>^<v^^><<>>>");
		this.setTitle("Day 3 part 1:");
		
		//we set current position to 0, 0 since that is where we start
		currentPos = new Vector2D(0, 0);
		//we want to keep track of every visited house (coordinate)
		visitedHouses = new ArrayList<Vector2D>();
		//add the currentpos to the list since we count the initial starting position as a new house as well
		this.addHouse(currentPos.x, currentPos.y);
	}
	
	@Override
	public void calculations() {
		
		//loop through the entire input, for every character decide where to move next
		for(char c : getInput().toCharArray()) {
			switch(c) {
			case 60:
				moveLeft();
				break;
			case 62:
				moveRight();
				break;
			case 118:
				moveDown();
				break;
			case 94:
				moveUp();
				break;
			}
			
			//after we moved our santa, check if its a new house, if so add it to the visited houses list
			if(isNewHouse(currentPos)) {
				addHouse(currentPos.x, currentPos.y);
			}
			
			//this.write(currentPos.x +  " " + currentPos.y);
		}
		
		//after all is done, count the houses and give us the answer
		output = countHouses();
		
		this.output(output);
	}
	
	private void moveUp() {
		currentPos.y--;
	}
	
	private void moveDown() {
		currentPos.y++;
	}
	
	private void moveLeft() {
		currentPos.x--;
	}
	
	private void moveRight() {
		currentPos.x++;
	}
	
	/**
	 * Determines whether a vector is newly visited coordinate in the infinite plane of houses.
	 * @param vector Check what vector.
	 * @return True when the given vector is an unseen coordinate.
	 */
	private boolean isNewHouse(Vector2D vector) {
		for(int i = 0; i < visitedHouses.size(); i++) {
			if(visitedHouses.get(i).equals(vector)) {
				return false;
			}
		}
		return true;
	}
	
	private void addHouse(int x, int y) {
		visitedHouses.add(new Vector2D(x, y));
	}
	
	private int countHouses() {
		return visitedHouses.size();
	}
}
