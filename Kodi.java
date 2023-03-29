package Programimi1;

import java.awt.*;
import javax.swing.*;

public class Project extends JFrame{


	    public Project() {
	        setSize(300, 300);
	        setVisible(true);
	    }

	    public void printCircles(Graphics g) {
	    	//prints 4 cocentric cirrcles
	    			super.paint(g);
	    			g.setColor(Color.black);
					g.drawOval(40, 40, 200-80, 200-80);
					g.drawOval(50, 50, 200-100, 200-100);
					g.drawOval(60, 60, 200-120, 200-120);
					g.drawOval(80, 80, 200-160, 200-160);;
					
					
					
		}
		public void printCube(Graphics g) {
			//transparent 3d cube
			super.paint(g);
					g.setColor(Color.black);	
					g.drawRect(100, 100, 50, 50);
					g.drawLine(100, 100, 125, 75);
					g.drawLine(150, 100, 175, 75);
					g.drawRect(125, 75, 50, 50);
					g.drawLine(100, 150, 125, 125);
					g.drawLine(150, 150, 175, 125);
					
					
		}
		public void printEggs(Graphics g) {
			//3 eees on top of eachother
			super.paint(g);
					g.setColor(Color.black);
					g.drawOval(100, 55, 50, 75);
					g.drawOval(100, 130, 50, 75);
					g.drawOval(100, 205, 50, 75);
					
		}
		public void printSnowman(Graphics g) {
			//a snowman with a black top hat
			super.paint(g);
					g.setColor(Color.black);
					g.drawOval(100, 100, 26, 26);
					g.drawOval(90, 126, 46, 46);
					g.drawOval(80, 172, 66, 66);
					g.drawLine(90, 100, 90+46, 100);
					g.fillRect(100, 75, 25, 25);
					
		}
		public void printCheckers(Graphics g) {
			//red and black checkers
			super.paint(g);
					g.setColor(Color.red);
					g.fillRect(50, 50, 100, 100);
					g.setColor(Color.black);
					g.fillRect(50, 50, 25, 25);
					g.fillRect(100, 50, 25, 25);
					g.fillRect(75, 75, 25, 25);
					g.fillRect(100, 100, 25, 25);
					g.fillRect(125, 75, 25, 25);
					g.fillRect(50, 100, 25, 25);
					g.fillRect(75, 125, 25, 25);
					g.fillRect(125, 125, 25, 25);
					
		}
		public void printBullseye(Graphics g) {
			//alternating red and yellow bullseye on a black background
			super.paint(g);
					g.setColor(Color.black);
					g.fillRect(0, 0, 300, 300);
					g.setColor(Color.red);
					g.fillOval(30, 30, 200-60, 200-60);
					g.setColor(Color.yellow);
					g.fillOval(50, 50, 200-100, 200-100);
					g.setColor(Color.red);
					g.fillOval(70, 70, 200-140, 200-140);
					g.setColor(Color.yellow);
					g.fillOval(90, 90, 200-180, 200-180);
					g.setColor(Color.red);
					g.fillOval(110, 110, 200-220, 200-220);
					
		}
		public void printInitials(Graphics g) {
		    // prints initials on a yellow background
			super.paint(g);
				g.setColor(Color.YELLOW);
				g.fillRect(0, 0, getWidth(), getHeight());
				Font font = new Font("Arial", Font.BOLD, 72);
				g.setFont(font);
				g.setColor(Color.BLUE);
				g.drawString("G", 50, 100);
				g.drawString("A", 150, 100);
				
		}
		public void printCards(Graphics g) {
			  // prints the 4 card symbols
			super.paint(g);
				g.setColor(Color.BLACK);
				g.drawString("\u2666", 50, 100);
				g.drawString("\u2665", 150, 100);
				g.drawString("\u2660", 50, 200);
				g.drawString("\u2663", 150, 200);
		}
		public void printHouse(Graphics g) {
			 // prints a pink house with a red door on green grass with a blue sky
			super.paint(g);
		    	g.setColor(Color.BLUE);
		    	g.fillRect(0, 0, getWidth(), getHeight());
		    	g.setColor(Color.GREEN);
		    	g.fillRect(0, 250, 300, 50);
		    	g.setColor(Color.PINK);
		    	g.fillRect(100, 150, 100, 100);
		    	g.setColor(Color.RED);
		    	g.fillRect(130, 200, 30, 50);
		    	g.fillArc(100, 100, 100, 100, 0, 180);
		    	
		}
		
	    public static void main(String[] args) {
	        Project frame = new Project();
	        Graphics g = frame.getGraphics();
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printCircles(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printCube(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printEggs(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printSnowman(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printCheckers(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printBullseye(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printInitials(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printCards(g);
	        try { Thread.sleep(2000);}
	        catch (InterruptedException e) {}
	        frame.printHouse(g);
	    }
	}
	