package conversions;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput = JOptionPane.showInputDialog("Enter a number, a space, unit: conversion");
		int spacePos = userInput.indexOf("");
		double number = Double.parseDouble(userInput.substring(0,userInput.indexOf(" ")));
		String unit = userInput.substring(spacePos+1,userInput.length()).trim();
		
		final double CENTIMETERS = 2.54;
		final double INCHES = .3937;
		
		double num = 0;
		String u = null;
		
		if (unit.equalsIgnoreCase("cm")) {
			num = number/CENTIMETERS;
			u = "in";
		}else if(unit.equalsIgnoreCase("in")){
			num = number/INCHES;
			u = "cm";
		}
		
		System.out.println(number+ " " +unit+ " = " +num+ " " +u);
		
		
		final double METRES = .9144;
		final double YARDS = 1.0936;
		
		double numb = 0;
		String un = null;
		
		if (unit.equalsIgnoreCase("m")) {
			numb = number/METRES;
			un = "yr";
		}else if(unit.equalsIgnoreCase("yr")){
			numb = number/YARDS;
			un = "m";
		}
		
		System.out.println(number+ " " +unit+ " = " +numb+ " " +un);
		
		
		final double KM = .6214;
		final double MILES = 1.6093;
		
		double numbr = 0;
		String unt = null;
		
		if (unit.equalsIgnoreCase("mles")) {
			numbr = number/KM;
			unt = "km";
		}else if(unit.equalsIgnoreCase("km")){
			numbr = number/MILES;
			unt = "mles";
		}
		
		System.out.println(number+ " " +unit+ " = " +numbr+ " " +unt);
	}

}
