package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String horo = JOptionPane.showInputDialog(null, "What is your star sign?");
	if (horo.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "Although your plan probably is the best one, bend a bit in the name of keeping morale high. Your flexibility will actually make people more amendable to your ideas.");
	} else if (horo.equals("Taurus")) {
		JOptionPane.showMessageDialog(null,"Just put your focus on empowering others to do and be their best.");
	}else if(horo.equals("Gemini")){
		JOptionPane.showMessageDialog(null,"Feedback, even the kind you don't want to hear, can be the catalyst for growth.");
	}else if (horo.equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "You may feel like the only grown-up in the group, or, conversely, someone's heavy-handed approach to authority could incite your inner rebel. Expect power struggles and a cameo appearance of your own control issues, Cancer.");
	}else if (horo.equals("Leo")){
		JOptionPane.showMessageDialog(null,"Fear and anxiety may cloud your thinking when it comes to making a deal. If you're second-guessing your own judgment, hit the brakes.");
	} else if (horo.equals("Virgo")){
		JOptionPane.showMessageDialog(null,"Instead of getting frustrated over a lack of results, add some DIY magic to the equation. By taking matters into your own hands, you'll move out of a passive position and into the driver's seat.");
	}
}
}
