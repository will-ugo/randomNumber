import javax.swing.JOptionPane;

public class randomNumber {
	public static void main (String args []) {
		String guess;
		int randomNumber;
		int rangeInt;
		int guessInt;
		String range;
		try {
		range = JOptionPane.showInputDialog("Enter range of Numbers for guess");
		if (range == null) { 
			JOptionPane.showMessageDialog(null, "You quit the program");
			System.exit(0);
		}
		else {
		
		guess = JOptionPane.showInputDialog("Enter a guess between " + 0 + " and " + range);
		rangeInt = Integer.parseInt(range);
		guessInt = Integer.parseInt(guess);
		randomNumber = (int) (Math.random() * rangeInt);
		
		if (guessInt == randomNumber) {
			JOptionPane.showMessageDialog(null, "Congratulations, You have guessed correctly!");
			System.exit(0);
		}
		if (guess == null) {
			JOptionPane.showMessageDialog(null, "The program has ended!");
			System.exit(0);
		}
		else if (guessInt > randomNumber)
			JOptionPane.showMessageDialog(null, "Incorrect, You guessed high!");
		else
			JOptionPane.showMessageDialog(null, "Incorrect, You guessed low!");
		
		JOptionPane.showMessageDialog(null, "Number generated is " + randomNumber);
	
	}
}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "The program has ended!");
		}
	}
}

