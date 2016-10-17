package io.github.ngbrown11.calculator;

import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class CalcGUI extends JFrame {
	
	//CREATE MENU FOR GUI
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Menu");
	private JPanel boxes = new JPanel();
	private JButton box = new JButton();
			
	CalcGUI() {
		
		menuBar.add(menu);
		
		for(int i = 1; i <= 9; i++) {
			
			box.setText(""+i);
			boxes.add(box);
		}
		
		boxes.setLayout(new GridLayout(3,3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		//More to be done
	}
	
	public static void main(String[] args) {
		
		JFrame test = new CalcGUI();
		test.setSize(300, 450);
	}
}
