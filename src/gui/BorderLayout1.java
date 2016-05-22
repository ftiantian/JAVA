package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BorderLayout1 extends JFrame{
	public BorderLayout1(){
		add(BorderLayout.NORTH,new JButton("North"));
		add(BorderLayout.SOUTH,new JButton("South"));
		add(BorderLayout.EAST,new JButton("East"));
		add(BorderLayout.WEST,new JButton("West"));
		add(BorderLayout.CENTER,new JButton("Center"));
	}
	public static void main(String[] args){
		run(new BorderLayout1(),300,250);
	}
	public static void run(final JFrame f,final int width,final int height){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				f.setTitle(f.getClass().getSimpleName());
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(width, height);
				f.setVisible(true);
			}
		});
	}
}
