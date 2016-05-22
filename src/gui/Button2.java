package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Button2 extends JFrame{
	private JButton b1=new JButton("Button1"),
			b2=new JButton("Button2");
	private JTextField txt=new JTextField(10);
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String name=((JButton)e.getSource()).getText();//获取按钮的名称
			txt.setText(name);//将按钮的值设置为文本框的值
		}
	}
	private ButtonListener bl=new ButtonListener();
	public Button2(){
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
	}
	public static void main(String[] args){
		run(new Button2(),200,100);
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
