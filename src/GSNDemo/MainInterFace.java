package GSNDemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainInterFace extends JFrame{
	public MainInterFace(){
		this.setTitle("�û�����");
		this.setResizable(false);
		this.setLayout(null);		
		
		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		
		createBasic();
		createHead();
		createzujian();
		
	
		
	}
	private void createBasic(){
		ImageIcon img = new ImageIcon("2.jpg");	// ���Ǳ���ͼƬ
		
		JLabel imgLabel = new JLabel(img);		    // ������ͼ���ڱ�ǩ�			
		imgLabel.setBounds(0,0,this.getWidth(),this.getHeight());
		this.getLayeredPane().add(imgLabel,new	Integer(Integer.MIN_VALUE));
		JPanel cp = (JPanel)this.getContentPane();			 
		cp.setOpaque(false);		
		
	}
	private void createzujian(){ 
		 JButton button = new JButton("�˳�");
		 button.setForeground(Color.red);
		 button.setBackground(Color.gray);
		 button.setBounds(333,543,60,30);
		 
		 JButton but1 = new JButton("��Ϣ");
		 JButton but2 = new JButton("������Ϣ");
		 JButton but3 = new JButton("���Ѷ�̬");
		 
		 but1.setBounds(10, 500, 90, 30);
		 but2.setBounds(155, 500, 90, 30);
		 but3.setBounds(300, 500, 90, 30);
		 
		 but1.setForeground(Color.blue);
		 but2.setForeground(Color.blue);
		 but3.setForeground(Color.blue);
		 
		
		 String[] contant = {"��ϵ�ˣ�","С��","����","����","����","С��","С��"};		
		 
			JComboBox comboBox = new JComboBox(contant);
			comboBox.setEditable(true);
			comboBox.setMaximumRowCount(5);
			
				
			comboBox.setBounds(30,150,180,30);
			this.getContentPane().add(comboBox);
			this.getContentPane().add(button);
			this.getContentPane().add(but1);
			this.getContentPane().add(but2);
			this.getContentPane().add(but3);
	       
			    
	        	button.addActionListener(new ActionListener() { 
	        		 
	        		public void actionPerformed(ActionEvent e) { 
	        		setVisible(false);//���ش��� 
	        		
	        		} 
	        		});  
	        	but1.addActionListener(new ActionListener() { 
	        		 
	        		public void actionPerformed(ActionEvent e) { 
	        			JOptionPane.showMessageDialog(null, "�����û���յ���Ϣ");
	        		
	        		} 
	        		});
	        	but2.addActionListener(new ActionListener() { 
	        		 
	        		public void actionPerformed(ActionEvent e) { 

                        PersonalMessage p = new PersonalMessage();
	        		
	        		} 
	        		});  
	        	but3.addActionListener(new ActionListener() { 
	        		 
	        		public void actionPerformed(ActionEvent e) { 
	        			JOptionPane.showMessageDialog(null, "���ĺ���û�ж�̬");
	        		
	        		} 
	        		});  


	}
	private void createHead(){
		JLabel labelHead = new JLabel();
		labelHead.setBounds(10,10,87,80);
		labelHead.setIcon(new ImageIcon("3.jpg"));
		labelHead.setBorder(BorderFactory.createLineBorder(Color.black));//�������߿���ɫ


		this.getContentPane().add(labelHead);
		
		
		JLabel labelName = new JLabel("��Ҫ�Է���");
		labelName.setFont(new Font("",Font.BOLD,20));
		labelName.setBounds(120,30,200,80);
		this.getContentPane().add(labelName);
		
		
	}
	
	

}
