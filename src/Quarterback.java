/**
 * COSC 210-001 Assignment 6 
 * Quarterback.java
 * 
 * This class represents the subclass Quarterback, which extends the Player
 * class and has the attributes of completions, attempts, and yards.
 * 
 * @author Nathaniel Churchill
 *
 */
public class Quarterback extends Player {
	// attributes
	private int completions;
	private int attempts;
	private int yards;

	// constructors
	public Quarterback() {
		super();
	}

	public Quarterback(String firstName, String lastName, String team,
			String position, int completions, int attempts, int yards) {
		super(firstName, lastName, team, position);
		this.completions = completions;
		this.attempts = attempts;
		this.yards = yards;
	}

	// getters
	public int getCompletions() {
		return completions;
	}

	public int getAttempts() {
		return attempts;
	}

	public int getYards() {
		return yards;
	}

	// Custom Methods

	/**
	 * This method returns the ratio of completions to attempts
	 * 
	 * @return double
	 */
	public double percent() {
		return (((double) completions) / attempts) * 100;
	}

	/**
	 * This method returns the number of yards / attempts
	 * 
	 * @return double
	 */
	public double yardsPerAttempt() {
		return ((double) yards) / attempts;
	}

	/**
	 * This method returns the average yards per game yards / 16.0 (Assume 16
	 * games)
	 * 
	 * @return double
	 */
	public double yardsPerGame() {
		return ((double) yards) / 16.0;
	}

}