package edu.oakland.cse423;

import java.awt.*;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameBoard extends JApplet {
	JPanel topPanel = new JPanel();
	JPanel boardPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JLabel turnLabel = new JLabel();
	JButton startButton = new JButton();
	TTTButton[] cellButton = new TTTButton[9];

	@Override
	public void init() {
		resize(250, 430);
		topPanel.setPreferredSize(new Dimension(250, 90));
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		topPanel.add(turnLabel);
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		bottomPanel.setPreferredSize(new Dimension(250, 90));
		startButton.setText("Start");
		bottomPanel.add(startButton);
		boardPanel.setLayout(new GridLayout(3, 3, 10, 10));
		for (int i = 0; i < cellButton.length; i++) {
			cellButton[i] = new TTTButton(i);
			boardPanel.add(cellButton[i]);
		}
		this.setLayout(new BorderLayout(10, 10));
		this.getContentPane().add(topPanel, BorderLayout.NORTH);
		this.getContentPane().add(boardPanel, BorderLayout.CENTER);
		this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
	}
}
