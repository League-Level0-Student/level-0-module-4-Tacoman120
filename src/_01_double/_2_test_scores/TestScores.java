package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog(null, "Enter your test score.");
	double s = Double.parseDouble(score);
	if(s > 90) {
		JOptionPane.showMessageDialog(null, "You did amazing! You must have studied hard!");
	}else if(s > 70) {
		JOptionPane.showMessageDialog(null, "You did great! With a little more effort you can get a better grade");
	
	}else if(s > 50) {
		JOptionPane.showMessageDialog(null, "Try harder next time.");
	}
}
}
