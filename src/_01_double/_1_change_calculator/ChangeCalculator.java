package _01_double._1_change_calculator;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nick = JOptionPane.showInputDialog(null, "How many nickles do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int n = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
String dim = JOptionPane.showInputDialog(null, "How many dimes do you have?");
int d = Integer.parseInt(dim);
		// Ask the user how many quarters they have, and convert their answer
String quarter = JOptionPane.showInputDialog(null, "How many quarters do you have?");
int q = Integer.parseInt(quarter);
double nn = (n*0.05);
double dd = (d*0.10);
double qq = (q*0.25);
JOptionPane.showMessageDialog(null, "You have "+(nn+dd+qq)+"$ of change.");


		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

