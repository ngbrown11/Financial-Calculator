package io.github.ngbrown11.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnView;
	private JMenu mnHelp;
	private JTextField text;
	private JPanel buttonPanel;
	private JButton btnEquals;
	private JButton btnDelete;
	private JButton btnSqrt;
	private JButton btnC;
	private JButton btnCe;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnDecimal;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnModulus;
	private JButton btnReciprocal;
	private JRadioButtonMenuItem rdbtnSimple;
	private JRadioButtonMenuItem rdbtnScientific;
	private JRadioButtonMenuItem rdbtnFinance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Create the menu bar and menu items
		menuBar = new JMenuBar();
		mnView = new JMenu("View");
		menuBar.add(mnView);
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		setJMenuBar(menuBar);
		
		// Create the radio buttons of the "View" menu
		ButtonGroup bg = new ButtonGroup();	// Group the radio buttons
		
		rdbtnSimple = new JRadioButtonMenuItem("Simple");
		mnView.add(rdbtnSimple);
		bg.add(rdbtnSimple);
		
		rdbtnScientific = new JRadioButtonMenuItem("Scientific");
		mnView.add(rdbtnScientific);
		bg.add(rdbtnScientific);
		
		rdbtnFinance = new JRadioButtonMenuItem("Finance");
		mnView.add(rdbtnFinance);
		bg.add(rdbtnFinance);
		
		// Create the text field for the calc computations
		text = new JTextField();
		text.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text.setColumns(1);
		text.setEditable(false);
		getContentPane().add(text, BorderLayout.CENTER);
		
		// Panel to contain the calc buttons
		buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		GridBagLayout gbl_buttonPanel = new GridBagLayout();
		gbl_buttonPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_buttonPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_buttonPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_buttonPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		buttonPanel.setLayout(gbl_buttonPanel);
		
		// Add the calc buttons and methods
		btnDelete = new JButton("<---");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					text.setText(text.getText().toString()
							.substring(0, text.getText().toString().length()-1));
				} catch (StringIndexOutOfBoundsException e) {
					return;
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.fill = GridBagConstraints.BOTH;
		gbc_btnDelete.gridwidth = 2;
		gbc_btnDelete.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelete.gridx = 0;
		gbc_btnDelete.gridy = 0;
		buttonPanel.add(btnDelete, gbc_btnDelete);
		
		btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.fill = GridBagConstraints.BOTH;
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 2;
		gbc_btnCe.gridy = 0;
		buttonPanel.add(btnCe, gbc_btnCe);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 3;
		gbc_btnC.gridy = 0;
		buttonPanel.add(btnC, gbc_btnC);
		
		btnSqrt = new JButton("sqrt");
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnSqrt = new GridBagConstraints();
		gbc_btnSqrt.fill = GridBagConstraints.BOTH;
		gbc_btnSqrt.insets = new Insets(0, 0, 5, 0);
		gbc_btnSqrt.gridx = 4;
		gbc_btnSqrt.gridy = 0;
		buttonPanel.add(btnSqrt, gbc_btnSqrt);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 1;
		buttonPanel.add(btn1, gbc_btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 1;
		buttonPanel.add(btn2, gbc_btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 1;
		buttonPanel.add(btn3, gbc_btn3);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + " / ");
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnDivide = new GridBagConstraints();
		gbc_btnDivide.fill = GridBagConstraints.BOTH;
		gbc_btnDivide.insets = new Insets(0, 0, 5, 5);
		gbc_btnDivide.gridx = 3;
		gbc_btnDivide.gridy = 1;
		buttonPanel.add(btnDivide, gbc_btnDivide);
		
		btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + " % ");
			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnModulus = new GridBagConstraints();
		gbc_btnModulus.fill = GridBagConstraints.BOTH;
		gbc_btnModulus.insets = new Insets(0, 0, 5, 0);
		gbc_btnModulus.gridx = 4;
		gbc_btnModulus.gridy = 1;
		buttonPanel.add(btnModulus, gbc_btnModulus);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 2;
		buttonPanel.add(btn4, gbc_btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 1;
		gbc_btn5.gridy = 2;
		buttonPanel.add(btn5, gbc_btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 2;
		gbc_btn6.gridy = 2;
		buttonPanel.add(btn6, gbc_btn6);
		
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + " * ");
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnMultiply = new GridBagConstraints();
		gbc_btnMultiply.fill = GridBagConstraints.BOTH;
		gbc_btnMultiply.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiply.gridx = 3;
		gbc_btnMultiply.gridy = 2;
		buttonPanel.add(btnMultiply, gbc_btnMultiply);
		
		btnReciprocal = new JButton("1/x");
		btnReciprocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double reciprocal = 1 / (Double.parseDouble(text.getText()));
				text.setText("reciproc(" + reciprocal + ")");
			}
		});
		btnReciprocal.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnReciprocal = new GridBagConstraints();
		gbc_btnReciprocal.fill = GridBagConstraints.BOTH;
		gbc_btnReciprocal.insets = new Insets(0, 0, 5, 0);
		gbc_btnReciprocal.gridx = 4;
		gbc_btnReciprocal.gridy = 2;
		buttonPanel.add(btnReciprocal, gbc_btnReciprocal);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 0;
		gbc_btn7.gridy = 3;
		buttonPanel.add(btn7, gbc_btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 3;
		buttonPanel.add(btn8, gbc_btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 2;
		gbc_btn9.gridy = 3;
		buttonPanel.add(btn9, gbc_btn9);
		
		btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_btnSub = new GridBagConstraints();
		gbc_btnSub.fill = GridBagConstraints.BOTH;
		gbc_btnSub.insets = new Insets(0, 0, 5, 5);
		gbc_btnSub.gridx = 3;
		gbc_btnSub.gridy = 3;
		buttonPanel.add(btnSub, gbc_btnSub);
		
		btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_btnEquals = new GridBagConstraints();
		gbc_btnEquals.fill = GridBagConstraints.BOTH;
		gbc_btnEquals.gridheight = 2;
		gbc_btnEquals.gridx = 4;
		gbc_btnEquals.gridy = 3;
		buttonPanel.add(btnEquals, gbc_btnEquals);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.gridwidth = 2;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 0;
		gbc_btn0.gridy = 4;
		buttonPanel.add(btn0, gbc_btn0);
		
		btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText() + ".");
			}
		});
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnDecimal = new GridBagConstraints();
		gbc_btnDecimal.fill = GridBagConstraints.BOTH;
		gbc_btnDecimal.insets = new Insets(0, 0, 0, 5);
		gbc_btnDecimal.gridx = 2;
		gbc_btnDecimal.gridy = 4;
		buttonPanel.add(btnDecimal, gbc_btnDecimal);
		
		btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.fill = GridBagConstraints.BOTH;
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 3;
		gbc_btnAdd.gridy = 4;
		buttonPanel.add(btnAdd, gbc_btnAdd);
		
	}

}
