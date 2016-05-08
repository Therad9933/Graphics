package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class Challenges2 extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		
		public static void main(String[] args)
			{	
				Challenges2 canvas = new Challenges2();
		        JFrame frame = new JFrame();
		        frame.setSize(400, 400);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);

			}
		public void paint (Graphics graphics)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What size would you like you square?");
				int size = userInput.nextInt();
				Scanner userChoice = new Scanner(System.in);
				System.out.println("Would you like red or blue?");
				String choice = userChoice.nextLine();
				if(choice.equals ("red"))
					{
						graphics.setColor(Color.red);
						graphics.fillRect(0, 0, size, size);
					}
				else if (choice.equals("blue"))
					{
						graphics.setColor(Color.blue);
						graphics.fillRect(0, 0, size, size);
					}		
				
				for(int red = 0; red < 255; red++)
					{
				graphics.setColor(new Color(red));
					}
				for(int red = 0; red < 255; red++)
					{
				for(int green = 0; green < 255; green++)
					{
				for(int blue = 0; blue < 255; blue++)
					{
						graphics.setColor(new Color(blue, green, blue));
						graphics.fillRect(100, 100, 100, 100);
					}
					}
					}
				
				for (int i = 0; i < 350; i++)
		        	{
			        graphics.setColor(Color.green);
			        graphics.fillRect(i, i, 20, 20);
			        
			        delay();
			        
			        graphics.setColor(Color.white);
			        graphics.fillRect(i, i, 20, 20);
		        	}
	    		}
	
	
		public void delay()
			{
	        try
					{
					Thread.sleep(50);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
			}
