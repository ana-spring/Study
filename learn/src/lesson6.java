// Hello



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Currency;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class lesson6 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Блокнот");
		frame.add( new HelloComponent2("Привет! Как ты?"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // операция закрытие (крестик)
		frame.setSize(300, 400); // размер окна
		frame.setVisible( true);

	}// end of main
}//end of class


class HelloComponent2 extends JComponent
    implements MouseMotionListener, ActionListener, Runnable

    {
	
	String theMessage;
	int messageX = 150, messageY = 95; // координаты для точки
	
	JButton theButton;
	
	int colorIndex;
	static Color[] someColors = {
			Color.orange, Color.red, Color.blue, Color.pink};
	
	
	public HelloComponent2 ( String message) {
		theMessage = message;
		addMouseMotionListener (this); // указать на текущий объект
	
	 
	theButton = new JButton (" Change Color");
	setLayout (new FlowLayout ());
	add (theButton);
	theButton.addActionListener(this);
	
	}
	
	
 public void paintComponent ( Graphics g) {
	 g.drawString(theMessage, messageX, messageY);
 }

 public void mouseDragged(MouseEvent e) { //событие приперетаскивании мышкой
	 // save the mouse coordinates and paint the message
	 messageX = e.getX();
	 messageY = e.getY();
	 repaint();
 }
 
 public void mouseMoved (MouseEvent e) {
	 
 }

 public void actionPerformed (ActionEvent e) {
	 if (e.getSource() == theButton)
		 changeColor ();
 };
 
 synchronized private void changeColor () {
	 if (++colorIndex == someColors.length)
		 colorIndex = 0;
	 setForeground(currentColor());
	 repaint();
 }

	synchronized private Color currentColor() {
		return someColors [colorIndex];
	}
 
  
 
	
	
	
	
	
	
	
 
 
 
 }// eng of class














