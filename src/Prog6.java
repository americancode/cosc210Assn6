
/**
 * COSC 210-001 Assignment 6
 * Prog6.java
 * 
 * This program calculates and reports statistics from a text file 
 * It gives total statistics as well as averages and other ratios
 * 
 * @author Nathaniel Churchill
 *
 */

import java.util.*;
import java.io.*;

public class Prog6 {

	public static void main(String[] args) {

		Player[] players = new Player[30];

		// try-catch block for the scanner and file
		Scanner inFile = null;
		try {
			inFile = new Scanner(new File("nfl.txt"));

		} catch (FileNotFoundException e) {
			System.out.println("File not Found: " + e);
		}

		// loop for filling the array of players
		try {
			int counter = 0;
			while (inFile.hasNext()) {
				String firstName = inFile.next();
				String lastName = inFile.next();
				String team = inFile.next();
				String position = inFile.next();

				if (position.equals("QB")) {
					players[counter] = new Quarterback(firstName, lastName,
							team, position, inFile.nextInt(), inFile.nextInt(),
							inFile.nextInt());
					counter++;
				} else if (position.equals("WR")) {
					players[counter] = new Receiver(firstName, lastName, team,
							position, inFile.nextInt(), inFile.nextInt());
					counter++;
				}
			}
		} catch (Exception e) {
			System.out.println("File input error: " + e);
		}

		//close the file
		inFile.close();

		// Output

		System.out.println("NFL 2015 Player Passing/Receiving Statistics\n");

		System.out.println("Quarterbacks\n");
		System.out.printf("%-20s%-7s%-7s%-7s%-7s%-7s%-7s%-7s\n", "Player",
				"Team", "Comp", "Att", "Pct", "Yds", "Yds/A", "Yds/G");

		for (int i = 0; i < players.length; i++) {
			if (players[i] instanceof Quarterback) {
				System.out.printf("%-20s%-7s%-7s%-7s%-7.2f%,-7d%-7.2f%-7.2f\n",
						String.format("%s, %s", players[i].getLastName(),
								players[i].getFirstName()),
						players[i].getTeam(),
						((Quarterback) players[i]).getCompletions(),
						((Quarterback) players[i]).getAttempts(),
						((Quarterback) players[i]).percent(),
						((Quarterback) players[i]).getYards(),
						((Quarterback) players[i]).yardsPerAttempt(),
						((Quarterback) players[i]).yardsPerGame());

			}
		}

		System.out.println("\n\nWide Receivers\n");
		System.out.printf("%-20s%-7s%-7s%-7s%-7s%-7s\n", "Player", "Team",
				"Rec", "Yds", "Avg", "Yds/G");

		for (int i = 0; i < players.length; i++) {
			if (players[i] instanceof Receiver) {
				System.out.printf("%-20s%-7s%-7s%,-7d%-7.2f%-7.2f\n",
						String.format("%s, %s", players[i].getLastName(),
						players[i].getFirstName()),
						players[i].getTeam(),
						((Receiver) players[i]).getReceptions(),
						((Receiver) players[i]).getYards(),
						((Receiver) players[i]).yardsPerReception(),
						((Receiver) players[i]).yardsPerGame());

			}
		}

	}

}
