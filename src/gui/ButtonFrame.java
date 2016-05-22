package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrame extends JFrame{
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	
	public ButtonFrame(){
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		//使用标签字符串构造按钮
		JButton yellowButton=new JButton("Yellow");
		JButton blueButton=new JButton("Blue");
		JButton redButton=new JButton("red");
		//将按钮添加到面板上
		buttonPanel=new JPanel();
		
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		
		add(buttonPanel);
		//用对应的颜色构造一个动作监听器
		ColorAction yellowAction=new ColorAction(Color.YELLOW);
		ColorAction blueAction=new ColorAction(Color.BLUE);
		ColorAction redAction=new ColorAction(Color.RED);
		//添加动作监听器
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}
	
	private class ColorAction implements ActionListener{
		private Color backgroundColor;
		public ColorAction(Color c){
			backgroundColor=c;
		}
		public void actionPerformed(ActionEvent event){
			buttonPanel.setBackground(backgroundColor);
		}
	}
}
