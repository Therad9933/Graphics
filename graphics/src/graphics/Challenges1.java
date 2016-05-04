package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Challenges1 extends Canvas
	{
		private static final long	serialVersionUID	= 1L;	
		
		public static void main(String[] args)
			{
					Challenges1 canvas = new Challenges1();
			        JFrame frame = new JFrame();
			        frame.setSize(1000, 400);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);

			}
		public void paint (Graphics graphics)
		{
			graphics.setColor(Color.green);
			graphics.drawLine(0, 0, 665, 500);
			graphics.setColor(Color.blue);
			graphics.drawLine(0, 370, 495, 0);
			
			graphics.setColor(Color.yellow);
			graphics.drawRect(0, 0, 800, 100);
			
			graphics.setColor(Color.red);
			graphics.fillRect(525, 110, 250, 250);
			
			graphics.setColor(Color.yellow);
			graphics.fillRect(940, 320, 50, 50);
			
			graphics.setColor(Color.black);
			graphics.fillOval(50, 150, 200, 200);
			
			graphics.setColor(Color.yellow);
			graphics.fillOval(100, 200, 50, 50);
			graphics.fillOval(150, 200, 50, 50);
			graphics.fillOval(100, 260, 100, 50);
		}

	}
