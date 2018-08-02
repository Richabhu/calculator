package calculator_simple;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
//import java.awt.event.ActionListener;
public class calc_modified extends JFrame {
	
	double first,sec,reslt;
	String ans;
	char operatn;
	
	public calc_modified()
	{
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		work();
	}
	public void action_listener(JButton btn,JTextField text)
	{
		
	}
	public void work()
	{

		JPanel panel=new JPanel();
		//JLabel label=new JLabel();
		JTextField text=new JTextField(10);
		text.setBounds(10,14,222,40);
		text.setColumns(10);
		
		
		getContentPane().add(panel);
		panel.setLayout(null);
		
		panel.add(text);
		
		JButton btnclear=new JButton("C");
		btnclear.setFont(new Font("Tahoma",Font.BOLD,20));
		btnclear.setBounds(10,10+56,50,50);
		action_listener(btnclear,text);
		btnclear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				text.setText("");
			}
			
		}
			);
		
		panel.add(btnclear);
		
		JButton btndiv=new JButton("/");
		btndiv.setFont(new Font("Tahoma",Font.BOLD,20));
		btndiv.setBounds(66,10+56,50,50);
		btndiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				first=Double.parseDouble(text.getText());
				text.setText("");
				operatn='/';
			}
			
			
		}
			);
		
		panel.add(btndiv);
		
		JButton btnmul=new JButton("*");
		btnmul.setFont(new Font("Tahoma",Font.BOLD,20));
		btnmul.setBounds(122,10+56,50,50);
		btnmul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				first=Double.parseDouble(text.getText());
				text.setText("");
				operatn='*';
			}
			
			
		}
			);
		
		panel.add(btnmul);
		
		JButton btnsub=new JButton("-");
		btnsub.setFont(new Font("Tahoma",Font.BOLD,20));
		btnsub.setBounds(122+56,10+56,50,50);
		btnsub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				first=Double.parseDouble(text.getText());
				text.setText("");
				operatn='-';
			}
			
			
		}
			);
		
		panel.add(btnsub);
		
		JButton btn7=new JButton("7");
		btn7.setFont(new Font("Tahoma",Font.BOLD,20));
		btn7.setBounds(10,10+56+56,50,50);
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn7.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn7);
		
		JButton btn8=new JButton("8");
		btn8.setFont(new Font("Tahoma",Font.BOLD,20));
		btn8.setBounds(66,66+56,50,50);
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn8.getText(); 
				text.setText(enterno);	
			}
			
			
		}
			);
		
		panel.add(btn8);
		
		JButton btn9=new JButton("9");
		btn9.setFont(new Font("Tahoma",Font.BOLD,20));
		btn9.setBounds(122,66+56,50,50);
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn9.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn9);
		
		JButton btnplus=new JButton("+");
		btnplus.setFont(new Font("Tahoma",Font.BOLD,20));
		btnplus.setBounds(122+56,10+56+56,50,50+56);
		btnplus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				first=Double.parseDouble(text.getText());
				text.setText("");
				operatn='+';
			}
			
			
		}
			);
		
		panel.add(btnplus);

		
		JButton btn4=new JButton("4");
		btn4.setFont(new Font("Tahoma",Font.BOLD,20));
		btn4.setBounds(10,112+10+56,50,50);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn4.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn4);
		
		JButton btn5=new JButton("5");
		btn5.setFont(new Font("Tahoma",Font.BOLD,20));
		btn5.setBounds(66,122+56,50,50);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn5.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn5);
		
		JButton btn6=new JButton("6");
		btn6.setFont(new Font("Tahoma",Font.BOLD,20));
		btn6.setBounds(122,122+56,50,50);
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn6.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn6);
		
		JButton btn1=new JButton("1");
		btn1.setFont(new Font("Tahoma",Font.BOLD,20));
		btn1.setBounds(10,122+56+56,50,50);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn1.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn1);
		
		JButton btn2=new JButton("2");
		btn2.setFont(new Font("Tahoma",Font.BOLD,20));
		btn2.setBounds(66,122+56+56,50,50);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn2.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn2);
		
		JButton btn3=new JButton("3");
		btn3.setFont(new Font("Tahoma",Font.BOLD,20));
		btn3.setBounds(122,122+56+56,50,50);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn3.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn3);
		
		JButton btnequ=new JButton("=");
		btnequ.setFont(new Font("Tahoma",Font.BOLD,20));
		btnequ.setBounds(122+56,122+56+56,50,50+56);
		btnequ.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				sec=Double.parseDouble(text.getText());
				switch(operatn)
				{
					case '+': reslt=first+sec;
								break;
					case '-': reslt=first-sec;break;
					case '*': reslt=first*sec;break;
					case '/': reslt=first/sec; break;
				}
				ans=String.format("%.2f", reslt);
				text.setText(ans);
			}
			
			
		}
			);
		
		panel.add(btnequ);
		
		JButton btn0=new JButton("0");
		btn0.setFont(new Font("Tahoma",Font.BOLD,20));
		btn0.setBounds(10,122+56+56+56,50+56,50);
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				String enterno=text.getText()+btn0.getText(); 
				text.setText(enterno);
			}
			
			
		}
			);
		
		panel.add(btn0);
		
		JButton btndot=new JButton(".");
		btndot.setFont(new Font("Tahoma",Font.BOLD,20));
		btndot.setBounds(10+56+56,122+56+56+56,50,50);
		btndot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				if(!text.getText().contains("."))
				{
					text.setText(text.getText()+btndot.getText());
				}
			}
			
		}
			);
		
		panel.add(btndot);
		
		setTitle("CALCULATOR");
		setSize(260,390);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	

	public static void main(String[] args) {
		
		calc c=new calc();
		c.setVisible(true);
			
		

	}

}
