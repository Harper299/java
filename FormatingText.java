import javax.swing.*; 
import javax.swing.event.ChangeEvent; 
import javax.swing.event.ChangeListener; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class TextEditorWithFormatting extends JFrame { 
    private JTextArea textArea; 
    private JSlider sizeSlider; 
    private JCheckBox boldCheckBox; 
    private JCheckBox italicCheckBox; 
 
    public TextEditorWithFormatting() { 
        // Set up the frame 
        setTitle("Text Editor with Formatting"); 
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout()); 
        // Create and add text area 
        textArea = new JTextArea("Type your text here..."); 
        textArea.setFont(new Font("Arial", Font.PLAIN, 14)); 
        JScrollPane scrollPane = new JScrollPane(textArea); 
        add(scrollPane, BorderLayout.CENTER); 
        // Create and add controls panel 
        JPanel controlsPanel = new JPanel(); 
        sizeSlider = new JSlider(8, 36, 14); 
        boldCheckBox = new JCheckBox("Bold"); 
        italicCheckBox = new JCheckBox("Italic"); 
        sizeSlider.addChangeListener(new ChangeListener() { 
            @Override 
            public void stateChanged(ChangeEvent e) { 
                int newSize = sizeSlider.getValue(); 
                Font currentFont = textArea.getFont(); 
                textArea.setFont(new Font(currentFont.getFontName(), 
currentFont.getStyle(), newSize)); 
            } 
        }); 
        boldCheckBox.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                applyFontStyle(); 
            } 
        }); 
        italicCheckBox.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                applyFontStyle(); 
            } 
        }); 
        controlsPanel.add(new JLabel("Font Size:")); 
        controlsPanel.add(sizeSlider); 
        controlsPanel.add(boldCheckBox); 
        controlsPanel.add(italicCheckBox); 
        add(controlsPanel, BorderLayout.SOUTH); 
    } 
    private void applyFontStyle() { 
        int style = Font.PLAIN; 
        if (boldCheckBox.isSelected()) { 
            style |= Font.BOLD; 
        } 
        if (italicCheckBox.isSelected()) { 
            style |= Font.ITALIC; 
        } 
        Font currentFont = textArea.getFont(); 
        textArea.setFont(new Font(currentFont.getFontName(), style, 
currentFont.getSize())); 
    } 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() { 
            @Override 
            public void run() { 
                TextEditorWithFormatting app = new TextEditorWithFormatting(); 
                app.setVisible(true); 
            } 
        }); 
    } 
} 
