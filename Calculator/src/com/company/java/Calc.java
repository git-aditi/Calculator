package com.company.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {

	public double addition(double first, double second) {
		return first + second; 
	}
 
	public double subtraction(double first, double second) {
		return first - second;
	}

	public double multiplication(double first, double second) {
		return first * second;
	}

	public double division(double first, double second) {
		return first / second;
 
	}

	public double modulo(double first, double second) {
		return first % second;
	}

	public double power(double first, double second) {
		return Math.pow(first, second);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
