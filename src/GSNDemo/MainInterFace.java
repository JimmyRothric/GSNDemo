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
import javax.swing.JTextArea;

public class MainInterFace extends JFrame{
	private JLabel headLabel;
	private JLabel nameLabel;
	private JTextArea commentText;
	private JLabel selectLabel;
	private JButton addFriendsBtn;
	private JButton delFriendsBtn;
	private JButton chatBtn;
	private JButton groupBtn;
	private JButton viewFriendsInfoBtn;
	private JButton viewMyInfoBtn;
	private JButton msgBtn;
	private JButton exitBtn;
	private JComboBox<String> friendsList; 
	private Account myAccount;
	private Person me;
	private Font myFont = new Font("΢���ź�",Font.PLAIN, 16);
	public MainInterFace(String username){
		this.setTitle("�û�����");
		this.setResizable(false);
		this.setLayout(null);		
		this.setSize(320, 600);
		this.setLocationRelativeTo(null);
		
		myAccount = AccountManager.accMap.get(username);
		me = myAccount.getPerson();
		
		createBasic();
		createPersonInfo();
		createComps();
		
		
	}
	private void createBasic(){
		ImageIcon img = new ImageIcon("2.jpg");	// ���Ǳ���ͼƬ
		
		JLabel imgLabel = new JLabel(img);		    // ������ͼ���ڱ�ǩ�			
		imgLabel.setBounds(0,0,this.getWidth(),this.getHeight());
		this.getLayeredPane().add(imgLabel,new	Integer(Integer.MIN_VALUE));
		JPanel cp = (JPanel)this.getContentPane();			 
		cp.setOpaque(false);		
		
	}
	private void createComps(){ 
		selectLabel = new JLabel("ѡ��:");
		selectLabel.setFont(myFont);
		selectLabel.setBounds(10, 200, 100, 20);
		this.getContentPane().add(selectLabel);
		
		chatBtn = new JButton("����");
		chatBtn.setFont(myFont);
		
		
		groupBtn = new JButton("Ⱥ��");
		viewFriendsInfoBtn = new JButton("�鿴����");
		viewMyInfoBtn = new JButton("�ҵ���Ϣ");
		msgBtn = new JButton("��Ϣ");
		exitBtn = new JButton("�˳�");
		addFriendsBtn = new JButton("��Ӻ���");
		delFriendsBtn = new JButton("ɾ������");
		 
 
		
		String[] contant = {"��ϵ�ˣ�","С��","����","����","����","С��","С��"};		
	 
		friendsList = new JComboBox<String>(contant);
		friendsList.setEditable(false);
		friendsList.setMaximumRowCount(8);
		friendsList.setBounds(10,150,300,30);
		friendsList.setFont(myFont);
		this.getContentPane().add(friendsList);
		
	
	   
		    
        	/*button.addActionListener(new ActionListener() { 
        		 
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
        		});  */
        	


	}
	private void createPersonInfo(){
		headLabel = new JLabel();
		headLabel.setBounds(10,10,100,100);
		headLabel.setIcon(me.getImg());
		headLabel.setBorder(BorderFactory.createLineBorder(Color.black));//�������߿���ɫ
		this.getContentPane().add(headLabel);
		
		nameLabel = new JLabel(me.getNickname());
		nameLabel.setBounds(120,10,200,50);
		nameLabel.setFont(new Font("΢���ź�",Font.BOLD, 32));
		this.getContentPane().add(nameLabel);
		
		commentText = new JTextArea(me.getComment());
		commentText.setFont(myFont);
		commentText.setBounds(120,60,180,40);
		commentText.setEditable(false);
		commentText.setOpaque(false);
		commentText.setLineWrap(true);
		this.getContentPane().add(commentText);
		
	}
	
	

}
