/**
 * COSC 210-001 Assignment 6 
 * Player.java
 * 
 * This class represents a super class with the attributes name, last name,
 * team, and position
 * 
 * @author Nathaniel Churchill
 *
 */
public class Player {
	// Attributes
	private String firstName;
	private String lastName;
	private String team;
	private String position;

	// constructors
	public Player() {
		super();
	}

	// parametized constructor
	public Player(String firstName, String lastName, String team,
			String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.position = position;
	}

	// getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTeam() {
		return team;
	}

	public String getPosition() {
		return position;
	}
}