package adventofcode;

/**
 * An abstract Exercise class which is able to run and kill calculations needed for a specific exercise. All calculations are run on a separate thread.
 * @author Alexx
 *
 */
public abstract class Exercise extends Thread implements Exercisable {
	
	private String title = "Unnamed exercise";
	private boolean running = false;
	private String input = "";
	
	public void execute() {
		this.running = true;
		start();
	}
	
	public void kill() {
		this.running = false;
	}
	
	/**
	 * Sleeps the thread it is currently running calculations on.
	 * @param millis Milliseconds the thread should wait.
	 */
	public void pause(int millis) {
		
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Implements the run() method of the Thread object.
	 */
	public void run() {
		while(this.isRunning()) {
			this.calculations();
		}
	}
	
	/**
	 * A helper method for easy access to the console.
	 */
	public void write(String text) {
		System.out.println(text);
	}
	
	/**
	 * Calculates this exercises' assignment. And output the answer to the console.
	 */
	public abstract void calculations();
	
	/**
	 * Outputs the out object to the console. The exercise is killed after an output has been written.
	 * @param out The object that should be written out to the console.
	 */
	public void output(Object out) {
		//we write our output to the console
		this.write(this.getTitle() + " " + out.toString());
		//and we kill the exercise
		this.kill();
	}
	
	/**
	 * Indicator wheter or not the exercise is running.
	 * @return A boolean, true = running, false otherwise.
	 */
	public boolean isRunning() {
		return this.running;
	}
	
	/**
	 * Sets the running flag for this exercise.
	 * @param running
	 * True or false.
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

}
