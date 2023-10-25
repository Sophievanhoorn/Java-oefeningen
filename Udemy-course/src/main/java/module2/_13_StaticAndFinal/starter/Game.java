package module2._13_StaticAndFinal.starter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import module2._13_StaticAndFinal.starter.constants.Regulation;

public class Game {

	private String arena;
	private LocalDate date;

	public Game(String arena) {
		this.arena = arena;
		this.date = LocalDate.now();
	}

	public void begin(Team home, Team away) {
//         String formattedDate = this.date.getDayOfMonth() + "/" + this.date.getMonthValue() + "/" + this.date.getYear();
		String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("\n*****************************************************************************"
				+ "\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate + "."
				+ "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n"
				+ "\n - The starting lineup for the home team is: at point guard, " + home.getPlayer("POINT_GUARD")
				+ "; at shooting guard, " + home.getPlayer("SHOOTING_GUARD") + "; at small forward, "
				+ home.getPlayer("SMALL_FORWARD") + "; at power forward, " + home.getPlayer("POWER_FORWARD")
				+ "; and at center, " + home.getPlayer("CENTER") + ".\n"
				+ "\n - The starting lineup for the visiting team is: at point guard, " + away.getPlayer("POINT_GUARD")
				+ "; at shooting guard, " + away.getPlayer("SHOOTING_GUARD") + "; at small forward, "
				+ away.getPlayer("SMALL_FORWARD") + "; at power forward, " + away.getPlayer("POWER_FORWARD")
				+ "; and at center, " + away.getPlayer("CENTER") + ".\n"
				+ "\n - Let's give a warm round of applause for both teams as they take the court!"
				+ "\n*****************************************************************************"

		);
	}

	public String details() {
		return "\nArena: " + this.arena + "\nDate: " + this.date.toString() + "\nCourt length (feet): "
				+ Regulation.COURT_LENGTH + "\nRim height (feet): " + Regulation.RIM_HEIGHT
				+ "\nDistance from three-point arc: " + Regulation.THREE_POINT_DISTANCE
				+ "\nPoints awarded beyond the three-point arc: " + Regulation.BEYOND_THREE_POINT_ARC
				+ "\nPoints awarded inside the three-point arc: " + Regulation.INSIDE_THREE_POINT_ARC
				+ "\nPoints awarded from a free throw: " + Regulation.FREE_THROW
				+ "\nLength of each quarter (minutes): " + Regulation.QUARTER_LENGTH
				+ "\nSeconds to attempt shot after gaining possession: " + Regulation.POSSESSION_TIME;
	}

}
