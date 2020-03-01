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
		button1=new JButton("新建",new ImageIcon());
		button1.setToolTipText("新建");
		button2=new JButton("打开",new ImageIcon("image/dk.jpg"));
		button2.setToolTipText("打开");
		button3=new JButton("保存",new ImageIcon("image/bc.jpg"));
		button3.setToolTipText("保存");
		button4=new JButton("剪切",new ImageIcon("image/jq.jpg"));
		button4.setToolTipText("剪切");
		button5=new JButton("复制",new ImageIcon("image/fz.jpg"));
		button5.setToolTipText("复制");
		button6=new JButton("粘贴",new ImageIcon("image/zt.jpg"));
		button6.setToolTipText("粘贴");
		
		toolbar.add(button1); toolbar.add(button2); toolbar.add(button3); 
		toolbar.add(button4); toolbar.add(button5); toolbar.add(button6);
		
		
		
		menubar=new JMenuBar();
		menu1=new JMenu("文件(F)");
		menu1.setMnemonic('F');
		menu2=new JMenu("编辑(E)");
		menu2.setMnemonic('E');
		menu3=new JMenu("格式(O)");
		menu3.setMnemonic('O');
		menu4=new JMenu("查看(V)");
		menu4.setMnemonic('V');
		menu5=new JMenu("帮助(H)");
		menu5.setMnemonic('H');
		
		ej=new JMenu("新建");
		ej1=new JMenuItem("文件",new ImageIcon("image/xj.jpg"));
		ej2=new JMenuItem("模板");
		
		menuitem2=new JMenuItem("打开",new ImageIcon("image/dk.jpg"));
		menuitem3=new JMenuItem("保存(s)",new ImageIcon("image/bc.jpg"));	
		menuitem3.setMnemonic('S');
		menuitem4=new JMenuItem("另存为");
		menuitem5=new JMenuItem("页面设置");
		menuitem6=new JMenuItem("打印");
		menuitem7=new JMenuItem("退出");
		
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
		this.setTitle("记事本");
		this.setSize(570,370);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}	
}