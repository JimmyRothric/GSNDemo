package GSNDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainInterFace extends JFrame{
	public MainInterFace(){
		this.setTitle("�û�����");
		this.setResizable(false);
		this.setLayout(null);		
		
		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		
		createBasic();
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
		 button.setBounds(333,543,60,30);
		 
		
		 String[] contant = {"��ϵ�ˣ�","С��","����","����","����","С��","С��"};		
		 
			JComboBox comboBox = new JComboBox(contant);
			comboBox.setEditable(true);
			comboBox.setMaximumRowCount(5);
			
				
			comboBox.setBounds(30,150,180,30);
			this.getContentPane().add(comboBox);
			this.getContentPane().add(button);
	       
			    
	        	button.addActionListener(new ActionListener() { 
	        		 
	        		public void actionPerformed(ActionEvent e) { 
	        		setVisible(false);//���ش��� 
	        		
	        		} 
	        		});  


	}
	
	

}
