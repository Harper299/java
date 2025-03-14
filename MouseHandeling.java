import java.awt.*; 
import java.awt.event.*; 
class MyFrame extends Frame { 
    String event; 
    public MyFrame(String title) { 
        super(title); 
        addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
                event = "Mouse Clicked"; 
                repaint(); 
            } 
            public void mousePressed(MouseEvent e) { 
                event = "Mouse Pressed"; 
                repaint(); 
            } 
            public void mouseReleased(MouseEvent e) { 
                event = "Mouse Released"; 
                repaint(); 
            } 
            public void mouseEntered(MouseEvent e) { 
                event = "Mouse Entered"; 
                repaint(); 
            } 
            public void mouseExited(MouseEvent e) { 
                event = "Mouse Exited"; 
                repaint(); 
            } 
        }); 
        setSize(400, 400); 
        setVisible(true); 
    } 
    public void paint(Graphics g) { 
        // Clear the previous event 
        g.clearRect(0, 0, getWidth(), getHeight()); 
        // Get the center coordinates of the window 
        int centerX = getWidth() / 2; 
        int centerY = getHeight() / 2; 
        // Set font and color for displaying the event name 
        g.setFont(new Font("Times New Roman", Font.BOLD, 30)); 
        g.setColor(Color.RED); 
        // Draw the event name at the center of the window 
        g.drawString(event, centerX - 50, centerY); 
    } 
} 
public class MouseEventDemo { 
    public static void main(String[] args) { 
        new MyFrame("Mouse Event Demo"); 
    } 
} 
