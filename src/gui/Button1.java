package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//import gui.SwingConsole.*;
import javax.swing.SwingUtilities;

public class Button1 extends JFrame{
	private JButton b1=new JButton("Button1"),
			b2=new JButton("Button2");
	public Button1(){
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
	public static void main(String[] args){
		run(new Button1(),200,100);
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
