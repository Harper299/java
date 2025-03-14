import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class TrafficLightSimulator1 extends JFrame implements ActionListener  
{ 
    private JRadioButton redButton, yellowButton, greenButton; 
    private JLabel messageLabel; 
 
    public TrafficLightSimulator1()  
{ 
        setTitle("Traffic Light Simulator"); 
        setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        redButton = new JRadioButton("Red"); 
        yellowButton = new JRadioButton("Yellow"); 
        greenButton = new JRadioButton("Green"); 
        ButtonGroup group = new ButtonGroup(); 
        group.add(redButton); 
        group.add(yellowButton); 
        group.add(greenButton); 
        redButton.addActionListener(this); 
        yellowButton.addActionListener(this); 
        greenButton.addActionListener(this); 
 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.add(redButton); 
        buttonPanel.add(yellowButton); 
        buttonPanel.add(greenButton); 
        messageLabel = new JLabel(); 
messageLabel.setHorizontalAlignment(JLabel.CENTER); 
        messageLabel.setFont(new Font("Impact ", Font.BOLD, 30)); 
        Container container = getContentPane(); 
        container.setLayout(new BorderLayout()); 
        container.add(buttonPanel, BorderLayout.CENTER); 
        container.add(messageLabel, BorderLayout.NORTH); 
    } 
    @Override 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == redButton) { 
            messageLabel.setText("Stop"); 
            messageLabel.setForeground(Color.RED); 
        } else if (e.getSource() == yellowButton) { 
            messageLabel.setText("Ready"); 
messageLabel.setForeground(Color.YELLOW); 
        } else if (e.getSource() == greenButton) { 
            messageLabel.setText("Go"); 
            messageLabel.setForeground(Color.GREEN); 
        } 
    } 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            TrafficLightSimulator1 trafficLightSimulator = new 
TrafficLightSimulator1(); 
            trafficLightSimulator.setVisible(true); 
        }); 
    } 
} 
