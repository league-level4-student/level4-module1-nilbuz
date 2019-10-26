package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "If you had plans for Chic-Fil-A today, you'd better rethink them.");
			break;
		case "Monday":
			JOptionPane.showConfirmDialog(null, "There are 53 Mondays each year. Another 53 reasons why ");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Tuesday is considered an unlucky day in Greek and Spanish culture;"
					+ "the 9/11 attacks, the death of Elvis Presley, "
					+ "and the space shuttle Challenger's explosion on live tv all happened on Tuesdays, ");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "hump day lol");
			break;
		case "Thursday":
			JOptionPane.showConfirmDialog(null, "Second worst day of the week");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Rebecca Black wrote a horrible song about this day of the week.");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Tied for best day of the week with Friday." );
			break;		
		}
	}
}
