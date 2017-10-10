/**
 * COSC 210-001 Assignment 6
 * Receiver.java
 * 
 * This class represents a Receiver which is a subclass of the super class
 * player. This class has the attributes receptions and yards
 * 
 * @author Nathaniel Churchill
 *
 */
public class Receiver extends Player {
	private int receptions;
	private int yards;

	public Receiver() {
		super();
	}

	public Receiver(String firstName, String lastName, String team,
			String position, int receptions, int yards) {
		super(firstName, lastName, team, position);
		this.receptions = receptions;
		this.yards = yards;
	}

	// getters
	public int getReceptions() {
		return receptions;
	}

	public int getYards() {
		return yards;
	}

	// custom Methods

	/**
	 * This methods returns the number of yards / receptions
	 * 
	 * @return double
	 */
	public double yardsPerReception() {
		return (double) (yards) / receptions;
	}

	/**
	 * This method returns the average yards per game yards / 16 (assume 16
	 * games)
	 * 
	 * @return double
	 */
	public double yardsPerGame() {
		return (double) (yards) / 16.0;
	}
}
