package GSNDemo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PersonalMessage extends JFrame {
	PersonalMessage(){
		this.setTitle("������Ϣչʾ");
		this.setSize(300, 450);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		createBasic();
		createzujian();
		createHead();
		
		
	}
	private void createBasic(){
		ImageIcon img = new ImageIcon("1.jpg");		// ���Ǳ���ͼƬ
		JLabel imgLabel = new JLabel(img);		    // ������ͼ���ڱ�ǩ�			
		imgLabel.setBounds(0,0,this.getWidth(),this.getHeight());
		this.getLayeredPane().add(imgLabel,new	Integer(Integer.MIN_VALUE));
		JPanel cp = (JPanel)this.getContentPane();			 
		cp.setOpaque(false); 
	}
	private void createzujian(){
		JLabel PersonalSign = new JLabel("����ǩ��");
		PersonalSign.setFont(new Font("",Font.BOLD,16));
		PersonalSign.setBounds(5,150,200,80);
		this.getContentPane().add(PersonalSign);
		JTextArea text = new JTextArea();
		text.append(" ���ж�ڣ�������ж�Զ....");
		text.setBounds(80,180,200,22);
		this.getContentPane().add(text);
		
		
	}
	private void createHead(){
		JLabel labelHead = new JLabel();
		labelHead.setBounds(0,0,87,80);
		labelHead.setIcon(new ImageIcon("3.jpg"));
		labelHead.setBorder(BorderFactory.createLineBorder(Color.black));//�������߿���ɫ
		this.getContentPane().add(labelHead);
		JLabel labelName = new JLabel("��Ҫ�Է���");
		labelName.setFont(new Font("",Font.BOLD,18));
		labelName.setBounds(100,30,190,70);
		this.getContentPane().add(labelName);
		
	}
	

}
