package com.studyonyourown;

import javax.swing.JOptionPane; // Pops out a Message on screen 

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds =   500 ;
		int minutes= seconds/60;
		int remainingSec=seconds%60;
		JOptionPane.showMessageDialog(null, seconds+"second is"+ minutes+"minutes and "+ remainingSec+"Seconds");
	}

}
