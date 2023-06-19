import java.awt.event.*;
import javax.swing.*; 
import java.util.*; 
import Calc.Calc;

public class simpleCalc {  
public static void main(String[] args) {  
	JFrame f=new JFrame();//creating instance of JFrame  
	
	//Creating the text field
	JTextField tf=new JTextField();
	tf.setBounds(100, 50, 400, 50);
	tf.setEditable(false);
	
	
	//Creating the buttons
	JButton one=new JButton("1");//creating instance of JButton
	JButton two=new JButton("2");
	JButton three=new JButton("3");
	JButton four=new JButton("4");
	JButton five=new JButton("5");
	JButton six=new JButton("6");
	JButton seven=new JButton("7");
	JButton eight=new JButton("8");
	JButton nine=new JButton("9");
	JButton zero=new JButton("0");
	JButton dot=new JButton(".");
	JButton add=new JButton("+");
	JButton sub=new JButton("-");
	JButton mul=new JButton("x");
	JButton div=new JButton("/");
	JButton eq=new JButton("=");
	JButton clear=new JButton("AC");
	JButton back=new JButton("<-");
	JButton exit=new JButton("Exit");

	//Positioning the buttons
	one.setBounds(100,400,100, 100);//x axis, y axis, width, height  
	two.setBounds(200,400,100, 100);
	three.setBounds(300,400,100, 100);
	four.setBounds(100,300,100, 100);
	five.setBounds(200,300,100, 100);
	six.setBounds(300,300,100, 100);
	seven.setBounds(100,200,100, 100);
	eight.setBounds(200,200,100, 100);
	nine.setBounds(300,200,100, 100);
	zero.setBounds(100, 500, 100, 100);
	dot.setBounds(200, 500, 100, 100);
	add.setBounds(400,200,100, 100);
	sub.setBounds(400,300,100, 100);
	mul.setBounds(400,400,100, 100);
	div.setBounds(400,500,100, 100);
	eq.setBounds(400,100,100, 100);
	clear.setBounds(200, 100, 200, 100);
	back.setBounds(300, 500, 100, 100);
	exit.setBounds(100, 100, 100, 100);
		
	//Programming the buttons	
	one.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("1"));
		}
	});
	
	two.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("2"));
		}
	});
	
	three.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("3"));
		}
	});
	
	four.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("4"));
		}
	});
	
	five.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("5"));
		}
	});
	
	six.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("6"));
		}
	});
	
	seven.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("7"));
		}
	});
	
	eight.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("8"));
		}
	});
	
	nine.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("9"));
		}
	});
	
	zero.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("0"));
		}
	});
	
	add.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat(" + "));
		}
	});
	
	sub.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat(" - "));
		}
	});
	
	mul.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat(" x "));
		}
	});
	
	div.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat(" / "));
		}
	});
	
	eq.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			
			if (!tf.getText().isEmpty()){
				
				String[] arr = tf.getText().split(" ");
				
				Calc c = new Calc();
				
				tf.setText(c.cal(arr));
					
				}
			
			}
			
		
	});
	
	dot.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().concat("."));
		}
	});
	
	back.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText(tf.getText().substring(0, tf.getText().length()-1));
		}
	});
	
	clear.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		tf.setText("");
		}
	});
	
	exit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		System.exit(0);
		}
	});



		
	//adding buttons to JFrame		
	f.add(one);f.add(two);f.add(three);f.add(four);f.add(five);
	f.add(six);f.add(seven);f.add(eight);f.add(nine);f.add(add);
	f.add(sub);f.add(mul);f.add(div);f.add(eq);f.add(zero);
	f.add(dot);f.add(clear);f.add(back);f.add(exit);

	f.add(tf);
	
	f.setSize(800,800); 
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
	}  
}  
