package GUI;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class L5_13 extends JFrame
{
    JMenuBar menubar;
    JMenu menu1,menu2,menu3,menu4,menu5;
    JMenuItem menuitem2,menuitem3,menuitem4,menuitem5,menuitem6,menuitem7;
   
    JMenu ej;   JMenuItem ej1,ej2;
    
    JToolBar toolbar;
    JButton button1,button2,button3,button4,button5,button6;
    
    JTextArea wby; 
    JScrollPane gdt;
	
	
	public static void main(String[] args) 
	{
		L5_13 lx=new L5_13();
	}
	
	L5_13()
	{
		toolbar=new JToolBar();
		button1=new JButton("�½�",new ImageIcon());
		button1.setToolTipText("�½�");
		button2=new JButton("��",new ImageIcon("image/dk.jpg"));
		button2.setToolTipText("��");
		button3=new JButton("����",new ImageIcon("image/bc.jpg"));
		button3.setToolTipText("����");
		button4=new JButton("����",new ImageIcon("image/jq.jpg"));
		button4.setToolTipText("����");
		button5=new JButton("����",new ImageIcon("image/fz.jpg"));
		button5.setToolTipText("����");
		button6=new JButton("ճ��",new ImageIcon("image/zt.jpg"));
		button6.setToolTipText("ճ��");
		
		toolbar.add(button1); toolbar.add(button2); toolbar.add(button3); 
		toolbar.add(button4); toolbar.add(button5); toolbar.add(button6);
		
		
		
		menubar=new JMenuBar();
		menu1=new JMenu("�ļ�(F)");
		menu1.setMnemonic('F');
		menu2=new JMenu("�༭(E)");
		menu2.setMnemonic('E');
		menu3=new JMenu("��ʽ(O)");
		menu3.setMnemonic('O');
		menu4=new JMenu("�鿴(V)");
		menu4.setMnemonic('V');
		menu5=new JMenu("����(H)");
		menu5.setMnemonic('H');
		
		ej=new JMenu("�½�");
		ej1=new JMenuItem("�ļ�",new ImageIcon("image/xj.jpg"));
		ej2=new JMenuItem("ģ��");
		
		menuitem2=new JMenuItem("��",new ImageIcon("image/dk.jpg"));
		menuitem3=new JMenuItem("����(s)",new ImageIcon("image/bc.jpg"));	
		menuitem3.setMnemonic('S');
		menuitem4=new JMenuItem("���Ϊ");
		menuitem5=new JMenuItem("ҳ������");
		menuitem6=new JMenuItem("��ӡ");
		menuitem7=new JMenuItem("�˳�");
		
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
				
		
		ej.add(ej1);  ej.add(ej2);
		
		menu1.add(ej);  menu1.add(menuitem2);  menu1.add(menuitem3);  menu1.add(menuitem4);
		menu1.addSeparator();
		menu1.add(menuitem5);  menu1.add(menuitem6);
		menu1.addSeparator();
		menu1.add(menuitem7);
		
		menubar.add(menu1);  menubar.add(menu2);  menubar.add(menu3);
		menubar.add(menu4);  menubar.add(menu5);
		
		this.setJMenuBar(menubar);		
		this.add(toolbar,BorderLayout.SOUTH);		
		this.add(gdt);
		
		ImageIcon tp1=new ImageIcon("image/jsb.jpg");
		this.setIconImage(tp1.getImage());
		this.setTitle("���±�");
		this.setSize(570,370);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}	
}