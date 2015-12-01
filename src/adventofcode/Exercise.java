package adventofcode;

/**
 * An abstract Exercise class which is able to run and kill calculations needed for a specific exercise. All calculations are run on a separate thread.
 * @author Alexx
 *
 */
public abstract class Exercise extends Thread implements Exercisable {
	
	private boolean running = false;
	
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
	 * Calculates this exercises' assignment.
	 */
	public abstract void calculations();
	
	/**
	 * Outputs the calculations will give. The exercise is killed after an ouput has been generated.
	 * @param out The object that should be written out to the console.
	 */
	public abstract void output(Object out);
	
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

}
