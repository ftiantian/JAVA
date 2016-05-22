package gui;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ButtonGroup extends JFrame{
	private static String[] ids={"June","Wards","Beaver","Wally","Eddle","Lumpy"};
	static JPanel makeBPanel(Class<? extends AbstractButton> kind,String[] ids){
		ButtonGroup bg=new ButtonGroup();
		JPanel jp=new JPanel();
		String title=kind.getName();
		title=title.substring(title.lastIndexOf('.')+1);
		jp.setBorder(new TitledBorder(title));
		for(String id:ids){
			AbstractButton ab=new JButton("failed");
			
		}
	}
}
