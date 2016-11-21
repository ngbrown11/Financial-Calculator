package io.github.ngbrown11.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalcFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcFrame window = new CalcFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 249, 289);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.gridheight = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(1);
		
		JButton button_Delete = new JButton("<---");
		button_Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					textField.setText(textField.getText().toString()
							.substring(0, textField.getText().toString().length()-1));
				} catch (StringIndexOutOfBoundsException e) {
					return;
				}
			}
		});
		GridBagConstraints gbc_button_Delete = new GridBagConstraints();
		gbc_button_Delete.fill = GridBagConstraints.BOTH;
		gbc_button_Delete.gridwidth = 2;
		gbc_button_Delete.insets = new Insets(0, 0, 5, 5);
		gbc_button_Delete.gridx = 0;
		gbc_button_Delete.gridy = 3;
		frame.getContentPane().add(button_Delete, gbc_button_Delete);
		
		JButton btnCe = new JButton("CE");
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.fill = GridBagConstraints.BOTH;
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 2;
		gbc_btnCe.gridy = 3;
		frame.getContentPane().add(btnCe, gbc_btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 3;
		gbc_btnC.gridy = 3;
		frame.getContentPane().add(btnC, gbc_btnC);
		
		JButton btnSqrt = new JButton("sqrt");
		GridBagConstraints gbc_btnSqrt = new GridBagConstraints();
		gbc_btnSqrt.fill = GridBagConstraints.BOTH;
		gbc_btnSqrt.insets = new Insets(0, 0, 5, 0);
		gbc_btnSqrt.gridx = 4;
		gbc_btnSqrt.gridy = 3;
		frame.getContentPane().add(btnSqrt, gbc_btnSqrt);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 4;
		frame.getContentPane().add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 4;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "3");
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 4;
		frame.getContentPane().add(button_3, gbc_button_3);
		
		JButton button_Divide = new JButton("/");
		button_Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + " / ");
			}
		});
		GridBagConstraints gbc_button_Divide = new GridBagConstraints();
		gbc_button_Divide.fill = GridBagConstraints.BOTH;
		gbc_button_Divide.insets = new Insets(0, 0, 5, 5);
		gbc_button_Divide.gridx = 3;
		gbc_button_Divide.gridy = 4;
		frame.getContentPane().add(button_Divide, gbc_button_Divide);
		
		JButton button_Remainder = new JButton("%");
		button_Remainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + " % ");
			}
		});
		GridBagConstraints gbc_button_Remainder = new GridBagConstraints();
		gbc_button_Remainder.fill = GridBagConstraints.BOTH;
		gbc_button_Remainder.insets = new Insets(0, 0, 5, 0);
		gbc_button_Remainder.gridx = 4;
		gbc_button_Remainder.gridy = 4;
		frame.getContentPane().add(button_Remainder, gbc_button_Remainder);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "4");
			}
		});
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 5;
		frame.getContentPane().add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "5");
			}
		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 5;
		frame.getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "6");
			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 5;
		frame.getContentPane().add(button_6, gbc_button_6);
		
		JButton button_Multiply = new JButton("*");
		button_Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + " * ");
			}
		});
		GridBagConstraints gbc_button_Multiply = new GridBagConstraints();
		gbc_button_Multiply.fill = GridBagConstraints.BOTH;
		gbc_button_Multiply.insets = new Insets(0, 0, 5, 5);
		gbc_button_Multiply.gridx = 3;
		gbc_button_Multiply.gridy = 5;
		frame.getContentPane().add(button_Multiply, gbc_button_Multiply);
		
		JButton btnNewButton = new JButton("1/x");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 5;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
			}
		});
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 6;
		frame.getContentPane().add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "8");
			}
		});
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 6;
		frame.getContentPane().add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "9");
			}
		});
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 6;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		JButton button_Minus = new JButton("-");
		button_Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + " - ");
			}
		});
		GridBagConstraints gbc_button_Minus = new GridBagConstraints();
		gbc_button_Minus.fill = GridBagConstraints.BOTH;
		gbc_button_Minus.insets = new Insets(0, 0, 5, 5);
		gbc_button_Minus.gridx = 3;
		gbc_button_Minus.gridy = 6;
		frame.getContentPane().add(button_Minus, gbc_button_Minus);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		GridBagConstraints gbc_button_0 = new GridBagConstraints();
		gbc_button_0.fill = GridBagConstraints.BOTH;
		gbc_button_0.gridwidth = 2;
		gbc_button_0.insets = new Insets(0, 0, 0, 5);
		gbc_button_0.gridx = 0;
		gbc_button_0.gridy = 7;
		frame.getContentPane().add(button_0, gbc_button_0);
		
		JButton button_Period = new JButton(".");
		button_Period.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ".");
			}
		});
		GridBagConstraints gbc_button_Period = new GridBagConstraints();
		gbc_button_Period.fill = GridBagConstraints.BOTH;
		gbc_button_Period.insets = new Insets(0, 0, 0, 5);
		gbc_button_Period.gridx = 2;
		gbc_button_Period.gridy = 7;
		frame.getContentPane().add(button_Period, gbc_button_Period);
		
		JButton button_Add = new JButton("+");
		button_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + " + ");
			}
		});
		GridBagConstraints gbc_button_Add = new GridBagConstraints();
		gbc_button_Add.fill = GridBagConstraints.BOTH;
		gbc_button_Add.insets = new Insets(0, 0, 0, 5);
		gbc_button_Add.gridx = 3;
		gbc_button_Add.gridy = 7;
		frame.getContentPane().add(button_Add, gbc_button_Add);
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String equation = textField.getText().toString();
				textField.setText(" = ");
				//Add method to compute solution
			}
		});
		GridBagConstraints gbc_buttonEquals = new GridBagConstraints();
		gbc_buttonEquals.fill = GridBagConstraints.BOTH;
		gbc_buttonEquals.gridheight = 2;
		gbc_buttonEquals.gridx = 4;
		gbc_buttonEquals.gridy = 6;
		frame.getContentPane().add(buttonEquals, gbc_buttonEquals);
	}
}
