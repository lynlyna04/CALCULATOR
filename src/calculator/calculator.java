package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class calculator implements ActionListener {

	private JFrame frame;
	private JTextField display;
	Double num1,num2;
	char operator;
	Double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 511, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton one = new JButton("1");
		one.setBackground(Color.LIGHT_GRAY);
		one.setBounds(42, 170, 77, 57);
		frame.getContentPane().add(one);
		one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });
		
		JButton two = new JButton("2");
		two.setBackground(Color.LIGHT_GRAY);
		two.setBounds(153, 170, 77, 57);
		frame.getContentPane().add(two);
		two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });
		
		JButton three = new JButton("3");
		three.setBackground(Color.LIGHT_GRAY);
		three.setBounds(261, 170, 77, 57);
		frame.getContentPane().add(three);
		three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });
		
		JButton plus = new JButton("+");
		plus.setBackground(Color.LIGHT_GRAY);
		plus.setBounds(376, 170, 77, 71);
		frame.getContentPane().add(plus);
		plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	num1= Double.parseDouble(display.getText());
            	operator= '+';
                display.setText("");
            }
        });
		
		JButton four = new JButton("4");
		four.setBackground(Color.LIGHT_GRAY);
		four.setBounds(42, 254, 77, 57);
		frame.getContentPane().add(four);
		four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });
		
		JButton five = new JButton("5");
		five.setBackground(Color.LIGHT_GRAY);
		five.setBounds(153, 254, 77, 57);
		frame.getContentPane().add(five);
		five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });
		
		JButton six = new JButton("6");
		six.setBackground(Color.LIGHT_GRAY);
		six.setBounds(261, 254, 77, 57);
		frame.getContentPane().add(six);
		six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });
		
		JButton seven = new JButton("7");
		seven.setBackground(Color.LIGHT_GRAY);
		seven.setBounds(42, 340, 77, 57);
		frame.getContentPane().add(seven);
		seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });
		
		JButton eight = new JButton("8");
		eight.setBackground(Color.LIGHT_GRAY);
		eight.setBounds(153, 340, 77, 57);
		frame.getContentPane().add(eight);
		eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });
		
		JButton nine = new JButton("9");
		nine.setBackground(Color.LIGHT_GRAY);
		nine.setBounds(261, 340, 77, 57);
		frame.getContentPane().add(nine);
		nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });
		
		JButton zero = new JButton("0");
		zero.setBackground(Color.LIGHT_GRAY);
		zero.setBounds(42, 427, 77, 57);
		frame.getContentPane().add(zero);
		zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
		
		JButton dot = new JButton(".");
		dot.setBackground(Color.LIGHT_GRAY);
		dot.setBounds(153, 427, 77, 57);
		frame.getContentPane().add(dot);
		dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	num1= Double.parseDouble(display.getText());
            	operator= '.';
            	display.setText(display.getText() + ".");
            }
        });
		
		JButton equal = new JButton("=");
		equal.setBackground(Color.LIGHT_GRAY);
		equal.setBounds(261, 427, 77, 57);
		frame.getContentPane().add(equal);
		equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	num2= Double.parseDouble(display.getText());
            	
            	switch (operator) {
            	case '+':
            		result= num1+num2;
            	break;
            	case '-':
            		result= num1-num2;
            	break;
            	case 'x':
            		result= num1*num2;
            	break;
            	case '/':
            		result= num1/num2;
            	break;
            	}
            	
            	display.setText(String.valueOf(result));
            	
            }
        });
		
		
		
		JButton min = new JButton("-");
		min.setBackground(Color.LIGHT_GRAY);
		min.setBounds(376, 252, 77, 71);
		frame.getContentPane().add(min);
		min.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	num1= Double.parseDouble(display.getText());
            	operator= '-';
                display.setText("");
            }
        });
		
		JButton multi = new JButton("x");
		multi.setBackground(Color.LIGHT_GRAY);
		multi.setBounds(376, 333, 77, 71);
		frame.getContentPane().add(multi);
		multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	num1= Double.parseDouble(display.getText());
            	operator= 'x';
                display.setText("");
            }
        });
		
		JButton div = new JButton("/");
		div.setBackground(Color.LIGHT_GRAY);
		div.setBounds(376, 415, 77, 71);
		frame.getContentPane().add(div);
		div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	num1= Double.parseDouble(display.getText());
            	operator= '/';
                display.setText("");
            }
        });
		
		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.PLAIN, 16));
		display.setBounds(42, 44, 411, 66);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton deel = new JButton("del");
		deel.setBackground(Color.LIGHT_GRAY);
		deel.setBounds(391, 121, 62, 38);
		frame.getContentPane().add(deel);
		deel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
		
		JButton ng = new JButton("(-)");
		ng.setBackground(Color.LIGHT_GRAY);
		ng.setBounds(42, 121, 62, 38);
		frame.getContentPane().add(ng);
		ng.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double temp = Double.parseDouble(display.getText());
                temp*= -1;
                display.setText(String.valueOf(temp));
                		
            }
        });
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
