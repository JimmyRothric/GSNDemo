package GSNDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MainInterFace extends JFrame{
	MainInterFace(){
		this.setTitle("�û�����");
		this.setResizable(false);
		this.setLayout(null);
		
		createbasic();
		createzujian();
		
		this.setVisible(true);
		this.setBounds(0,0,350,600);
		
	
		
	}
    private void createbasic(){
		
	}
	private void createzujian(){ 
		 JButton button = new JButton("�˳�");
		 button.setBounds(280,520,60,30);
		 
		
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
