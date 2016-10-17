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

public class CalcFrame {

	private JFrame frame;

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
		frame.setBounds(100, 100, 264, 300);
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
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.gridheight = 3;
		gbc_formattedTextField.gridwidth = 5;
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.BOTH;
		gbc_formattedTextField.gridx = 0;
		gbc_formattedTextField.gridy = 0;
		frame.getContentPane().add(formattedTextField, gbc_formattedTextField);
		
		JButton button_17 = new JButton("<--");
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_17.gridwidth = 2;
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 0;
		gbc_button_17.gridy = 3;
		frame.getContentPane().add(button_17, gbc_button_17);
		
		JButton btnCe = new JButton("CE");
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 2;
		gbc_btnCe.gridy = 3;
		frame.getContentPane().add(btnCe, gbc_btnCe);
		
		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 3;
		gbc_btnC.gridy = 3;
		frame.getContentPane().add(btnC, gbc_btnC);
		
		JButton btnSqrt = new JButton("sqrt");
		GridBagConstraints gbc_btnSqrt = new GridBagConstraints();
		gbc_btnSqrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSqrt.insets = new Insets(0, 0, 5, 0);
		gbc_btnSqrt.gridx = 4;
		gbc_btnSqrt.gridy = 3;
		frame.getContentPane().add(btnSqrt, gbc_btnSqrt);
		
		JButton button_10 = new JButton("1");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 0;
		gbc_button_10.gridy = 4;
		frame.getContentPane().add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("2");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 1;
		gbc_button_11.gridy = 4;
		frame.getContentPane().add(button_11, gbc_button_11);
		
		JButton button_12 = new JButton("3");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 2;
		gbc_button_12.gridy = 4;
		frame.getContentPane().add(button_12, gbc_button_12);
		
		JButton button_15 = new JButton("/");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 3;
		gbc_button_15.gridy = 4;
		frame.getContentPane().add(button_15, gbc_button_15);
		
		JButton button_16 = new JButton("%");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_16.insets = new Insets(0, 0, 5, 0);
		gbc_button_16.gridx = 4;
		gbc_button_16.gridy = 4;
		frame.getContentPane().add(button_16, gbc_button_16);
		
		JButton button_7 = new JButton("4");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 5;
		frame.getContentPane().add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("5");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 5;
		frame.getContentPane().add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("6");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 5;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		JButton button_14 = new JButton("*");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 3;
		gbc_button_14.gridy = 5;
		frame.getContentPane().add(button_14, gbc_button_14);
		
		JButton btnNewButton = new JButton("1/x");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 5;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton button_4 = new JButton("7");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 6;
		frame.getContentPane().add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("8");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 6;
		frame.getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("9");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 6;
		frame.getContentPane().add(button_6, gbc_button_6);
		
		JButton button_13 = new JButton("-");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 3;
		gbc_button_13.gridy = 6;
		frame.getContentPane().add(button_13, gbc_button_13);
		
		JButton button_3 = new JButton("0");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_3.gridwidth = 2;
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 7;
		frame.getContentPane().add(button_3, gbc_button_3);
		
		JButton button_2 = new JButton(".");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 7;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("+");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 7;
		frame.getContentPane().add(button_1, gbc_button_1);
		
		JButton button = new JButton("=");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.gridheight = 2;
		gbc_button.gridx = 4;
		gbc_button.gridy = 6;
		frame.getContentPane().add(button, gbc_button);
	}
}
