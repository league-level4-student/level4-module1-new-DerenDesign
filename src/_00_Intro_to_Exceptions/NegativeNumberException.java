package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	void scaryPopUp() {
		JOptionPane.showMessageDialog(null, "Your computer has experienced a major error!");
	}
	static void testPositive(int n) throws NegativeNumberException {
		if(n < 0) {
			throw new NegativeNumberException();
		}
	}
	public static void main(String[] args) {
		try {
			testPositive(-44);
		} catch (NegativeNumberException e) {
			// TODO: handle exception
			e.printStackTrace();
			e.scaryPopUp();
		} finally {
			JOptionPane.showMessageDialog(null, "Don't worry, your computer is okay!");
		}
	}
}
