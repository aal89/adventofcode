package adventofcode;

public interface Exercisable {
	
	/**
	 * Starts the exercise and should generate an output.
	 * @return Output as an Object.
	 */
	public void execute();
	
	/**
	 * Kills the exercise no matter what it is calculating.
	 */
	public void kill();

}
