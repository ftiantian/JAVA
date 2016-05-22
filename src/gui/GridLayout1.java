package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GridLayout1 extends JFrame{
	public GridLayout1(){
		setLayout(new GridLayout(7,3));
		for(int i=0;i<20;i++)
			add(new JButton("Button "+i));
	}
	public static void main(String[] args){
		run(new GridLayout1(),300,300);
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
