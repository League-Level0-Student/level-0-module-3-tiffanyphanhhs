package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog(null, "Are you happy?");
		if (happy.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		if (happy.equals("No")) {
			String want = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if (want.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
	}
}
