package com.company.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeCalc1 implements ActionListener {
	private static JTextField inputBox;

	private static double firstnum;
	private static double secondnum;
	private static double result;
	private static String operations;
	private static String answer;

	PracticeCalc1() {
	}

	public static void main(String[] args) {
		createWindow();

	}

	private static void createWindow() {
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		createUI(frame);
		frame.setSize(350, 250);
		frame.setLocationRelativeTo(null);

		frame.setResizable(false);
		frame.setVisible(true);
	}

	private static void createUI(JFrame frame) {
		JPanel panel = new JPanel();

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setLayout(layout);

		inputBox = new JTextField(10);
		inputBox.setEditable(false);

		// BUTTON CREATION

		JButton button0 = new JButton("0");

		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");

		JButton buttonPlus = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonDivide = new JButton("/");
		JButton buttonMultiply = new JButton("x");
		JButton buttonClear = new JButton("C");
		JButton buttonDot = new JButton(".");
		JButton buttonEquals = new JButton("=");

		// BUTTON FUNCTIONALITY

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button1.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button2.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button3.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button4.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button5.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button6.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button7.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button8.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button9.getText();
				inputBox.setText(EnterNumber);
			}
		});
		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String EnterNumber = inputBox.getText() + button0.getText();
				inputBox.setText(EnterNumber);
			}
		});

		buttonPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum = Double.parseDouble(inputBox.getText());
				inputBox.setText("");
				operations = "+";
			}
		});
		buttonMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum = Double.parseDouble(inputBox.getText());
				inputBox.setText("");
				operations = "-";
			}
		});
		buttonDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum = Double.parseDouble(inputBox.getText());
				inputBox.setText("");
				operations = "/";
			}
		});
		buttonMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum = Double.parseDouble(inputBox.getText());
				inputBox.setText("");
				operations = "*";
			}
		});
		buttonClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				inputBox.setText(null);
				if (buttonClear == (JButton)e.getSource()) {
					buttonEquals.setEnabled(true);
				}
			}
		});
		buttonDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (!inputBox.getText().contains(".")) {
					inputBox.setText(inputBox.getText() + buttonDot.getText());
				}
			}
		});
		buttonEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String answer;

				secondnum = Double.parseDouble(inputBox.getText());

				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					inputBox.setText(answer);
				} else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					inputBox.setText(answer);
				} else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					inputBox.setText(answer);
				} else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					inputBox.setText(answer);
				}
				
				if(buttonEquals == (JButton)e.getSource()) {
					buttonEquals.setEnabled(false);
				} 
				
		
			}

		});

		// BUTTON PLACEMENT

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(button1, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(button2, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		panel.add(button3, gbc);
		gbc.gridx = 3;
		gbc.gridy = 0;
		panel.add(buttonPlus, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(button4, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(button5, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel.add(button6, gbc);
		gbc.gridx = 3;
		gbc.gridy = 1;
		panel.add(buttonMinus, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(button7, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(button8, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel.add(button9, gbc);
		gbc.gridx = 3;
		gbc.gridy = 2;
		panel.add(buttonDivide, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(buttonDot, gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(button0, gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel.add(buttonClear, gbc);
		gbc.gridx = 3;
		gbc.gridy = 3;
		panel.add(buttonMultiply, gbc);
		gbc.gridwidth = 3;

		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(inputBox, gbc);
		gbc.gridx = 3;
		gbc.gridy = 4;
		panel.add(buttonEquals, gbc);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.charAt(0) == 'C') {
			inputBox.setText("");
		} else if (command.charAt(0) == '=') {
			inputBox.setText(evaluate(inputBox.getText()));
		} else {
			inputBox.setText(inputBox.getText() + command);
		}
	}

	public static String evaluate(String expression) {
		char[] arr = expression.toCharArray();
		String operand1 = "";
		String operand2 = "";
		String operator = "";
		double result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
				if (operator.isEmpty()) {
					operand1 += arr[i];
				} else {
					operand2 += arr[i];
				}
			}

			if (arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
				operator += arr[i];
			}
		}

		if (operator.equals("+"))
			result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
		else if (operator.equals("-"))
			result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
		else if (operator.equals("/"))
			result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
		else
			result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
		return operand1 + operator + operand2 + "=" + result;
	}
}