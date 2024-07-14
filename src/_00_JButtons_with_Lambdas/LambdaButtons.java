package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((ActionEvent e)-> {
			String input1 = JOptionPane.showInputDialog("Type first number");
			String input2 = JOptionPane.showInputDialog("Type second number");
			int num1 = Integer.parseInt(input1);
			int num2 = Integer.parseInt(input2);
			
			System.out.println(num1 + num2);
			
			
			
		});
		randNumber.addActionListener((ActionEvent e)-> {
		Random 	ran = new Random();
		int random = ran.nextInt(100);
		System.out.println(random);
		
		
		});
		
		tellAJoke.addActionListener((ActionEvent e)-> {
			
			
			
				String userInput = JOptionPane.showInputDialog("Why can't they keep score in Afghanistan?");
				if(userInput.equalsIgnoreCase("Because of the tally ban") || userInput.equalsIgnoreCase("Because of the tally-ban")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					
				}else {
					JOptionPane.showMessageDialog(null, "No, because of the tally ban!");
				}
			
			
			
			
			
		});
		
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
